package org.aitesting.microservices.tripmanagement.common.events;

import org.aist.libs.eventsourcing.configuration.eventstore.Event;
import org.aist.libs.eventsourcing.configuration.eventstore.Name;

import java.util.UUID;

@Name("TripCompletedEvent")
public class TripCompletedEvent extends Event {

    public TripCompletedEvent(UUID id) {
        super(id);
    }
}
