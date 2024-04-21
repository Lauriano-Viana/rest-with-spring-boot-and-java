package com.lcvcode.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsurpportedMathOperationException extends RuntimeException {

    public UnsurpportedMathOperationException(String ex) {
        super(ex);
    }

    private static final Long serialVersionUID = 1L;


}
