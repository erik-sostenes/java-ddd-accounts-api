package com.context.mooc.shared.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@EqualsAndHashCode
public abstract class Identifier {
    private UUID value;

    public Identifier(String value) {
        this.value =  UUID.fromString(value);
    }

    public String value() {
        return value.toString();
    }
}
