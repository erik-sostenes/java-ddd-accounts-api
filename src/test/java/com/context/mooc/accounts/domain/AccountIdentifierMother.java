package com.context.mooc.accounts.domain;

import com.context.mooc.shared.domain.WordMother;

public class AccountIdentifierMother {
    public static AccountIdentifier create(String value) {
        return new AccountIdentifier(value);
    }
    public static AccountIdentifier random() {
        return create(WordMother.randomIdentifier());
    }
}
