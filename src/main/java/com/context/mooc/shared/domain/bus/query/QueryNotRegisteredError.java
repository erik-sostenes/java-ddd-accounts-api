package com.context.mooc.shared.domain.bus.query;

public class QueryNotRegisteredError extends Exception{
    public QueryNotRegisteredError(Class<? extends Query> query) {
        super(String.format("The query <%s> hasn´t a query handler associated", query.toString()));
    }
}
