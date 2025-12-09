package com.deepseek.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepseek.dao.DeepSeekDao;
import com.deepseek.model.PredictionRequest;
import com.deepseek.model.PredictionResponse;
import com.deepseek.service.DeepSeekService;

@Service
public class DeepSeekServiceImpl implements DeepSeekService {

	@Autowired
	private DeepSeekDao deepSeekDao;

	@Override
	public PredictionResponse predict(PredictionRequest request) {
		// Call the DAO layer to interact with the model
		return deepSeekDao.getPrediction(request.getInputData());
	}
}
