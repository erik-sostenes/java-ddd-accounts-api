package com.context.mooc.accounts.domain;

import com.context.mooc.shared.domain.WordMother;

public final class AccountPasswordMother {
    public static AccountPassword create(String value) {
        return new AccountPassword(value);
    }
    public static AccountPassword random() {
        return create(WordMother.randomPassword());
    }
}