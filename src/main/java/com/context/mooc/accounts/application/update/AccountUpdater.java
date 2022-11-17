package com.context.mooc.accounts.application.update;

import com.context.mooc.accounts.domain.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public final class AccountUpdater {
    private AccountRepository accountRepository;

    public void update(UpdateAccountRequest request) {
        var id = new AccountId(request.id());

        Account account = new Account(
                new AccountIdentifier(request.identifier()),
                new AccountName(request.name()),
                new AccountLastName(request.lastName()),
                new AccountEmail(request.email()),
                new AccountPassword(request.password()),
                new AccountRol(request.rol()));

        accountRepository.update(id, account);
    }
}
