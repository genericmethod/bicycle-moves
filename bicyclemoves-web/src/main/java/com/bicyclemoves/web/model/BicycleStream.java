package com.bicyclemoves.web.model;

import com.bicyclemoves.data.enums.BicyclesDataEventType;

public class BicycleStream {

    private String dockId;
    private String dockName;
    private Integer cyclesAvailable;
    private Integer numberOfDocks;
    private Integer bicyclesBroken;
    private BicyclesDataEventType eventType;

    public BicycleStream(String dockId,
                         String dockName,
                         Integer cyclesAvailable,
                         Integer numberOfDocks,
                         Integer bicyclesBroken,
                         BicyclesDataEventType eventType) {
        this.dockId = dockId;
        this.dockName = dockName;
        this.cyclesAvailable = cyclesAvailable;
        this.numberOfDocks = numberOfDocks;
        this.bicyclesBroken = bicyclesBroken;
        this.eventType = eventType;
    }

    private BicycleStream(){}

    public String getDockId() {
        return dockId;
    }

    public String getDockName() {
        return dockName;
    }

    public Integer getCyclesAvailable() {
        return cyclesAvailable;
    }

    public Integer getNumberOfDocks() {
        return numberOfDocks;
    }

    public Integer getBicyclesBroken() {
        return bicyclesBroken;
    }

    public BicyclesDataEventType getEventType() {
        return eventType;
    }
}
