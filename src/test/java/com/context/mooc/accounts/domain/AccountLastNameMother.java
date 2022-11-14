package com.context.mooc.accounts.domain;

import com.context.mooc.shared.domain.WordMother;

public final class AccountLastNameMother {
    public static AccountLastName create(String value) {
        return new AccountLastName(value);
    }
    public static AccountLastName random() {
        return create(WordMother.randomLastName());
    }
}