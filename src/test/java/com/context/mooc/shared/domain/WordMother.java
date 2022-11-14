package com.context.mooc.shared.domain;

import com.github.javafaker.Faker;

public final class WordMother {
    public static String randomName() {
        return Faker.instance().name().name();
    }
    public static String randomLastName() {
        return Faker.instance().name().lastName();
    }
    public static String randomEmail() {
        return Faker.instance().internet().emailAddress();
    }
    public static String randomPassword() {
        return Faker.instance().internet().password();
    }
    public static String randomIdentifier() {
        return Faker.instance().internet().ipV4Address();
    }
}