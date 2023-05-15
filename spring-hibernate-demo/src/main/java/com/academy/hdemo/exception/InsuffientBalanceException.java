package com.academy.hdemo.exception;

public class InsuffientBalanceException extends RuntimeException{
    public InsuffientBalanceException(String message) {
        super(message);
    }
}
