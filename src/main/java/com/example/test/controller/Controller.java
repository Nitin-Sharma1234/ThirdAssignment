package com.example.test.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.Entity.TrainingCenter;
import com.example.test.service.Service;

@RestController
public class Controller {
	
	@Autowired
	Service service;
	
	@GetMapping("/all")
	public List<TrainingCenter> getAllCenters(){
		return service.getAllCenters();
	}
	
	@PostMapping("/add")
	public TrainingCenter addCenters(@Valid @RequestBody TrainingCenter trainingCenter){
		return service.addCenters(trainingCenter);
	}
	

}
