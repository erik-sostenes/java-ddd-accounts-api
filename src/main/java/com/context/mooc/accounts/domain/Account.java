package com.context.mooc.accounts.domain;

import com.shared.domain.AggregateRoot;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
public final class Account extends AggregateRoot {
    private AccountId id;
    private AccountIdentifier identifier;
    private AccountName name;
    private AccountLastName lastName;
    private AccountEmail email;
    private AccountPassword password;
    private AccountRol rol;

    public static Account create(AccountId id,
                                 AccountIdentifier identifier,
                                 AccountName name,
                                 AccountLastName lastName,
                                 AccountEmail email,
                                 AccountPassword password,
                                 AccountRol rol
    ) {
        return new Account(id, identifier, name, lastName, email, password, rol);
    }

    public AccountId id() {
        return id;
    }

    public AccountIdentifier identifier() {
        return identifier;
    }

    public AccountName name() {
        return name;
    }

    public AccountLastName lastName() {
        return lastName;
    }

    public AccountEmail email() {
        return email;
    }

    public AccountPassword password() {
        return password;
    }

    public AccountRol rol() {
        return rol;
    }
}
