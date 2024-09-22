package com.jtk.akademik.orang;

public class Matakuliah {
    private String KodeMK;
    public String NamaMK;
    Dosen dosen;

    public Matakuliah(String NamaMK, String kodeMK, Dosen dosen) {
        this.KodeMK = kodeMK;
        this.NamaMK = NamaMK;
        this.dosen = dosen;
    }

    public String getDosenName() {
        return dosen.name;
    }

    public String getKodeMK() {
        return KodeMK;
    }   

    public String getNamaMK(){
        return NamaMK;
    }
}
