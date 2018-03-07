package org.aitesting.microservices.tripmanagement.common.events;

import org.aist.libs.eventsourcing.configuration.eventstore.Event;
import org.aist.libs.eventsourcing.configuration.eventstore.Name;

import java.util.UUID;

@Name("TripCanceledEvent")
public class TripCanceledEvent extends Event {

    public TripCanceledEvent(UUID id) {
        super(id);
    }
}
