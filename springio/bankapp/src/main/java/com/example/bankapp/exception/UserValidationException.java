package com.example.bankapp.exception;

public class UserValidationException extends RuntimeException {

    public UserValidationException (String message){
        super(message);
    }
}
