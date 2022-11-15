package com.context.mooc.accounts.domain;

import com.context.mooc.shared.domain.StringValueObject;

// AccountName represents the account name.
public final class AccountName extends StringValueObject {
    private static final String regex = "";
    public AccountName(String value) {
        super(value, regex);
    }
}
