package com.context.mooc.shared.domain.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// NotFoundException will return an error when a resource is not found
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public final class NotFoundException extends RuntimeException{
    public NotFoundException(String message) {
        super(message);
    }
}
