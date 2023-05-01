package com.shared.domain.criteria;

public enum OrderType {
    ASC("ASC"),
    DESC("DESC"),
    NONE("NONE");

    private final String type;

    OrderType(String type) {
        this.type = type;
    }

    public boolean isNone() {
        return this == NONE;
    }

    public boolean isAsc() {
        return this == ASC;
    }

    public boolean isDesc() {
        return this == DESC;
    }

    public String value() {
        return type;
    }
}
