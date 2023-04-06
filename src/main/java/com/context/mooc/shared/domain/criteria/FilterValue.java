package com.context.mooc.shared.domain.criteria;

import com.context.mooc.shared.domain.StringValueObject;

public final class FilterValue extends StringValueObject {
    public FilterValue(String value, String regex) {
        super(value, regex);
    }
}
