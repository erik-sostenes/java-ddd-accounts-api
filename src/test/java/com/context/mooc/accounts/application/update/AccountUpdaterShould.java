package com.context.mooc.accounts.application.update;

import com.context.mooc.accounts.AccountsModuleUnitTestCase;
import com.context.mooc.accounts.domain.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

final class AccountUpdaterShould extends AccountsModuleUnitTestCase {
    private AccountUpdater updater;

    @BeforeEach
    public void setUp() {
        super.setUp();
        updater = new AccountUpdater(repository);
    }

    @Test
    void update_a_valid_course() {
        UpdateAccountRequest request = UpdateAccountRequestMother.random();
        Account account = AccountMother.fromRequestUpdateAccount(request);
        AccountId id = new AccountId(request.id());

        updater.update(request);
        shouldHaveUpdated(id, account);
    }
}