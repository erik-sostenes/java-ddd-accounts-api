package com.apps.accounts.controllers;

import com.context.mooc.accounts.application.create.CreateAccountCommand;
import com.shared.domain.bus.command.CommandBus;
import com.shared.infrastructure.ApiController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public final class AccountsPostController extends ApiController {
    public AccountsPostController(CommandBus commandBus) {
        super(commandBus);
    }

    @PostMapping (value = "/accounts/{id}")
    public ResponseEntity<String> create(@PathVariable String id, @RequestBody Request request) {
       dispatch(new CreateAccountCommand(
               id,
               request.identifier(),
               request.name(),
               request.lastName(),
               request.email(),
               request.password(),
               request.rol())
       );

       return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
