package org.aitesting.microservices.tripmanagement.common.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TripInvoice {
    private String originAddress;
    private String destinationAddress;
    private double distance;
    private int duration;
    private double cost;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastUpdated;

    private TripInvoice() {}

    public TripInvoice(String originAddress,
                       String destinationAddress,
                       double distance,
                       int duration,
                       double cost,
                       Date lastUpdated) {
        this.originAddress = originAddress;
        this.destinationAddress = destinationAddress;
        this.distance = distance;
        this.duration = duration;
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

    public int getDuration() {
        return duration;
    }

    public double getCost() {
        return cost;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }
}
