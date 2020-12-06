package com.iiht.training.eloan.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.iiht.training.eloan.dto.exception.ExceptionResponse;

public class ExceptionApi {
	
	public static String toErrMsg(List<ObjectError> allErrors) {
		StringBuilder sb = new StringBuilder();
		for(ObjectError err:allErrors) {
			sb.append(err.getDefaultMessage() + ",");
		}
		return sb.toString();
	}

	@ExceptionHandler()
	public ResponseEntity<String> handleException(ExceptionResponse exp){
		return new ResponseEntity(exp.getMessage(),HttpStatus.BAD_REQUEST);
	}	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleOtherException(ExceptionResponse exp){
		return new ResponseEntity(exp.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
