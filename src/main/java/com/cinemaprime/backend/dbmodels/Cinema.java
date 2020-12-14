package com.cinemaprime.backend.dbmodels;

import com.cinemaprime.backend.enums.Öffnungszeit;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cinemas")
public class Cinema {

    @Id
    public String id;

    private String name;
    private int parkplaetze;
    private boolean geoeffnet;
    private Öffnungszeit oeffnungszeit;

    public Cinema() {}

    public Cinema(String name) {
        this.name = name;
    }

    public Cinema(String name, int parkplaetze, boolean geoeffnet, Öffnungszeit oeffnungszeit){
        this.name = name;
        this.parkplaetze = parkplaetze;
        this.geoeffnet = geoeffnet;
        this.oeffnungszeit = oeffnungszeit;
    }

    public Öffnungszeit OeffnungszeitAnzeigen(){
        return this.oeffnungszeit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParkplaetze() {
        return parkplaetze;
    }

    public void setParkplaetze(int parkplaetze) {
        this.parkplaetze = parkplaetze;
    }

    public boolean isGeoeffnet() {
        return geoeffnet;
    }

    public void setGeoeffnet(boolean geoeffnet) {
        this.geoeffnet = geoeffnet;
    }

    public Öffnungszeit getOeffnungszeit() {
        return oeffnungszeit;
    }

    public void setOeffnungszeit(Öffnungszeit oeffnungszeit) {
        this.oeffnungszeit = oeffnungszeit;
    }

}
