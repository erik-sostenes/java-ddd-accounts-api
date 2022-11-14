package com.context.mooc.accounts.infrastructure.persistence;

import com.context.mooc.accounts.domain.*;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountRowMapper implements RowMapper<Account> {
    @Override
    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Account(
                new AccountId(rs.getString("id")),
                new AccountIdentifier(rs.getString("identifier")),
                new AccountName(rs.getString("name")),
                new AccountLastName(rs.getString("last_name")),
                new AccountEmail(rs.getString("email")),
                new AccountPassword(rs.getString("password")),
                new AccountRol(rs.getString("rol"))
                );
    }
}
