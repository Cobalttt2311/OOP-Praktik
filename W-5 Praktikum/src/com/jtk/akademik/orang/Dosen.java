package com.jtk.akademik.orang;

public class Dosen extends Orang{
    private String NIP;
    private String Gelar;

    public Dosen(String name, int age, String gender, String NIP, String Gelar) {
        super(name, age, gender);
        this.NIP = NIP;
        this.Gelar = Gelar;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String nIP) {
        NIP = nIP;
    }

    public String getGelar() {
        return Gelar;
    }

    public void setGelar(String gelar) {
        Gelar = gelar;
    }
}
