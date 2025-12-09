package com.deepseek.model;

import lombok.Data;

@Data
public class PredictionRequest {
    private String inputData;

    // Optional: Constructor for deserialization
    public PredictionRequest(String inputData) {
        this.inputData = inputData;
    }

	public String getInputData() {
		return inputData;
	}

	public void setInputData(String inputData) {
		this.inputData = inputData;
	}
    
    
}
