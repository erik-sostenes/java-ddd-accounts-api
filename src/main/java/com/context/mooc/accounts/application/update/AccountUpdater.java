package com.context.mooc.accounts.application.create;

import com.context.mooc.accounts.domain.*;
import org.springframework.stereotype.Service;

@Service
public final class AccountUpdater {
    public void update(UpdateAccountRequest request) {
        Account account = new Account(
                new AccountId(request.id()),
                new AccountIdentifier(request.identifier()),
                new AccountName(request.name()),
                new AccountLastName(request.lastName()),
                new AccountEmail(request.email()),
                new AccountPassword(request.password()),
                new AccountRol(request.rol()));

        System.out.println(account);
    }
}
