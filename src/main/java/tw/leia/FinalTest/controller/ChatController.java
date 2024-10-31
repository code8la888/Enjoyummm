package tw.leia.FinalTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tw.leia.FinalTest.model.ChatRequest;
import tw.leia.FinalTest.model.RemyChatRequest;
import tw.leia.FinalTest.service.OpenAIService;

@RestController
public class ChatController {

    @Autowired
    private OpenAIService openAIService;

    @Value("${openai.model}")
    private String model;

    @GetMapping("/chat")
    public String getChatResponse(@RequestParam String prompt) {
        ChatRequest chatRequest = new ChatRequest(model, prompt);
        return openAIService.generateChatResponse(chatRequest);
    }

    @GetMapping("/RemyChat")
    public String getRemyChatResponse(@RequestParam String prompt) {
        RemyChatRequest chatRequest = new RemyChatRequest(model, prompt);
        return openAIService.generateChatResponse(chatRequest);
    }
}

