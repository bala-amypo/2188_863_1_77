package com.example.demo.service;

import com.example.demo.entity.AssessmentResult;

@service
public interface AssessmentService {
    
    AssessmentResult recordAssessment(AssessmentResult result);
}
