package com.context.mooc.accounts.domain;

import com.context.mooc.shared.domain.StringValueObject;

// AccountPassword represents the account password.
public class AccountPassword extends StringValueObject {
    private static final String regex = "";
    public AccountPassword(String value) {
        super(value, regex);
    }
}
