package com.apps.accounts.controllers;

import com.context.mooc.accounts.application.update.AccountUpdater;
import com.context.mooc.accounts.application.update.UpdateAccountRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public final class AccountsPutController {
    private final AccountUpdater updater;

    @PutMapping(value = "/accounts/{id}")
    public ResponseEntity<String> update(@PathVariable String id, @RequestBody Request request) {
        updater.update(new UpdateAccountRequest(id, request.identifier(), request.name(), request.lastName(), request.email(), request.password(), request.rol()));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}