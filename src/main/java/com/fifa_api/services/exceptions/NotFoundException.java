package com.fifa_api.services.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(Exception e) {
        super(e);
    }
    public NotFoundException(String message) {
        super(message);
    }
}
