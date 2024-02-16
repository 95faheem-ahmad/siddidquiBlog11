package com.myblog.Myblog11.exception;

import com.myblog.Myblog11.payload.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
  public ResponseEntity<ErrorDetails> HandleResourceException(
          ResourceNotFoundException e,
          WebRequest webRequest
  ){
     ErrorDetails errorDetails=new ErrorDetails(e.getMessage(),webRequest.getDescription(true));
     return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
  }

}
