package com.example.validation.advice;


import jakarta.validation.UnexpectedTypeException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@RestControllerAdvice
public class ExceptionHandlerApp {
/********************************
 The expection handler for the customer messages
 * ******************************************/
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleExption(MethodArgumentNotValidException exception) {
        Map<String, String> errorMap = new HashMap<>();
        exception.getBindingResult().getFieldErrors().forEach(error -> {
            errorMap.put(error.getField(), error.getDefaultMessage());
        });

        return errorMap;
    }

    @ExceptionHandler(UnexpectedTypeException.class)
    public Map<String , String> handleExption(UnexpectedTypeException exception){
        Map<String, String> errorMap = new HashMap<>();
        exception.getLocalizedMessage();
        Logger.getGlobal().info("this is an error from size");
        return errorMap;

    }
}
