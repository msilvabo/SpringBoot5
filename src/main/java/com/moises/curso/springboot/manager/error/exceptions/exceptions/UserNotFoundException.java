package com.moises.curso.springboot.manager.error.exceptions.exceptions;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String message){
        super(message);
    }
}
