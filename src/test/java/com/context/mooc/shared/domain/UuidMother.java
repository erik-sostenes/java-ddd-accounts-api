package com.context.mooc.shared.domain;

import java.util.UUID;

public class UuidMother {
    public static String random() {
        return UUID.randomUUID().toString();
    }
}
