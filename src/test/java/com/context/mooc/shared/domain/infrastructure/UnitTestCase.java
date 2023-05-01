package com.context.mooc.shared.domain.infrastructure;

import com.shared.domain.bus.event.DomainEvent;
import com.shared.domain.bus.event.EventBus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public abstract class UnitTestCase {
    protected EventBus eventBus;

    @BeforeEach
    protected void setUp() {
        eventBus = mock(EventBus.class);
    }

    public void shouldHavePublished(List<DomainEvent> domainEvents) {
        verify(eventBus, atLeastOnce()).publish(domainEvents);
    }

    public void shouldHavePublished(DomainEvent domainEvent) {
        shouldHavePublished(Collections.singletonList(domainEvent));
    }
}
