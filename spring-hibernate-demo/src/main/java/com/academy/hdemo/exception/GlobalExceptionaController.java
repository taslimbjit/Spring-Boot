package com.academy.hdemo.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionaController {
    @ExceptionHandler({AccountNotFoundException.class, InsuffientBalanceException.class})
    public ResponseEntity<Object> returnNotFoundException(Exception ex) {


        if (ex instanceof AccountNotFoundException) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        } else if (ex instanceof InsuffientBalanceException) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.FORBIDDEN);
        }
        else
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
