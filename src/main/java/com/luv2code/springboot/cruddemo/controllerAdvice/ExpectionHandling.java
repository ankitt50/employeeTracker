package com.luv2code.springboot.cruddemo.controllerAdvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExpectionHandling {

	@ExceptionHandler
	public ResponseEntity<NumberFormatException> exceptionHandling(NumberFormatException e) {
		return new ResponseEntity<NumberFormatException>(HttpStatus.BAD_REQUEST);
	}
}
