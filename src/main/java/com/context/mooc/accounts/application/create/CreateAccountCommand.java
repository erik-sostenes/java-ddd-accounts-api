package com.context.mooc.accounts.application.create;

import com.shared.domain.bus.command.Command;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public final class CreateAccountRequest implements Command {
    private String id;
    private String identifier;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String rol;

    public String id() {
        return id;
    }

    public String identifier() {
        return identifier;
    }

    public String name() {
        return name;
    }

    public String lastName() {
        return lastName;
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
