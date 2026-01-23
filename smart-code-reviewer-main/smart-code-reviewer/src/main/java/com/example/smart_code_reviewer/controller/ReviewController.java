package com.example.smart_code_reviewer.controller;

import com.example.smart_code_reviewer.service.CodeReviewService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/review")
@CrossOrigin(origins = "http://localhost:3000")
public class ReviewController {

    private final CodeReviewService reviewService;
    public ReviewController(CodeReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping
    public ResponseEntity<String> getReview(@RequestBody String codeSnippet) {
        String reviewResult = reviewService.reviewCode(codeSnippet);
        return ResponseEntity.ok(reviewResult);
    }
}