package com.context.mooc.accounts.domain;

import com.context.mooc.shared.domain.StringValueObject;

// AccountLastName  represents the account last name
public final class AccountLastName extends StringValueObject {
    private static final String regex = "";
    public AccountLastName(String value) {
        super(value,  regex);
    }
}
