package com.context.mooc.accounts.application.create;

import com.context.mooc.accounts.AccountsModuleUnitTestCase;
import com.context.mooc.accounts.domain.*;
import com.shared.domain.accounts.AccountCreatedDomainEvent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

final class AccountCreatorShould extends AccountsModuleUnitTestCase {
    private CreateAccountCommandHandler handler;

    @BeforeEach
    public void setUp() {
        super.setUp();
        handler = new CreateAccountCommandHandler(
                new AccountCreator(repository, eventBus)
        );

    }

    @Test
    void save_a_valid_course() {
        CreateAccountCommand command = CreateAccountCommandMother.random();
        Account account = AccountMother.fromCommandCreateAccount(command);
        AccountCreatedDomainEvent domainEvent = AccountCreatedDomainEventMother.fromPrimitives(account);

        handler.handle(command);

        shouldHaveSaved(account);
        shouldHavePublished(domainEvent);
    }
}