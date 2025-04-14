package com.geoguesser.model;

public class StateLocation {
    private String state;
    private String capital;
    private double latitude;
    private double longitude;
    private double zoom;
    private double heading;
    private double pitch;

    public StateLocation(String state, String capital, double latitude, double longitude, double zoom, double heading, double pitch) {
        this.state = state;
        this.capital = capital;
        this.latitude = latitude;
        this.longitude = longitude;
        this.zoom = zoom;
        this.heading = heading;
        this.pitch = pitch;
    }

    public String getState() {
        return state;
    }

    public String getCapital() {
        return capital;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getZoom() {
        return zoom;
    }

    public double getHeading() {
        return heading;
    }

    public double getPitch() {
        return pitch;
    }
}