package com.context.mooc.accounts.application.create;

import com.context.mooc.accounts.domain.*;
import com.shared.domain.bus.command.CommandHandler;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public final class CreateAccountCommandHandler implements CommandHandler<CreateAccountCommand> {
    private final AccountCreator accountCreator;

    @Override
    public void handle(CreateAccountCommand command) {
        var id = new AccountId(command.id());
        var identifier = new AccountIdentifier(command.identifier());
        var name = new AccountName(command.name());
        var lastName = new AccountLastName(command.lastName());
        var email = new AccountEmail(command.email());
        var password = new AccountPassword(command.password());
        var rol = new AccountRol(command.rol());

        accountCreator.create(id, identifier, name, lastName, email, password, rol);
    }
}
