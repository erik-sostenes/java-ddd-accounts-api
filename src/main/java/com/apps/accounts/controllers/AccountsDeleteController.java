package com.apps.accounts.controllers;

import com.context.mooc.accounts.application.delete.AccountDeleter;
import com.context.mooc.accounts.application.delete.DeleteAccountRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AccountsDeleteController {
    private final AccountDeleter deleter;

    @DeleteMapping(value = "/accounts/{id}")
    public ResponseEntity<String> delete(@PathVariable String id) {
        deleter.delete(new DeleteAccountRequest(id));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
