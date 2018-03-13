package org.aitesting.microservices.tripmanagement.common.events;

import java.util.UUID;
import org.aist.libs.eventsourcing.configuration.eventstore.Event;
import org.aist.libs.eventsourcing.configuration.eventstore.Name;

@Name("TripCompletedEvent")
public class TripCompletedEvent extends Event {

    public TripCompletedEvent(UUID id) {
        super(id);
    }
}
