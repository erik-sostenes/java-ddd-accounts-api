package com.context.mooc.accounts.infrastructure.persistence;

import com.context.mooc.accounts.AccountsModuleInfrastructureTestCase;
import com.context.mooc.accounts.domain.AccountMother;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

final class AccountStorerShould extends AccountsModuleInfrastructureTestCase {
    private AccountStorer store;

    @BeforeEach
    void setUp() {
        store = new AccountStorer(jdbcTemplate);
    }

    @Test
    void save_account_successfully() {
        var account = AccountMother.random();
        store.save(account);
    }
    @Test
    void return_an_existing_account() {
        var account = AccountMother.random();

        store.save(account);

        assertEquals(Optional.of(account), store.getById(account.id()));
    }
    @Test
    void update_account_successfully() {
        var account = AccountMother.random();
        store.save(account);

        store.update(account.id(), account);
    }
}