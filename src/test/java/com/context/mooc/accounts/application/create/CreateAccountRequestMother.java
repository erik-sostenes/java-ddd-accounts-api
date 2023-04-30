package com.context.mooc.accounts.application.create;

import com.context.mooc.accounts.domain.*;

class CreateAccountRequestMother {
    public static CreateAccountCommand create(
            AccountId id,
            AccountIdentifier identifier,
            AccountName name,
            AccountLastName lastName,
            AccountEmail email,
            AccountPassword password,
            AccountRol rol
    ) {
        return new CreateAccountCommand(
                id.value(),
                identifier.value(),
                name.value(),
                lastName.value(),
                email.value(),
                password.value(),
                rol.value()
        );
    }

    public static CreateAccountCommand random() {
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