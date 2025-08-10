package com.demo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponseDto {

	String question;
	String answer;
	String status;
	
	public ResponseDto(String question, Double answer, String status) {
		this.question = question;
		this.answer = answer.toString();
		this.status = status;
	}
	
}
