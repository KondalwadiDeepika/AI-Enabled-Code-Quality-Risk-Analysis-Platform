package com.example.smart_code_reviewer.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class OllamaReviewService implements CodeReviewService {

    private final ChatClient chatClient;

    public OllamaReviewService(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @Override
    public String reviewCode(String sourceCode) {
        String systemPrompt = """
            You are a Senior Software Engineer and Code Quality Expert.
            
            1. Detect the programming language of the provided code.
            2. Analyze it for logic errors, security flaws, and efficiency issues.
            3. Your output MUST be in Markdown format with these exact sections:
            
               ### 🏳️ Language Detected
               (Name of the language)
            
               ### 🐞 Bug Report
               (List of issues)
            
               ### ✨ Suggested Fix
               (The corrected code block)
            """;

        return chatClient.prompt()
                .system(systemPrompt)
                .user(sourceCode)
                .call()
                .content();
    }
}