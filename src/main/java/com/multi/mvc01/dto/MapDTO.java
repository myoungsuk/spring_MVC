package com.multi.mvc01.dto;

public class MapDTO {
    private double lat;
    private double lon;



    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }


    @Override
    public String toString() {
        return "MapDTO{" +
                "lat=" + lat +
                ", lon=" + lon +
                '}';
    }

}

