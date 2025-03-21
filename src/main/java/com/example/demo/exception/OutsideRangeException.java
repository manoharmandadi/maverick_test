package com.example.demo.exception;

public class OutsideRangeException extends RuntimeException{
    public OutsideRangeException(String message){
        super(message);
    }
}
