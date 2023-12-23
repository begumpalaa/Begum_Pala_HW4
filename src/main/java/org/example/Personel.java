package org.example;

public class Personel {

    private String ad;
    private String soyad;

    public Personel(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public String toString() {
        return ad + " " + soyad;
    }
}
