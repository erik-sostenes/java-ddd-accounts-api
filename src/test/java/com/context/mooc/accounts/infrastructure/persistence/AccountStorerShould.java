package com.context.mooc.accounts.infrastructure.persistence;

import com.context.mooc.accounts.AccountsModuleInfrastructureTestCase;
import com.context.mooc.accounts.domain.AccountMother;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

final class AccountStorerShould extends AccountsModuleInfrastructureTestCase {
    private AccountStorer storer;

    @BeforeEach
    void setUp() {
        storer = new AccountStorer(jdbcTemplate);
    }

    @Test
    public void save_account_successfully() {
        var account = AccountMother.random();
        storer.save(account);
    }

    @Test
    void return_an_existing_course() {
        var account = AccountMother.random();

        storer.save(account);

        assertEquals(Optional.ofNullable(account), storer.getById(account.id()));
    }

}