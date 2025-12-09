package com.deepseek.model;

import lombok.Data;

@Data
public class PredictionResponse {
    private String result;

    // Getters and Setters
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}