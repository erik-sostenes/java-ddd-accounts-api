package com.context.mooc.accounts.application.update;

import com.context.mooc.accounts.AccountsModuleUnitTestCase;
import com.context.mooc.accounts.domain.*;
import com.context.mooc.shared.domain.exceptions.NotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

final class AccountUpdaterShould extends AccountsModuleUnitTestCase {
    private AccountUpdater updater;

    @BeforeEach
    public void setUp() {
        super.setUp();
        updater = new AccountUpdater(repository);
    }

    @Test
    void update_a_valid_account() {
        UpdateAccountRequest request = UpdateAccountRequestMother.random();
        Account account = AccountMother.fromRequestUpdateAccount(request);

        when(repository.getById(account.id())).thenReturn(Optional.of(account));

        updater.update(request);
        shouldHaveUpdated(account.id(), account);
    }

    @Test
    @DisplayName("should not update an account that does not exist in the database")
    void not_update_an_account() {
        UpdateAccountRequest request = UpdateAccountRequestMother.random();
        Account account = AccountMother.fromRequestUpdateAccount(request);

        when(repository.getById(account.id())).thenReturn(Optional.empty());

        assertThrows(NotFoundException.class, () -> updater.update(request));
    }
}