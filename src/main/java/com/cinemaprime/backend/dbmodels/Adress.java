package com.cinemaprime.backend.dbmodels;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Adresses")
public class Adress {

    @Id
    public String id;

    private String Land;
    private String Stadt;
    private long PLZ;
    private String Straße;
    private int Hausnummer;
    private String Adresszusatz;

    public Adress() {}

    public Adress(String land, String stadt, long plz, String straße, int hausnummer, String adresszusatz){
        this.Land = land;
        this.Stadt = stadt;
        this.PLZ = plz;
        this.Straße = straße;
        this.Hausnummer = hausnummer;
        this.Adresszusatz = adresszusatz;
    }

    public String returnFullAdress(){
        String fullAdress;
        fullAdress = getStraße() + " " + getHausnummer() + " " + getAdresszusatz() + " " + getPLZ() + " " + getStadt() + " " + getLand();
        return fullAdress;
    }

    public String getLand() {
        return Land;
    }

    public void setLand(String land) {
        Land = land;
    }

    public String getStadt() {
        return Stadt;
    }

    public void setStadt(String stadt) {
        Stadt = stadt;
    }

    public long getPLZ() {
        return PLZ;
    }

    public void setPLZ(long PLZ) {
        this.PLZ = PLZ;
    }

    public String getStraße() {
        return Straße;
    }

    public void setStraße(String straße) {
        Straße = straße;
    }

    public int getHausnummer() {
        return Hausnummer;
    }

    public void setHausnummer(int hausnummer) {
        Hausnummer = hausnummer;
    }

    public String getAdresszusatz() {
        return Adresszusatz;
    }

    public void setAdresszusatz(String adresszusatz) {
        Adresszusatz = adresszusatz;
    }

}
