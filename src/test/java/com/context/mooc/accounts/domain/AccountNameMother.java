package com.context.mooc.accounts.domain;

import com.context.mooc.shared.domain.WordMother;

public final class AccountNameMother {
    public static AccountName create(String value) {
        return new AccountName(value);
    }
    public static AccountName random() {
        return create(WordMother.randomName());
    }
}