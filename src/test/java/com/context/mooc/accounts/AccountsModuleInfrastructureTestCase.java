package com.context.mooc.accounts;

import com.context.mooc.shared.infrastructure.config.DataSourceConfig;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ContextConfiguration(classes = DataSourceConfig.class)
@EnableAutoConfiguration
@DataJdbcTest
public abstract class AccountsModuleInfrastructureTestCase {
    @Autowired
    protected JdbcTemplate jdbcTemplate;
}