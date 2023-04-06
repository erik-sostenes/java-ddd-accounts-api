package com.context.mooc.accounts.application.delete;

import com.context.mooc.accounts.domain.AccountId;
import com.context.mooc.accounts.domain.AccountRepository;
import com.context.mooc.shared.domain.exceptions.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static java.lang.String.format;
@Service
@AllArgsConstructor
public final class AccountDeleter {
    private AccountRepository repository;
    public void delete(DeleteAccountRequest request) {
        var id = new AccountId(request.id());

        boolean isPresent = repository.getById(id).isPresent();
        if (!isPresent) throw new NotFoundException(format("Account with id '%s' not found", id.value()));

        repository.delete(id);
    }
}