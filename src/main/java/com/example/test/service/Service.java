package com.example.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.test.Entity.TrainingCenter;
import com.example.test.dao.TrainingCenterRepo;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	TrainingCenterRepo trainingCenterRepo;

	public List<TrainingCenter> getAllCenters() {
		return trainingCenterRepo.findAll();
	}

	public TrainingCenter addCenters(TrainingCenter trainingCenter) {
		
		return trainingCenterRepo.save(trainingCenter);
	}

}
