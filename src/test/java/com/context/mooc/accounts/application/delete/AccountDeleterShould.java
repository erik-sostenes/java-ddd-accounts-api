package com.context.mooc.accounts.application.delete;

import com.context.mooc.accounts.AccountsModuleUnitTestCase;
import com.context.mooc.accounts.domain.AccountId;
import com.context.mooc.accounts.domain.AccountMother;
import com.context.mooc.shared.domain.exceptions.NotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

final class AccountDeleterShould extends AccountsModuleUnitTestCase {
    private AccountDeleter deleter;

    @BeforeEach
    public void setUp() {
        super.setUp();
        deleter = new AccountDeleter(repository);
    }

    @Test
    void delete_a_valid_account() {
        var request = DeleteAccountRequestMother.random();
        var id = new AccountId(request.id());

        when(repository.getById(id)).thenReturn(Optional.of(AccountMother.random()));

        deleter.delete(request);
        shouldHaveRemoved(id);
    }

    @Test
    @DisplayName("should not delete an account that does not exist in the database")
    void not_delete_an_account() {
        var request = DeleteAccountRequestMother.random();
        var id = new AccountId(request.id());

        when(repository.getById(id)).thenReturn(Optional.empty());

        assertThrows(NotFoundException.class, () -> deleter.delete(request));
    }
}