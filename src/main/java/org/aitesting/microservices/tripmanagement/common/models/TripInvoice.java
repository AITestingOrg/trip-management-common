package org.aitesting.microservices.tripmanagement.common.models;

import java.util.Date;

public class TripInvoice {
    private String originAddress;
    private String destinationAddress;
    private double distance;
    private int time;
    private double cost;
    private Date lastUpdated;

    private TripInvoice() {}

    public TripInvoice(String originAddress,
                       String destinationAddress,
                       double distance,
                       int time,
                       double cost,
                       Date lastUpdated) {
        this.originAddress = originAddress;
        this.destinationAddress = destinationAddress;
        this.distance = distance;
        this.time = time;
        this.cost = cost;
        this.lastUpdated = lastUpdated;
    }

    public String getOriginAddress() {
        return originAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public double getDistance() {
        return distance;
    }

    public int getTime() {
        return time;
    }

    public double getCost() {
        return cost;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }
}
