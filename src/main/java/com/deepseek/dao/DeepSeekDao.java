package com.deepseek.dao;

import com.deepseek.model.PredictionResponse;

public interface DeepSeekDao {

	 PredictionResponse getPrediction(String inputData);
}
