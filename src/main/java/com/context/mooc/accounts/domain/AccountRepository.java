package com.context.mooc.accounts.domain;

import java.util.Optional;

public interface AccountRepository {
    void save(Account account);
    void update(AccountId id, Account account);
    Optional<Account> getById(AccountId id);
}
