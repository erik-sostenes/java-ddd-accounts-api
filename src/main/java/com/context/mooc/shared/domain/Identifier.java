package com.context.mooc.shared.domain;

import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.UUID;

@EqualsAndHashCode
public abstract class Identifier implements Serializable {
    private UUID value;

    public Identifier(String value) {
        this.value =  UUID.fromString(value);
    }

    public String value() {
        return value.toString();
    }
}
