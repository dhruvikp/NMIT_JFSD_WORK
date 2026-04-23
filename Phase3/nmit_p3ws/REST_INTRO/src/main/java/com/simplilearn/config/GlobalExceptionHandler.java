package com.simplilearn.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@ControllerAdvice
@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value=Exception.class)
	public String arithmaticExceptionHandler() {
		return "Internal Server Error occurred";
	}
}
