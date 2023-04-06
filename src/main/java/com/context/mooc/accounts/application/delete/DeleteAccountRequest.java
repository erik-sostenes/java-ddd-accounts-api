package com.context.mooc.accounts.application.delete;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public final class DeleteAccountRequest {
    private final String id;

    public String id() {
        return id;
    }
}
