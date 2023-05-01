package com.context.mooc.accounts.domain;

import com.shared.domain.accounts.AccountCreatedDomainEvent;

public class AccountCreatedDomainEventMother {
    public static AccountCreatedDomainEvent create(
            AccountId id,
            AccountIdentifier identifier,
            AccountName name,
            AccountLastName lastName,
            AccountEmail email,
            AccountPassword password,
            AccountRol rol
    ) {
        return new AccountCreatedDomainEvent(
                id.value(),
                identifier.value(),
                name.value(),
                lastName.value(),
                email.value(),
                password.value(),
                rol.value()
        );
    }

    public static AccountCreatedDomainEvent fromPrimitives(Account account) {
        return create(
                account.id(),
                account.identifier(),
                account.name(),
                account.lastName(),
                account.email(),
                account.password(),
                account.rol()
        );
    }

    public static AccountCreatedDomainEvent random() {
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
