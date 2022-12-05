package com.example.ecommerce.login.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dangal_nirajan on 01/12/2022
 */
@ControllerAdvice
public class EmployeeNotFound {
    @ResponseBody
    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String,String> exceptionHandler(ResourceNotFoundException exception){
        Map<String,String> errorMap=new HashMap<>();
        errorMap.put("Error Message",exception.getMessage());

        return errorMap;
    }
}
