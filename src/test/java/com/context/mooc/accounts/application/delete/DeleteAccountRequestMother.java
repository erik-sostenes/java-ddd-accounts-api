package com.context.mooc.accounts.application.delete;

import com.context.mooc.accounts.domain.*;

final class DeleteAccountRequestMother {
    public static DeleteAccountRequest create(AccountId id) {
        return new DeleteAccountRequest(id.value());
    }

    public static DeleteAccountRequest random() {
        return create(AccountIdMother.random());
    }
}
