package org.aitesting.microservices.tripmanagement.common.events;

import org.aist.libs.eventsourcing.configuration.eventstore.Event;
import org.aist.libs.eventsourcing.configuration.eventstore.Name;

import java.util.UUID;

@Name("TripStartedEvent")
public class TripStartedEvent extends Event {

    public TripStartedEvent(UUID id) {
        super(id);
    }
}
