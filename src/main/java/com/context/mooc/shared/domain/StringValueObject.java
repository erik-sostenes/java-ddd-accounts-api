package com.context.mooc.shared.domain;

import com.context.mooc.shared.domain.exceptions.UnprocessableEntityException;
import lombok.EqualsAndHashCode;

import java.util.Optional;
import java.util.regex.Pattern;

@EqualsAndHashCode
public abstract class StringValueObject {
    private final String value;
    private static final String message = "The format of the value %s is not valid or has not been found.";
    private final String regex;

    public StringValueObject(String value,String regex) {
        fromValue(value, regex);
        this.value = value;
        this.regex = regex;
    }

    public String value() {
        return value;
    }

    private void fromValue(String value, String regex) {
        if(!regex.isBlank()) {
            if (!patternMatches(value, regex))
                throw new UnprocessableEntityException(String.format(message, value));
        }
        if (Optional.ofNullable(value).isEmpty())
            throw new UnprocessableEntityException(String.format(message, value));
    }

    private boolean patternMatches(String value, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(value)
                .matches();
    }
}