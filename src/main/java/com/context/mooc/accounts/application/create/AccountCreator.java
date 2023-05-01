package com.context.mooc.accounts.application.create;

import com.context.mooc.accounts.domain.*;
import com.shared.domain.bus.event.EventBus;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public final class AccountCreator {
    private final AccountRepository accountRepository;
    private final EventBus eventBus;

    public void create(
            AccountId id,
            AccountIdentifier identifier,
            AccountName name,
            AccountLastName lastName,
            AccountEmail email,
            AccountPassword password,
            AccountRol rol
            ) {

        var account = Account.create(id, identifier, name, lastName, email, password, rol);

        accountRepository.save(account);
        eventBus.publish(account.pullDomainEvents());
    }
}