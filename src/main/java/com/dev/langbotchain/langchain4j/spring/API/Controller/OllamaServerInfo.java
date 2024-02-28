package com.dev.langbotchain.langchain4j.spring.API.Controller;

import com.dev.langbotchain.langchain4j.spring.API.Service.OllamaServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/OllamaServerInfo")

public class OllamaServerInfo {
        private final OllamaServerService ollamaServerService;

        @Autowired
        public OllamaServerInfo(OllamaServerService ollamaServerService) {
            this.ollamaServerService = ollamaServerService;
        }

    @GetMapping("/listModels")
    public List<OllamaServerService.OllamaModelInfo> listAllOllamaModels() throws IOException, InterruptedException {
            return ollamaServerService.listAllOllamaModels();
    }

    @GetMapping("/removeModel")
    public String listAllOllamaModels(@RequestParam String model) throws IOException, InterruptedException {
        return ollamaServerService.removeModel(model);
    }

    @PostMapping("/pullModel")
    public String pullModel(@RequestParam String modelName) throws IOException, InterruptedException {
        return ollamaServerService.pullModel(modelName);
    }
}
