package com.context.mooc.shared.domain;

import com.context.mooc.shared.domain.exceptions.UnprocessableEntityException;
import lombok.EqualsAndHashCode;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@EqualsAndHashCode
public abstract class StringValueObject {
    private String value;
    private static final String message = "The format of the value %s is not valid or has not been found.";
    private String regex;

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
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(value);
            if (!matcher.matches())
                throw new UnprocessableEntityException(String.format(message, value));
        }
        if (!Optional.ofNullable(value).isPresent())
            throw new UnprocessableEntityException(String.format(message, value));
    }
}