package com.context.mooc.accounts.application.update;

import com.context.mooc.accounts.domain.*;

public class UpdateAccountRequestMother {
    public static UpdateAccountRequest create(AccountId id, AccountIdentifier identifier, AccountName name, AccountLastName lastName, AccountEmail email, AccountPassword password, AccountRol rol) {
        return new UpdateAccountRequest(
                id.value(),
                identifier.value(),
                name.value(),
                lastName.value(),
                email.value(),
                password.value(),
                rol.value()
        );
    }

    public static UpdateAccountRequest random() {
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
