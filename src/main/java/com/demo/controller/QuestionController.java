package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.ResponseDto;
import com.demo.service.QuestionService;

@RestController
@RequestMapping
public class QuestionController {

	@Autowired
	QuestionService service;
	
	@GetMapping
	public ResponseEntity<ResponseDto> getQuestion() throws Exception{
		return service.getQuestion();
	}
	
}
