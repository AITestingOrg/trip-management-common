package org.aitesting.microservices.tripmanagement.common.events;

import java.util.UUID;
import org.aist.libs.eventsourcing.configuration.eventstore.Event;
import org.aist.libs.eventsourcing.configuration.eventstore.Name;

@Name("TripCanceledEvent")
public class TripCanceledEvent extends Event {

    public TripCanceledEvent(UUID id) {
        super(id);
    }
}
