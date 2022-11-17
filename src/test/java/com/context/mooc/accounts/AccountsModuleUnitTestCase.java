package com.context.mooc.accounts;

import com.context.mooc.accounts.domain.Account;
import com.context.mooc.accounts.domain.AccountId;
import com.context.mooc.accounts.domain.AccountRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public abstract class AccountsModuleUnitTestCase {
    protected AccountRepository repository;
    @BeforeEach
    protected void setUp() {
        repository = mock(AccountRepository.class);
    }
    protected void shouldHaveSaved(Account account) {
        verify(repository, atLeastOnce()).save(account);
    }
    protected void shouldHaveUpdated(AccountId id, Account account) {
        verify(repository, atLeastOnce()).update(id, account);
    }
}
