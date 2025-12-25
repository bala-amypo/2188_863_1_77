package com.example.demo.service;

import com.example.demo.entity.AssessmentResult;
import org.springframework.stereotype.Service;

@Service
public interface AssessmentService {
    
    AssessmentResult recordAssessment(AssessmentResult result);
}
