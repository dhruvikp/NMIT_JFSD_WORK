package com.simplilarn.other;

public class InvalidAgeException extends Exception {

	private static final long serialVersionUID = 1L;
	
	InvalidAgeException(String message) {
		super(message);
	}

}
