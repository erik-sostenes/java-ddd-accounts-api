package com.context.mooc.accounts.application.create;

import com.context.mooc.accounts.AccountsModuleUnitTestCase;
import com.context.mooc.accounts.domain.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

final class AccountCreatorShould extends AccountsModuleUnitTestCase {
    private AccountCreator creator;
    @BeforeEach
    public void setUp() {
        super.setUp();
        creator = new AccountCreator(repository);
    }
    @Test
    void save_a_valid_course() {
        CreateAccountCommand request = CreateAccountRequestMother.random();
        Account account = AccountMother.fromRequestCreateAccount(request);

        creator.create(
                new AccountId(request.id()),
                new AccountIdentifier(request.identifier()),
                new AccountName(request.name()),
                new AccountLastName(request.lastName()),
                new AccountEmail(request.email()),
                new AccountPassword(request.password()),
                new AccountRol(request.rol())
        );

        shouldHaveSaved(account);
    }
}