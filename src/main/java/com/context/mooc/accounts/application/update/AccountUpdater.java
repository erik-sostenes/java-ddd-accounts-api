package com.context.mooc.accounts.application.update;

import com.context.mooc.accounts.domain.*;
import com.context.mooc.shared.domain.exceptions.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@AllArgsConstructor
public final class AccountUpdater {
    private AccountRepository accountRepository;

    public void update(UpdateAccountRequest request) {
        var id = new AccountId(request.id());

        boolean isPresent = accountRepository.getById(id).isPresent();
        if (!isPresent) throw new NotFoundException(format("Account with id '%s' not found", id.value()));

        Account account = new Account(
                new AccountId(request.id()),
                new AccountIdentifier(request.identifier()),
                new AccountName(request.name()),
                new AccountLastName(request.lastName()),
                new AccountEmail(request.email()),
                new AccountPassword(request.password()),
                new AccountRol(request.rol()));

        accountRepository.update(account.id(), account);
    }
}
