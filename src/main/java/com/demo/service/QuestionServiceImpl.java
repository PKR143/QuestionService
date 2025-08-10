package com.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.demo.dto.ResponseDto;

public class QuestionServiceImpl implements QuestionService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(QuestionService.class);
	
	private ResponseDto response;

	@Override
	public ResponseEntity<ResponseDto> getQuestion() throws Exception{
		
		Double ctrl = Math.floor(Math.random()*2);
		if(ctrl == 0) {
			//arithmetic calculation 
			Double num1 = Math.floor(Math.random()*11);
			Double num2 = Math.floor(Math.random()*11);
			
			Character[] signs = {'+', '-', '*', '/'};
			
			Character sign = signs[(int)(Math.floor(Math.random()*4))];
			
			String question = num1+" "+sign+" "+num2+" = ?";
			
			Double answer = 0.0;
			switch(sign) {
			case '+':
				answer = num1 + num2;
				break;
			case '-':
				answer = num1 - num2;
				break;
			case '*':
				answer = num1 * num2;
				break;
			case '/':
				answer = num1 / num2;
				break;
			}
			LOGGER.info("{}",question);
			LOGGER.info("answer: {}",answer);
			response = new ResponseDto(question,answer,"ok");
			return new ResponseEntity<>(response, HttpStatus.OK);
		}else {
			//comparison between numbers
			Double num1 = Math.floor(Math.random()*110);
			Double num2 = Math.floor(Math.random()*110);
			Double num3= Math.floor(Math.random()*110);
			
			if(Math.floor(Math.random()*2)==1) {
				// >
				String question = "Which one is greatest "+num1+", "+num2+", "+num3+" ?";
				Double answer = Math.max(Math.max(num1, num2), num3);
				LOGGER.info("{}",question);
				LOGGER.info("answer: {}",answer);
				response = new ResponseDto(question,answer,"ok");
				return new ResponseEntity<>(response, HttpStatus.OK);
			}else {
				// <
				String question = "Which one is smallest "+num1+", "+num2+", "+num3+" ?";
				Double answer = Math.min(Math.min(num1, num2), num3);
				LOGGER.info("{}",question);
				LOGGER.info("answer: {}",answer);
				response = new ResponseDto(question,answer,"ok");
				return new ResponseEntity<>(response, HttpStatus.OK);
			}
			
		}
	
	}

}
