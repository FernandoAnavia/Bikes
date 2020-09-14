package com.example.bikes;

//20344 Jose Fernando Gonzalez Anavia

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class bikeStationClass {

    @SerializedName("Id")
    @Expose
    public Integer id;
    @SerializedName("Name")
    @Expose
    public String name;
    @SerializedName("Lat")
    @Expose
    public Double lat;
    @SerializedName("Lon")
    @Expose
    public Double lon;
    @SerializedName("address")
    @Expose
    public String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
