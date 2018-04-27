package org.aitesting.microservices.tripmanagement.common.events;

import org.aist.libs.eventsourcing.configuration.eventstore.Event;
import org.aist.libs.eventsourcing.configuration.eventstore.Name;

import java.util.UUID;

@Name("TripAcceptedEvent")
public class TripAcceptedEvent extends Event {

    private UUID driverId;

    public TripAcceptedEvent(UUID id, UUID driverId) {
        super(id);
        this.driverId = driverId;
    }

    public UUID getDriverId() {
        return driverId;
    }
}
