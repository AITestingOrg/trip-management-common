package org.aitesting.microservices.tripmanagement.common.events;

import org.aist.libs.eventsourcing.configuration.eventstore.Event;
import org.aist.libs.eventsourcing.configuration.eventstore.Name;

import java.util.UUID;

@Name("TripCreatedEvent")
public class TripCreatedEvent extends Event {
    private UUID userId;
    private String originAddress;
    private String destinationAddress;

    public TripCreatedEvent(UUID id, UUID userId, String originAddress, String destinationAddress){
        super(id);
        this.userId = userId;
        this.originAddress = originAddress;
        this.destinationAddress = destinationAddress;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getOriginAddress() {
        return originAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }
}
