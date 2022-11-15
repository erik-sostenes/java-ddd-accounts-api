package com.context.mooc.accounts.domain;

import com.context.mooc.shared.domain.StringValueObject;

// AccountEmail represents the account email.
public final class AccountEmail extends StringValueObject {
    private static final String regex = "\"^(.+)@(.+)$\"";
    public AccountEmail(String value) {
        super(value, regex);
    }
}
