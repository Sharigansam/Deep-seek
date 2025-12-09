package com.deepseek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.deepseek.model.PredictionRequest;
import com.deepseek.service.DeepSeekService;

import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:3000") // ✅ Allow frontend to access API
@RestController
@RequestMapping("/api/deepseek")
public class DeepSeekController {

    @Autowired
    private DeepSeekService deepSeekService;

    @PostMapping("/predict")
    public ResponseEntity<?> predict(@RequestBody PredictionRequest request) {
        return ResponseEntity.ok(deepSeekService.predict(request));
    }
}
