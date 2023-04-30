package com.apps.accounts.controllers;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
final class Request {
    private String identifier;
    private String name;
    private String last_name;
    private String email;
    private String password;
    private String rol;

    public String identifier() {
        return identifier;
    }

    public String name() {
        return name;
    }

    public String lastName() {
        return last_name;
    }

    public String email() {
        return email;
    }

    public String password() {
        return password;
    }

    public String rol() {
        return rol;
    }
}
