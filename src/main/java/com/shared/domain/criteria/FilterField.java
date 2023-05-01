package com.shared.domain.criteria;

import com.context.mooc.shared.domain.StringValueObject;

public final class FilterField extends StringValueObject {
    public FilterField(String value, String regex) {
        super(value, regex);
    }
}
