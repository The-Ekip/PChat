package com.ekip.pchat.exceptionHandler.exceptions;

public class EntityNotFountException extends  RuntimeException{

    public  EntityNotFountException(){}

    public  EntityNotFountException(String message){
        super(message);
    }
}
