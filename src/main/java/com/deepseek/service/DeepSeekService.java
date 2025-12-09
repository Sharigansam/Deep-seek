package com.deepseek.service;

import org.springframework.stereotype.Service;

import com.deepseek.model.PredictionRequest;
import com.deepseek.model.PredictionResponse;

@Service
public interface DeepSeekService {

	public PredictionResponse predict(PredictionRequest request);

}
