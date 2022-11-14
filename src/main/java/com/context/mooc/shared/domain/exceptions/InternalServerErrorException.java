package com.context.mooc.shared.domain.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// InternalServerErrorException will return an error when the server fails
@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public final class InternalServerErrorException extends RuntimeException {
    public InternalServerErrorException(String message) {
        super(message);
    }
}
