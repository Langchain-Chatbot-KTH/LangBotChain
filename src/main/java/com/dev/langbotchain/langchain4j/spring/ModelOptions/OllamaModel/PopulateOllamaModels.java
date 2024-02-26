package com.dev.langbotchain.langchain4j.spring.ModelOptions.OllamaModel;

import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.SupportedModelProperties;
import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.Model;

import java.util.ArrayList;

public class PopulateOllamaModels {
    public static void populateOllamaModels(ArrayList<Model> models){
        ArrayList<SupportedModelProperties> ollamaProperties = new ArrayList<>();
        ollamaProperties.add(SupportedModelProperties.embeddingModel);
        ollamaProperties.add(SupportedModelProperties.streamingLanguageModel);
        ollamaProperties.add(SupportedModelProperties.languageModel);
        ollamaProperties.add(SupportedModelProperties.streamingChatModel);
        ollamaProperties.add(SupportedModelProperties.chatModel);

        //Instruct: 	Fine-tuned to generate helpful and safe answers in natural language
        //Python: 	A specialized variation of further fine-tuned on tokens of Python code
        //Code: 	Base model for code completion

        // ---------- GENERAL Models  ----------

        //Llama - Llama 2 is a collection of foundation language models ranging from 7B to 70B parameters. https://ollama.com/library/llama2
        models.add(new Model("llama2", ollamaProperties, "langchain4j/ollama-llama2:latest", 3.800));
        models.add(new Model("llama2:13b", ollamaProperties, "langchain4j/ollama-llama2:13b:latest", 7.300));
        models.add(new Model("llama2:70b", ollamaProperties, "langchain4j/ollama-llama2:70b:latest", 39.00));

        //Mistral - Mistral is a 7.3B parameter model, distributed with the Apache license. It is available in both instruct (instruction following) and text completion. https://ollama.com/library/mistral
        models.add(new Model("mistral:7.3b", ollamaProperties, "langchain4j/ollama-mistral:latest", 4.100));
        models.add(new Model("mistral:instruct", ollamaProperties, "langchain4j/ollama-mistral:instruct:latest", 4.100));

        //Mixtral - A high-quality Mixture of Experts (MoE) model with open weights by Mistral AI. https://ollama.com/library/mixtral
        models.add(new Model("mixtral", ollamaProperties, "langchain4j/ollama-mixtral:latest", 26.00));
        models.add(new Model("mixtral:instruct", ollamaProperties, "langchain4j/ollama-mixtral:instruct:latest", 26.00));

        //Phi-2 - a 2.7B language model by Microsoft Research that demonstrates outstanding reasoning and language understanding capabilities. https://ollama.com/library/phi
        models.add(new Model("phi", ollamaProperties, "langchain4j/ollama-phi:latest", 1.700));

        //Neural Chat - A fine-tuned model based on Mistral with good coverage of domain and language. https://ollama.com/library/neural-chat
        models.add(new Model("neural-chat", ollamaProperties, "langchain4j/ollama-neural-chat:latest", 4.100));

        //Starling LM - Starling is a large language model trained by reinforcement learning from AI feedback focused on improving chatbot helpfulness. https://ollama.com/library/starling-lm
        models.add(new Model("starling-lm", ollamaProperties, "langchain4j/ollama-starling-lm:latest", 4.100));

        //zephyr - Zephyr beta is a fine-tuned 7B version of mistral that was trained on on a mix of publicly available, synthetic datasets. https://ollama.com/library/zephyr
        models.add(new Model("zephyr", ollamaProperties, "langchain4j/ollama-zephyr:latest", 4.100));

        //Orca - A general-purpose model ranging from 3 billion parameters to 70 billion, suitable for entry-level hardware. https://ollama.com/library/orca-mini
        models.add(new Model("orca-mini", ollamaProperties, "langchain4j/ollama-orca-mini:latest", 1.900));
        models.add(new Model("orca-mini:7b", ollamaProperties, "langchain4j/ollama-orca-mini:7b:latest", 3.800));
        models.add(new Model("orca-mini:13b", ollamaProperties, "langchain4j/ollama-orca-mini:13b:latest", 7.400));
        models.add(new Model("orca-mini:70b", ollamaProperties, "langchain4j/ollama-orca-mini:70b:latest", 39.00));

        //Vicuna - General use chat model based on Llama and Llama 2 with 2K to 16K context sizes. https://ollama.com/library/vicuna
        models.add(new Model("vicuna", ollamaProperties, "langchain4j/ollama-vicuna:latest", 3.800));
        models.add(new Model("vicuna:13b", ollamaProperties, "langchain4j/ollama-vicuna:13b:latest", 7.400));
        models.add(new Model("vicuna:33b", ollamaProperties, "langchain4j/ollama-vicuna:33b:latest", 18.00));

        //Llava - vision encoder and Vicuna for general-purpose visual and language understanding. https://ollama.com/library/llava
        models.add(new Model("llava:7b", ollamaProperties, "langchain4j/ollama-ollama-llava:latest", 4.500));
        models.add(new Model("llava:13b", ollamaProperties, "langchain4j/ollama-llava:13b:latest", 8.000));
        models.add(new Model("llava:34b", ollamaProperties, "langchain4j/ollama-llava:34b:latest", 34.00));

        //Google Gemma - Gemma is a family of lightweight, state-of-the-art open models built by Google DeepMind. https://ollama.com/library/gemma
        models.add(new Model("gemma:2b", ollamaProperties, "langchain4j/ollama-gemma:2b:latest", 1.400));
        models.add(new Model("gemma:7b", ollamaProperties, "langchain4j/ollama-gemma:7b:latest", 4.800));
        models.add(new Model("gemma:instruct", ollamaProperties, "samuelteg/gemma:instruct", 5.200));

        //openhermes - OpenHermes 2.5 is a 7B model fine-tuned by Teknium on Mistral with fully open datasets. https://ollama.com/library/openhermes
        models.add(new Model("openhermes", ollamaProperties, "langchain4j/ollama-openhermes:latest", 4.100));

        //tinyllama - The TinyLlama project is an open endeavor to train a compact 1.1B Llama model on 3 trillion tokens. https://ollama.com/library/tinyllama
        models.add(new Model("tinyllama", ollamaProperties, "langchain4j/ollama-tinyllama:latest", 0.638));

        //openchat - A family of open-source models trained on a wide variety of data, surpassing ChatGPT on various benchmarks. Updated to version 3.5-0106. https://ollama.com/library/openchat
        models.add(new Model("openchat", ollamaProperties, "langchain4j/ollama-openchat:latest", 4.100));

        //orca2 - Orca 2 is built by Microsoft research, and are a fine-tuned version of Meta's Llama 2 models. The model is designed to excel particularly in reasoning. https://ollama.com/library/orca2
        models.add(new Model("orca2", ollamaProperties, "langchain4j/ollama-orca2:latest", 4.100));
        models.add(new Model("orca2:13b", ollamaProperties, "langchain4j/ollama-orca2:13b:latest", 7.800));

        //falcon - A large language model built by the Technology Innovation Institute (TII) for use in summarization, text generation, and chat bots. https://ollama.com/library/falcon
        models.add(new Model("falcon", ollamaProperties, "langchain4j/ollama-falcon:latest", 4.100));
        models.add(new Model("falcon:40b", ollamaProperties, "langchain4j/ollama-falcon:40b:latest", 24.00));
        models.add(new Model("falcon:180b", ollamaProperties, "langchain4j/ollama-falcon:180b:latest", 101.00));
        models.add(new Model("falcon:instruct", ollamaProperties, "langchain4j/ollama-falcon:instruct:latest", 4.100));
        models.add(new Model("falcon:40b-instruct", ollamaProperties, "langchain4j/ollama-falcon:40b-instruct:latest", 24.00));
        models.add(new Model("falcon:180b-instruct", ollamaProperties, "langchain4j/ollama-falcon:180b-instruct:latest", 101.00));

        //everythinglm - The Everything Language Model is a Llama 2-based model with a 16k context released by Totally Not An LLM (Kai Howard). It was trained with the EverythingLM Dataset and is uncensored. https://ollama.com/library/everythinglm
        models.add(new Model("everythinglm", ollamaProperties, "langchain4j/ollama-everythinglm:latest", 7.400));

        //bakllava - BakLLaVA is a multimodal model consisting of the Mistral 7B base model augmented with the LLaVA architecture. https://ollama.com/library/bakllava
        models.add(new Model("bakllava", ollamaProperties, "langchain4j/ollama-bakllava:latest", 7.400));

        //solar - A compact, yet powerful 10.7B large language model designed for single-turn conversation. https://ollama.com/library/solar
        models.add(new Model("solar", ollamaProperties, "langchain4j/ollama-solar:latest", 6.100));

        //stable-beluga - Llama 2 based model fine tuned on an Orca-style dataset. Originally called Free Willy. https://ollama.com/library/stable-beluga
        models.add(new Model("stable-beluga", ollamaProperties, "langchain4j/ollama-stable-beluga:latest", 3.800));
        models.add(new Model("stable-beluga:13b", ollamaProperties, "langchain4j/ollama-stable-beluga:13b:latest", 7.400));
        models.add(new Model("stable-beluga:70b", ollamaProperties, "langchain4j/ollama-stable-beluga:70b:latest", 39.00));

        //yarn-mistral - An extension of Mistral to support context windows of 64K or 128K. https://ollama.com/library/yarn-mistral
        models.add(new Model("yarn-mistral", ollamaProperties, "langchain4j/ollama-yarn-mistral:latest", 4.100));

        //samantha-mistral - A companion assistant trained in philosophy, psychology, and personal relationships. Based on Mistral. https://ollama.com/library/samantha-mistral
        models.add(new Model("samantha-mistral", ollamaProperties, "langchain4j/ollama-samantha-mistral:latest", 4.100));

        //stablelm-zephyr - A lightweight chat model allowing accurate, and responsive output without requiring high-end hardware. https://ollama.com/library/stablelm-zephyr
        models.add(new Model("stablelm-zephyr", ollamaProperties, "langchain4j/ollama-stablelm-zephyr:latest", 1.600));

        //wizard-vicuna - Wizard Vicuna is a 13B parameter model based on Llama 2 trained by MelodysDreamj. https://ollama.com/library/wizard-vicuna
        models.add(new Model("wizard-vicuna", ollamaProperties, "langchain4j/ollama-wizard-vicuna:latest", 7.400));

        //yarn-llama2 - An extension of Llama 2 that supports a context of up to 128k tokens. https://ollama.com/library/yarn-llama2
        models.add(new Model("yarn-llama2", ollamaProperties, "langchain4j/ollama-yarn-llama2:latest", 3.800));
        models.add(new Model("yarn-llama2:13b", ollamaProperties, "langchain4j/ollama-yarn-llama2:13b:latest", 7.400));

        //notux - A top-performing mixture of experts model, fine-tuned with high-quality data. https://ollama.com/library/notux
        models.add(new Model("notux", ollamaProperties, "langchain4j/ollama-notux:latest", 26.00));

        //alfred - A robust conversational model designed to be used for both chat and instruct use cases. https://ollama.com/library/alfred
        models.add(new Model("alfred", ollamaProperties, "langchain4j/ollama-alfred:latest", 24.00));

        //megadolphin - MegaDolphin-2.2-120b is a transformation of Dolphin-2.2-70b created by interleaving the model with itself. https://ollama.com/library/megadolphin
        models.add(new Model("megadolphin", ollamaProperties, "langchain4j/ollama-megadolphin:latest", 68.00));

        //wizardlm - General use 70 billion parameter model based on Llama 2. https://ollama.com/library/wizardlm
        models.add(new Model("wizardlm:7b-q4_0", ollamaProperties, "langchain4j/ollama-wizardlm:7b-q4_0:latest", 3.800));

        // ---- Long Context (32K) ----

        //mistrallite - MistralLite is a fine-tuned model based on Mistral with enhanced capabilities of processing long contexts. https://ollama.com/library/mistrallite
        models.add(new Model("mistrallite", ollamaProperties, "langchain4j/ollama-mistrallite:latest", 3.800));

        // ----------------------------


        // ----------------------------------


        // ---------- CODE Models  ----------

        //CodeLlama - A large language model that can use text prompts to generate and discuss code. https://ollama.com/library/codellama
        models.add(new Model("codellama", ollamaProperties, "langchain4j/ollama-codellama:latest", 3.800));
        models.add(new Model("codellama:instruct", ollamaProperties, "langchain4j/ollama-codellama:instruct:latest", 3.800));
        models.add(new Model("codellama:13b-instruct", ollamaProperties, "langchain4j/ollama-codellama:13b-instruct:latest", 7.400));
        models.add(new Model("codellama:34b-instruct", ollamaProperties, "langchain4j/ollama-codellama:34b-instruct:latest", 19.00));
        models.add(new Model("codellama:70b-instruct", ollamaProperties, "langchain4j/ollama-codellama:70b-instruct:latest", 39.00));
        models.add(new Model("codellama:13b-code", ollamaProperties, "langchain4j/ollama-codellama:13b-code:latest", 7.400));
        models.add(new Model("codellama:34b-code", ollamaProperties, "langchain4j/ollama-codellama:34b-code:latest", 19.00));
        models.add(new Model("codellama:70b-code", ollamaProperties, "langchain4j/ollama-codellama:70b-code:latest", 39.00));
        models.add(new Model("codellama:13b", ollamaProperties, "langchain4j/ollama-codellama:13b:latest", 7.400));
        models.add(new Model("codellama:34b", ollamaProperties, "langchain4j/ollama-codellama:34b:latest", 19.00));
        models.add(new Model("codellama:70b", ollamaProperties, "langchain4j/ollama-codellama:70b:latest", 39.00));
        models.add(new Model("codellama:13b-python", ollamaProperties, "langchain4j/ollama-codellama:13b-python:latest", 7.400));
        models.add(new Model("codellama:34b-python", ollamaProperties, "langchain4j/ollama-codellama:34b-python:latest", 19.00));
        models.add(new Model("codellama:70b-python", ollamaProperties, "langchain4j/ollama-codellama:70b-python:latest", 39.00));

        //deepseek-coder - DeepSeek Coder is a capable coding model trained on two trillion code and natural language tokens. https://ollama.com/library/deepseek-coder
        models.add(new Model("deepseek-coder", ollamaProperties, "samuelteg/deepseek-coder:latest", 0.776));
        models.add(new Model("deepseek-coder:6.7b", ollamaProperties, "langchain4j/ollama-deepseek-coder:6.7b:latest", 3.800));
        models.add(new Model("deepseek-coder:33b", ollamaProperties, "langchain4j/ollama-deepseek-coder:33b:latest", 19.00));

        //wizardcoder - State-of-the-art code generation model. https://ollama.com/library/wizardcoder
        models.add(new Model("wizardcoder", ollamaProperties, "langchain4j/ollama-wizardcoder:latest", 3.800));
        models.add(new Model("wizardcoder:13b", ollamaProperties, "langchain4j/ollama-wizardcoder:13b:latest", 7.400));
        models.add(new Model("wizardcoder:33b", ollamaProperties, "langchain4j/ollama-wizardcoder:33b:latest", 19.00));

        //phind-codellama - Phind CodeLlama is a code generation model based on CodeLlama 34B fine-tuned for instruct use cases. https://ollama.com/library/phind-codellama
        models.add(new Model("phind-codellama", ollamaProperties, "langchain4j/ollama-phind-codellama:latest", 19.00));
        models.add(new Model("phind-codellama:34b-python", ollamaProperties, "langchain4j/ollama-phind-codellama:34b-python:latest", 19.00));

        //codeup - Great code generation model based on Llama2. https://ollama.com/library/codeup
        models.add(new Model("codeup", ollamaProperties, "langchain4j/ollama-codeup:latest", 3.800));
        models.add(new Model("codeup:13b", ollamaProperties, "langchain4j/ollama-codeup:13b:latest", 7.400));

        //starcoder - StarCoder is a code generation model trained on 80+ programming languages. https://ollama.com/library/starcoder
        models.add(new Model("starcoder", ollamaProperties, "langchain4j/ollama-starcoder:latest", 1.800));
        models.add(new Model("starcoder:1b", ollamaProperties, "langchain4j/ollama-starcoder:1b:latest", 0.726));
        models.add(new Model("starcoder:3b", ollamaProperties, "langchain4j/ollama-starcoder:3b:latest", 1.800));
        models.add(new Model("starcoder:7b", ollamaProperties, "langchain4j/ollama-starcoder:7b:latest", 4.300));
        models.add(new Model("starcoder:15b", ollamaProperties, "langchain4j/ollama-starcoder:15b:latest", 9.000));

        //stable-code - Stable Code 3B is a model offering accurate and responsive code completion at a level on par with models such as CodeLLaMA 7B that are 2.5x larger. https://ollama.com/library/stable-code
        models.add(new Model("stable-code", ollamaProperties, "langchain4j/ollama-stable-code:latest", 1.600));

        //magicoder - 🎩 Magicoder is a family of 7B parameter models trained on 75K synthetic instruction data using OSS-Instruct, a novel approach to enlightening LLMs with open-source code snippets. https://ollama.com/library/magicoder
        models.add(new Model("magicoder", ollamaProperties, "langchain4j/ollama-magicoder:latest", 3.800));

        //codebooga - A high-performing code instruct model created by merging two existing code models. https://ollama.com/library/codebooga
        models.add(new Model("codebooga", ollamaProperties, "langchain4j/ollama-codebooga:latest", 19.00));

        // ---- Function Calling Tasks ----

        //nexusraven - Nexus Raven is a 13B instruction tuned model for function calling tasks. ==> https://ollama.com/library/nexusraven
        models.add(new Model("nexusraven", ollamaProperties, "langchain4j/ollama-nexusraven:latest", 19.00));

        // ----------------------------------------

        // ---------- Math CODE Models  ----------

        //math - An advanced language model crafted with 2 trillion bilingual tokens. https://ollama.com/library/deepseek-llm
        models.add(new Model("deepseek-llm", ollamaProperties, "langchain4j/ollama-deepseek-llm:latest", 4.000));
        models.add(new Model("deepseek-llm:67b", ollamaProperties, "langchain4j/ollama-deepseek-llm:67b:latest", 38.00));

        //llama-pro - An expansion of Llama 2 that specializes in integrating both general language understanding and domain-specific knowledge, particularly in programming and mathematics. https://ollama.com/library/llama-pro
        models.add(new Model("llama-pro", ollamaProperties, "langchain4j/ollama-llama-pro:latest", 4.700));
        models.add(new Model("llama-pro:instruct", ollamaProperties, "langchain4j/ollama-llama-pro:instruct:latest", 4.700));

        // ---------------------------------------

        // ---------- SQL Models  ----------

        //sqlcoder - SQLCoder is a code completion model fined-tuned on StarCoder for SQL generation tasks. https://ollama.com/library/sqlcoder
        models.add(new Model("sqlcoder", ollamaProperties, "langchain4j/ollama-sqlcoder:latest", 4.100));
        models.add(new Model("sqlcoder:15b", ollamaProperties, "langchain4j/ollama-sqlcoder:15b:latest", 9.000));

        //duckdb-nsql  - 7B parameter text-to-SQL model made by MotherDuck and Numbers Station. https://ollama.com/library/duckdb-nsql
        models.add(new Model("duckdb-nsql", ollamaProperties, "langchain4j/ollama-duckdb-nsql:latest", 3.800));

        // ----------------------------------

        // ---------- Uncensored Models  ----------

        //llama2-uncensored - Uncensored Llama 2 model by George Sung and Jarrad Hope. https://ollama.com/library/llama2-uncensored
        models.add(new Model("llama2-uncensored", ollamaProperties, "langchain4j/ollama-llama2-uncensored:latest", 3.800));
        models.add(new Model("llama2-uncensored:70b", ollamaProperties, "langchain4j/ollama-llama2-uncensored:70b:latest", 40.800));

        //dolphin-mistral - The uncensored Dolphin model based on Mistral that excels at coding tasks. Updated to version 2.6. https://ollama.com/library/dolphin-mistral
        models.add(new Model("dolphin-mistral", ollamaProperties, "langchain4j/ollama-dolphin-mistral:latest", 4.100));

        //Mistral-openorca - Mistral OpenOrca is a 7 billion parameter model, fine-tuned on top of the Mistral 7B model using the OpenOrca dataset. https://ollama.com/library/mistral-openorca
        models.add(new Model("mistral-openorca", ollamaProperties, "langchain4j/ollama-mistral-openorca:latest", 4.100));

        //dolphin-mixtral - An uncensored, fine-tuned model based on the Mixtral mixture of experts model that excels at coding tasks. Created by Eric Hartford. https://ollama.com/library/dolphin-mixtral
        models.add(new Model("dolphin-mixtral", ollamaProperties, "langchain4j/ollama-dolphin-mixtral:latest", 26.00));

        //dolphin-phi - 2.7B uncensored Dolphin model by Eric Hartford, based on the Phi language model by Microsoft Research. https://ollama.com/library/dolphin-phi
        models.add(new Model("dolphin-phi", ollamaProperties, "langchain4j/ollama-dolphin-phi:latest", 1.600));

        //wizard-vicuna-uncensored - Wizard Vicuna Uncensored is a 7B, 13B, and 30B parameter model based on Llama 2 uncensored by Eric Hartford. https://ollama.com/library/wizard-vicuna-uncensored
        models.add(new Model("wizard-vicuna-uncensored", ollamaProperties, "langchain4j/wizard-vicuna-uncensored:latest", 3.800));
        models.add(new Model("wizard-vicuna-uncensored:13b", ollamaProperties, "langchain4j/wizard-vicuna-uncensored:13b:latest", 7.400));
        models.add(new Model("wizard-vicuna-uncensored:30b", ollamaProperties, "langchain4j/ollama-wizard-vicuna-uncensored:30b:latest", 18.00));

        //tinydolphin - An experimental 1.1B parameter model trained on the new Dolphin 2.8 dataset by Eric Hartford and based on TinyLlama. https://ollama.com/library/tinydolphin
        models.add(new Model("tinydolphin", ollamaProperties, "langchain4j/ollama-tinydolphin:latest", 0.647));

        //wizardlm-uncensored - Uncensored version of Wizard LM model. https://ollama.com/library/wizardlm-uncensored
        models.add(new Model("wizardlm-uncensored", ollamaProperties, "langchain4j/ollama-wizardlm-uncensored:latest", 7.400));

        // ---------- Non English  ----------

        // ---- CHINESE ----

        //llama2-chinese - Llama 2 based model fine tuned to improve Chinese dialogue ability. https://ollama.com/library/llama2-chinese
        models.add(new Model("llama2-chinese", ollamaProperties, "langchain4j/ollama-llama2-chinese:7b:latest", 3.800));
        models.add(new Model("llama2-chinese:13b", ollamaProperties, "langchain4j/ollama-llama2-chinese:13b:latest", 7.400));

        //qwen - Qwen 1.5 is a series of large language models by Alibaba Cloud spanning from 0.5B to 72B parameters. https://ollama.com/library/qwen
        models.add(new Model("qwen:0.5b", ollamaProperties, "langchain4j/ollama-qwen:0.5b:latest", 0.395));
        models.add(new Model("qwen:1.8b", ollamaProperties, "langchain4j/ollama-qwen:1.8b:latest", 1.100));
        models.add(new Model("qwen:4b", ollamaProperties, "langchain4j/ollama-qwen:4b:latest", 2.300));
        models.add(new Model("qwen:7b", ollamaProperties, "langchain4j/ollama-qwen:7b:latest", 4.500));
        models.add(new Model("qwen:14b", ollamaProperties, "langchain4j/ollama-qwen:14b:latest", 8.500));
        models.add(new Model("qwen:72b", ollamaProperties, "langchain4j/ollama-qwen:72b:latest", 41.00));

        //yi - A high-performing, bilingual language model. https://ollama.com/library/yi
        models.add(new Model("yi", ollamaProperties, "langchain4j/yi:latest", 3.500));
        models.add(new Model("yi:34b", ollamaProperties, "langchain4j/yi:34b:latest", 19.00));

        // ----------------

        // ---- French ----

        //nous-hermes - General use models based on Llama and Llama 2 from Nous Research. https://ollama.com/library/nous-hermes
        models.add(new Model("nous-hermes", ollamaProperties, "langchain4j/ollama-nous-hermes:latest", 3.800));
        models.add(new Model("nous-hermes:13b", ollamaProperties, "langchain4j/ollama-nous-hermes:13b:latest", 7.400));

        //nous-hermes2-mixtral - The Nous Hermes 2 model from Nous Research, now trained over Mixtral. https://ollama.com/library/nous-hermes2-mixtral
        models.add(new Model("nous-hermes2-mixtral", ollamaProperties, "langchain4j/ollama-nous-hermes2-mixtral:latest", 26.00));

        // ----------------

        // ---- Spanish , German, Italian, Portuguese and Dutch ----

        //stablelm2 - Stable LM 2 1.6B is a state-of-the-art 1.6 billion parameter small language model trained on multilingual data in English, Spanish, German, Italian, French, Portuguese, and Dutch. https://ollama.com/library/stablelm2
        models.add(new Model("stablelm2", ollamaProperties, "langchain4j/ollama-stablelm2:latest", 26.00));

        // ----------------

        // --------------------------------------------

        // ---------- Math Models  ----------

        //wizard-math - WizardMath was released by WizardLM. It is trained on the GSM8k dataset, and targeted at math questions. It is available in 7B, 13B, and 70B parameter sizes. https://ollama.com/library/wizard-math
        models.add(new Model("wizard-math", ollamaProperties, "langchain4j/ollama-wizard-math:latest", 4.100));
        models.add(new Model("wizard-math:13b", ollamaProperties, "langchain4j/ollama-wizard-math:13b:latest", 7.400));
        models.add(new Model("wizard-math:70b", ollamaProperties, "langchain4j/ollama-wizard-math:70b:latest", 39.00));

        // ----------------------------------

        // ----------- Scientific Discussion -------------

        // nous-hermes2 - The powerful family of models by Nous Research that excels at scientific discussion and coding tasks. https://ollama.com/library/nous-hermes2
        models.add(new Model("nous-hermes2", ollamaProperties, "langchain4j/ollama-nous-hermes2:latest", 6.100));
        models.add(new Model("nous-hermes2:34b", ollamaProperties, "langchain4j/ollama-nous-hermes2:34b:latest", 6.100));

        // -----------------------------------------------

        // ---------- Medical Models  -------

        //medllama2 - Fine-tuned Llama 2 model to answer medical questions based on an open source medical dataset. https://ollama.com/library/medllama2
        models.add(new Model("medllama2:7b", ollamaProperties, "langchain4j/ollama-medllama2:7b:latest", 4.100));

        //meditron - Open-source medical large language model adapted from Llama 2 to the medical domain. https://ollama.com/library/meditron
        models.add(new Model("meditron", ollamaProperties, "langchain4j/ollama-meditron:latest", 3.800));
        models.add(new Model("meditron:70b", ollamaProperties, "langchain4j/ollama-meditron:70b:latest", 39.00));

        // ----------------------------------

    }
}
