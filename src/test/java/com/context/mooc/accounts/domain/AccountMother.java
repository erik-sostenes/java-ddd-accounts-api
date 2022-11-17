package com.context.mooc.accounts.domain;

import com.context.mooc.accounts.application.create.CreateAccountRequest;
import com.context.mooc.accounts.application.update.UpdateAccountRequest;

public final class AccountMother {
    public static Account create(AccountId id, AccountIdentifier identifier, AccountName name, AccountLastName lastName, AccountEmail email, AccountPassword password, AccountRol rol) {
        return new Account(id, identifier, name, lastName, email, password, rol);
    }
    public static Account fromRequestCreateAccount(CreateAccountRequest request) {
        return create(
                AccountIdMother.create(request.id()),
                AccountIdentifierMother.create(request.identifier()),
                AccountNameMother.create(request.name()),
                AccountLastNameMother.create(request.lastName()),
                AccountEmailMother.create(request.email()),
                AccountPasswordMother.create(request.password()),
                AccountRolMother.create(request.rol())
        );
    }
    public static Account fromRequestUpdateAccount(UpdateAccountRequest request) {
        return create(
                AccountIdMother.create(request.id()),
                AccountIdentifierMother.create(request.identifier()),
                AccountNameMother.create(request.name()),
                AccountLastNameMother.create(request.lastName()),
                AccountEmailMother.create(request.email()),
                AccountPasswordMother.create(request.password()),
                AccountRolMother.create(request.rol())
            );
    }

    public static Account random() {
        return create(
                AccountIdMother.random(),
                AccountIdentifierMother.random(),
                AccountNameMother.random(),
                AccountLastNameMother.random(),
                AccountEmailMother.random(),
                AccountPasswordMother.random(),
                AccountRolMother.randomProvideRol());
    }
}