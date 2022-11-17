package com.apps.accounts.controllers;

import com.context.mooc.accounts.application.create.AccountCreator;
import com.context.mooc.accounts.application.create.CreateAccountRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public final class AccountsPostController {
    private final AccountCreator creator;
    @PostMapping (value = "/accounts/{id}")
    public ResponseEntity<String> create(@PathVariable String id, @RequestBody Request request) {
       creator.create(new CreateAccountRequest(id, request.identifier(), request.name(), request.lastName(), request.email(), request.password(), request.rol()));
       return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
