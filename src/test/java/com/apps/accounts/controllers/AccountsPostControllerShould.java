package com.apps.accounts.controllers;

import com.apps.accounts.RequestTestCase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

final class AccountsPostControllerShould extends RequestTestCase {
    @Test
    void create_a_valid_account() throws Exception {
        assertRequestWithBody(
                "POST",
                "/accounts/94343721-6baa-4cd5-a0b4-6c5d0419c02d",
                  "{" +
                        "\"identifier\":\"190112446\"," +
                        " \"name\":\"Jared Nicolas V\"," +
                        " \"last_name\": \"Mitchell\"," +
                        " \"email\": \"jared.gibson@gmail.com\"," +
                        " \"password\": \"7or2m27yw6zrkao\"," +
                        " \"rol\": \"CLIENT\"" +
                        "}",
                201
                );
    }

    @Test
    @DisplayName("Fail the creation of a course, by the gmail format invalid")
    void fail_the_creation_of_a_course() throws Exception {
        assertRequestWithBody(
                "POST",
                "/accounts/94343721-6baa-4cd5-a0b4-6c5d0419c02d",
                "{" +
                        "\"identifier\":\"190112446\"," +
                        " \"name\":\"Jared Nicolas V\"," +
                        " \"last_name\": \"Mitchell\"," +
                        " \"email\": \"jared.gibsonmail.com\"," +
                        " \"password\": \"7or2m27yw6zrkao\"," +
                        " \"rol\": \"CLIENT\"" +
                        "}",
                422
                );
    }

    @Test
    @DisplayName("Fail the creation of a course, why the filed")
    void fail_the_creation_of_a_course_for_missing_fields() throws Exception {
        assertRequestWithBody(
                "POST",
                "/accounts/94343721-6baa-4cd5-a0b4-6c5d0419c02d",
                "{" +
                        "\"identifier\":\"190112446\"," +
                        " \"last_name\": \"Mitchell\"," +
                        " \"email\": \"jared.gibson@gmail.com\"," +
                        " \"password\": \"7or2m27yw6zrkao\"," +
                        " \"rol\": \"CLIENT\"" +
                        "}",
                422
        );
    }
}