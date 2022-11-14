package com.context.mooc.shared.domain.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// BadRequestException will return an error when the client makes a mistakes
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public final class BadRequestException extends RuntimeException{
    public BadRequestException(String message) {
        super(message);
    }

}
