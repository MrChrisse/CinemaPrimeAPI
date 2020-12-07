package com.cinemaprime.backend.dbmodels;

import com.cinemaprime.backend.enums.Öffnungszeit;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Cinemas")
public class Cinema {

    @Id
    public String id;

    private String Name;
    private int Parkplaetze;
    private boolean geoeffnet;
    private Öffnungszeit oeffnungszeit;

    public Cinema() {}

    public Cinema(String name, int parkplaetze, boolean geoeffnet, Öffnungszeit oeffnungszeit){
        this.Name = name;
        this.Parkplaetze = parkplaetze;
        this.geoeffnet = geoeffnet;
        this.oeffnungszeit = oeffnungszeit;
    }

    public Öffnungszeit ÖffnungszeitAnzeigen(){
        return this.oeffnungszeit;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getParkplaetze() {
        return Parkplaetze;
    }

    public void setParkplaetze(int parkplaetze) {
        Parkplaetze = parkplaetze;
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
