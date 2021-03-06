package org.aitesting.microservices.tripmanagement.common.events;

import java.util.UUID;

import org.aist.libs.eventsourcing.configuration.eventstore.Event;
import org.aist.libs.eventsourcing.configuration.eventstore.Name;
import org.aitesting.microservices.tripmanagement.common.models.TripInvoice;

@Name("TripUpdatedEvent")
public class TripUpdatedEvent extends Event {
    // todo: as trip grows this will become unmanageable, move TripDTO here to collect these orphaned properties.
    private UUID userId;
    private String originAddress;
    private String destinationAddress;
    private TripInvoice tripInvoice;

    public TripUpdatedEvent(UUID id,
                            UUID userId,
                            String originAddress,
                            String destinationAddress,
                            TripInvoice tripInvoice) {
        super(id);
        this.userId = userId;
        this.originAddress = originAddress;
        this.destinationAddress = destinationAddress;
        this.tripInvoice = tripInvoice;
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

    public TripInvoice getTripInvoice() {
        return tripInvoice;
    }
}
