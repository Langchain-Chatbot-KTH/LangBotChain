package com.dev.langbotchain.langchain4j.spring.Generation.Document;

import com.dev.langbotchain.langchain4j.spring.Generation.Agents.GeneralAgent;
import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.Model;
import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.ModelList;
import dev.langchain4j.data.document.Document;
import dev.langchain4j.data.document.DocumentParser;
import dev.langchain4j.data.document.parser.TextDocumentParser;
import dev.langchain4j.data.document.parser.apache.pdfbox.ApachePdfBoxDocumentParser;
import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.rag.content.retriever.ContentRetriever;
import dev.langchain4j.service.AiServices;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.testcontainers.shaded.org.apache.commons.io.FilenameUtils;

import java.io.IOException;
import java.io.InputStream;

import static com.dev.langbotchain.langchain4j.spring.Config.OllamaServerConfig.OllamaServerCheck.checkOllamaServerAndInitializeModel;
import static com.dev.langbotchain.langchain4j.spring.Generation.ContentRetriver.ContentRetriverObject.createContentRetriever;
import static com.dev.langbotchain.langchain4j.spring.Generation.Document.InitializeDocumentByModel.initializeModel;

@Component
public class DocumentToTextGeneration {
    private GeneralAgent assistant;

    public String generateTextWithDocument(String question, MultipartFile document, String modelName) throws IOException {

        Model modelObject = ModelList.findModelByName(modelName);
        checkOllamaServerAndInitializeModel(modelObject);
        initializeTextWithDocument(document, modelObject);
        String answer = String.valueOf(chat(question));
        return answer;
    }

    private DocumentParser createDocumentParser(MultipartFile userDocument) throws UnsupportedOperationException {
        if (userDocument != null) {
            String extension = FilenameUtils.getExtension(userDocument.getOriginalFilename());
            switch (extension) {
                case "pdf":
                    return new ApachePdfBoxDocumentParser();
                case "txt":
                    return new TextDocumentParser();
                default:
                    throw new UnsupportedOperationException("Not supporting this filetype: " + extension);
            }
        } else {
            throw new IllegalArgumentException("Both userDocument cannot be null");
        }
    }

    void initializeTextWithDocument(MultipartFile userDocument, Model model) throws IOException {
        ChatMemory chatMemory = MessageWindowChatMemory.withMaxMessages(10);

        DocumentParser documentParser = createDocumentParser(userDocument);

        //This parses the Multipartfile from the request to a Document which is needed for the langchain4j splitter
        InputStream fileInputStream = userDocument.getInputStream();
        Document document = documentParser.parse(fileInputStream);
        fileInputStream.close();

        ContentRetriever contentRetriever = createContentRetriever(document);

        // The final step is to build our AI Service,
        // configuring it to use the components we've created above.

        assistant = AiServices.builder(GeneralAgent.class)
                .chatLanguageModel(initializeModel(model))
                .contentRetriever(contentRetriever)
                .chatMemory(chatMemory)
                .build();

    }
    private String chat(String message) {
        return assistant.chat(message);
    }
}
