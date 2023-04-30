package com.shared.infrastructure;

import com.shared.domain.bus.command.Command;
import com.shared.domain.bus.command.CommandBus;
import com.shared.domain.bus.command.CommandHandlerExecutionError;
import com.shared.domain.bus.query.Query;
import com.shared.domain.bus.query.QueryBus;
import com.shared.domain.bus.query.QueryHandlerExecutionError;
import com.shared.domain.DomainError;
import org.springframework.http.HttpStatus;

import java.util.HashMap;

public abstract class ApiController {
    private final CommandBus commandBus;

    protected ApiController(CommandBus commandBus) {
        this.commandBus = commandBus;
    }

    protected void dispatch(Command command) throws CommandHandlerExecutionError {
        commandBus.dispatch(command);
    }
}
