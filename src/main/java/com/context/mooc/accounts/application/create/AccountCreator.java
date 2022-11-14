package com.context.mooc.accounts.application.create;

import com.context.mooc.accounts.domain.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public final class AccountCreator {
    private AccountRepository courseRepository;
    public void create(CreateAccountRequest request) {
        Account account = new Account(
                new AccountId(request.id()),
                new AccountIdentifier(request.identifier()),
                new AccountName(request.name()),
                new AccountLastName(request.lastName()),
                new AccountEmail(request.email()),
                new AccountPassword(request.password()),
                new AccountRol(request.rol()));

        courseRepository.save(account);
    }
}