package com.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.demo.dto.ResponseDto;

@Service
public interface QuestionService {
	
	ResponseEntity<ResponseDto> getQuestion();

}
