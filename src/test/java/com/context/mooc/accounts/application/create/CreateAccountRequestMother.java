package com.context.mooc.accounts.application.create;

import com.context.mooc.accounts.domain.*;

class CreateAccountRequestMother {
    public static CreateAccountRequest create(AccountId id, AccountIdentifier identifier, AccountName name, AccountLastName lastName, AccountEmail email, AccountPassword password, AccountRol rol) {
        return new CreateAccountRequest(
                id.value(),
                identifier.value(),
                name.value(),
                lastName.value(),
                email.value(),
                password.value(),
                rol.value()
        );
    }

    public static CreateAccountRequest random() {
        return create(
                AccountIdMother.random(),
                AccountIdentifierMother.random(),
                AccountNameMother.random(),
                AccountLastNameMother.random(),
                AccountEmailMother.random(),
                AccountPasswordMother.random(),
                AccountRolMother.randomClientRol()
        );
    }
}