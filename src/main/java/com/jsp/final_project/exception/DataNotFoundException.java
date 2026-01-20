package com.jsp.final_project.exception;

@SuppressWarnings("serial")
public class DataNotFoundException extends RuntimeException {
	public DataNotFoundException(String message) {
		super(message);
	}
}
