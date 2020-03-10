package com.hcl.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler{
	public class ProductExceptionController {
		   @ExceptionHandler(value = RecordNotFoundException.class)
		   public ResponseEntity<Object> exception(RecordNotFoundException exception) {
		      return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
		   }
		}
	
}
