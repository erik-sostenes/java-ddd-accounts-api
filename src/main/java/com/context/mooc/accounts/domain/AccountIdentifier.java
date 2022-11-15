package com.context.mooc.accounts.domain;

import com.context.mooc.shared.domain.StringValueObject;

// AccountIdentifier  represents the account identifier
public class AccountIdentifier extends StringValueObject {
    private static final String regex = "";
    public AccountIdentifier(String value) {
        super(value, regex);
    }
}
