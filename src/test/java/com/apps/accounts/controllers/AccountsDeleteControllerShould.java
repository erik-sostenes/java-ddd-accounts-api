package com.apps.accounts.controllers;

import com.apps.accounts.RequestTestCase;
import org.junit.jupiter.api.Test;

final class AccountsDeleteControllerShould extends RequestTestCase {
    @Test
    void delete_a_valid_account() throws Exception {
        assertRequest(
                "DELETE",
                "/accounts/1ff338a7-3536-4205-8254-511c6e4fbf63",
                200
        );
    }

}