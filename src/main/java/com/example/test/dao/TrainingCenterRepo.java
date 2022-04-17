package com.example.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.Entity.TrainingCenter;

public interface TrainingCenterRepo extends JpaRepository<TrainingCenter, String> {

}
