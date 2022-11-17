package com.apps.accounts.controllers;

import com.apps.accounts.RequestTestCase;
import org.junit.jupiter.api.Test;

public class AccountsPutControllerShould extends RequestTestCase {
    @Test
    void update_a_valid_account() throws Exception {
        assertRequestWithBody(
                "PUT",
                "/accounts/f67f9e37-d75e-499a-95be-30ebf6c25131",
                "{" +
                        "\"identifier\":\"190112446\"," +
                        " \"name\":\"Jared Nicolas Z\"," +
                        " \"last_name\": \"Mitchell\"," +
                        " \"email\": \"jared.gibson@gmail.com\"," +
                        " \"password\": \"gernoin96w8jb62\"," +
                        " \"rol\": \"CLIENT\"" +
                        "}",
                200
        );
    }
}