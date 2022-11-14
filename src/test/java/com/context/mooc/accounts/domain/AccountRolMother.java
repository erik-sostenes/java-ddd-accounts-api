package com.context.mooc.accounts.domain;
public final class AccountRolMother {
    public static AccountRol create(String value) {
        return new AccountRol(value);
    }
    public static AccountRol randomClientRol() {
        return create("CLIENT");
    }
    public static AccountRol randomProvideRol() {
        return create("PROVIDE");
    }
}