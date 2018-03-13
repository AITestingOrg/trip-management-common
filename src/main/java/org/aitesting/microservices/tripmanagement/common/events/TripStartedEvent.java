package org.aitesting.microservices.tripmanagement.common.events;

import java.util.UUID;
import org.aist.libs.eventsourcing.configuration.eventstore.Event;
import org.aist.libs.eventsourcing.configuration.eventstore.Name;

@Name("TripStartedEvent")
public class TripStartedEvent extends Event {

    public TripStartedEvent(UUID id) {
        super(id);
    }
}
