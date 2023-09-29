package com.employee.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = { ResourceNotFoundException.class})
	public ResponseEntity<ApiError> handleResourceNotFoundException(ResourceNotFoundException reft)
	{
		String expMsg=reft.getMessage();
		String expCode="EXP0025";
		
		ApiError apiError=new ApiError();
		apiError.setMsg(expMsg);
		apiError.setCode(expCode);
		
		return new ResponseEntity<ApiError>(apiError,HttpStatus.NOT_FOUND);
	}
}
