package com.context.mooc.shared.domain;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public abstract class StringValueObject {
    private String value;
    public StringValueObject(String value) {
        this.value = value;
    }
    public String value() {
        return value;
    }
}
