package com.example.demo.service;

import com.example.demo.entity.AssessmentResult;

@bean
public interface AssessmentService {

    AssessmentResult recordAssessment(AssessmentResult result);
}
