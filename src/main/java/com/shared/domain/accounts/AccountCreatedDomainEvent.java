package com.shared.domain.accounts;

import com.shared.domain.bus.event.DomainEvent;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.HashMap;

@EqualsAndHashCode
public final class AccountCreatedDomainEvent extends DomainEvent {
    private final String identifier;
    private final String name;
    private final String lastName;
    private final String password;
    private final String email;
    private final String rol;

    public AccountCreatedDomainEvent() {
        super(null);

        this.identifier = null;
        this.name = null;
        this.lastName = null;
        this.password = null;
        this.email = null;
        this.rol = null;

    }

    public AccountCreatedDomainEvent(
            String aggregateId,
            String identifier,
            String name,
            String lastName,
            String password,
            String email,
            String rol
    ) {
        super(aggregateId);

        this.identifier = identifier;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.rol = rol;

    }

    public AccountCreatedDomainEvent(
            String aggregateId,
            String eventId,
            String occurredOn,
            String identifier,
            String name,
            String lastName,
            String password,
            String email,
            String rol
    ) {
        super(aggregateId, eventId, occurredOn);

        this.identifier = identifier;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.rol = rol;

    }

    @Override
    public String eventName() {
        return "account.created";
    }

    @Override
    public HashMap<String, Serializable> toPrimitives() {
        return new HashMap<>(){{
            put("identifier", identifier);
            put("name", name);
            put("lastName", lastName);
            put("password", password);
            put("email", email);
            put("rol", rol);
        }};
    }

    @Override
    public AccountCreatedDomainEvent fromPrimitives(
            String aggregateId,
            HashMap<String, Serializable> body,
            String eventId,
            String occurredOn
    ) {
        return new AccountCreatedDomainEvent(
                aggregateId,
                eventId,
                occurredOn,
                (String) body.get("identifier"),
                (String) body.get("name"),
                (String) body.get("lastName"),
                (String) body.get("password"),
                (String) body.get("email"),
                (String) body.get("rol")
        );
    }
}
