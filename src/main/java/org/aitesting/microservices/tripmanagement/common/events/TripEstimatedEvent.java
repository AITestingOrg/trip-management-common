package org.aitesting.microservices.tripmanagement.common.events;

import java.util.UUID;

import org.aist.libs.eventsourcing.configuration.eventstore.Event;
import org.aist.libs.eventsourcing.configuration.eventstore.Name;
import org.aitesting.microservices.tripmanagement.common.models.TripInvoice;

@Name("TripEstimatedEvent")
public class TripEstimatedEvent extends Event {
    private TripInvoice tripInvoice;

    public TripEstimatedEvent(UUID tripId, TripInvoice invoice) {
        super(tripId);
    }

    public TripInvoice getTripInvoice() {
        return tripInvoice;
    }
}
