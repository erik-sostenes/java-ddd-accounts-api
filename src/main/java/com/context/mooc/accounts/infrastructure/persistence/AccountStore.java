package com.context.mooc.accounts.infrastructure.persistence;

import com.context.mooc.accounts.domain.Account;
import com.context.mooc.accounts.domain.AccountId;
import com.context.mooc.accounts.domain.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class AccountStore implements AccountRepository {
    private final JdbcTemplate jdbcTemplate;
    @Override
    public void save(Account account) {
        var sql = "INSERT INTO users(id, identifier, rol, name, last_name, email, password) VALUES(?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql,
                account.id().value(),
                account.identifier().value(),
                account.rol().value(),
                account.name().value(),
                account.lastName().value(),
                account.email().value(),
                account.password().value()
        );
    }

    @Override
    public void update(AccountId id, Account account) {
        var sql = "UPDATE users SET identifier = ?, rol = ?, name = ?, last_name = ?, email = ?, password = ? WHERE id = ?";
        jdbcTemplate.update(sql,
                account.identifier().value(),
                account.rol().value(),
                account.name().value(),
                account.lastName().value(),
                account.email().value(),
                account.password().value(),
                id.value());
    }

    @Override
    public void delete(AccountId id) {
        var sql = "DELETE FROM users WHERE ID = ?";
        jdbcTemplate.update(sql, id.value());
    }

    @Override
    public Optional<Account> getById(AccountId id) {
        var sql = "SELECT * FROM users u WHERE u.id = ?";
        return jdbcTemplate.query(sql, new AccountRowMapper(), id.value()).stream().findFirst();
    }
}
