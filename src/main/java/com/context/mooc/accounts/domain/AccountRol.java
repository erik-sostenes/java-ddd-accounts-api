package com.context.mooc.accounts.domain;

import com.context.mooc.shared.domain.StringValueObject;

// AccountRol represents the account rol.
public class AccountRol extends StringValueObject {
    private static final String regex = "";
    public AccountRol(String value) {
        super(value, regex);
    }
}