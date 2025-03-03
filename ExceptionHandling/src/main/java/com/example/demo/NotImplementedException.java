package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_IMPLEMENTED)
public class NotImplementedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NotImplementedException() {
		super();
	}
	
	public NotImplementedException(String msg) {
		super(msg);
		
	}

}
