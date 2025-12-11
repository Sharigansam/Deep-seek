package com.deepseek.daoImpl;

import org.springframework.stereotype.Repository;

import com.deepseek.dao.DeepSeekDao;
import com.deepseek.model.PredictionResponse;
import com.deepseek.util.GeminiAPIClient;

@Repository
public class DeepSeekDaoImpl implements DeepSeekDao {

	@Override
	public PredictionResponse getPrediction(String inputData) {
		System.out.println("inputData: " + inputData);

		// Call the Gemini API
		GeminiAPIClient geminiAPIClient = new GeminiAPIClient();
		String apiResponse9 = geminiAPIClient.callGeminiAPI(inputData);

		// Create and return the response
		PredictionResponse response = new PredictionResponse();
		response.setResult(apiResponse9); // Set the entire JSON response as the result
		return response;
	}
}