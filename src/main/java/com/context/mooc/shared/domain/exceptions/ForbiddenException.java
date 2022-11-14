package com.context.mooc.shared.domain.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// ForbiddenException will return an error when trying to access a forbidden resource
@ResponseStatus(value = HttpStatus.FORBIDDEN)
public final class ForbiddenException extends RuntimeException{
    public ForbiddenException(String message) {
        super(message);
    }
}
