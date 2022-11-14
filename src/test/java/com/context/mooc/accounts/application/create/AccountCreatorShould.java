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
        CreateAccountRequest request =  CreateAccountRequestMother.random();
        Account account = AccountMother.fromRequest(request);

        creator.create(request);
        shouldHaveSaved(account);
    }
}