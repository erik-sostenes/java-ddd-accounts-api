package com.context.mooc.accounts.domain;

import com.context.mooc.shared.domain.WordMother;

public final class AccountEmailMother {
    public static AccountEmail create(String value) {
    return new AccountEmail(value);
    }
    public static AccountEmail random() {
        return create(WordMother.randomEmail());
    }
}