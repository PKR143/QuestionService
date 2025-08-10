package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.service.QuestionService;
import com.demo.service.QuestionServiceImpl;

@Configuration
public class BeanConfiguration {
	
	@Bean
	QuestionService getQuestionService() {
		return new QuestionServiceImpl();
	}
	
}
