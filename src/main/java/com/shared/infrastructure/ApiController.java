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
    private final QueryBus queryBus;
    private final CommandBus commandBus;


    protected ApiController(QueryBus queryBus, CommandBus commandBus) {
        this.queryBus = queryBus;
        this.commandBus = commandBus;
    }

    protected void dispatch(Command command) throws CommandHandlerExecutionError {
        commandBus.dispatch(command);
    }

    protected <R> R ask(Query query) throws QueryHandlerExecutionError {
        return queryBus.ask(query);
    }

    abstract public HashMap<Class<? extends DomainError>, HttpStatus> errorMapping();
}
