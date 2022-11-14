package com.context.mooc.shared.domain.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// UnprocessableEntityException will return a error when the server cannot process the contained instructions
@ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY)
public final class UnprocessableEntityException extends RuntimeException {
    public UnprocessableEntityException(String message) {
        super(message);
    }
}
