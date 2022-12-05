package com.example.ecommerce.login.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author dangal_nirajan on 29/11/2022
 */
public  class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(Long id){
        super("Could not found the Employee with id "+ id);
    }
}
