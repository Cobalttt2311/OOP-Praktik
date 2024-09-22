package com.jtk.akademik.orang;

public class Jadwal {
    private String Hari;
    private String Waktu;
    private String Ruangan;
    Dosen dosen;
    Matakuliah mk;

    public Jadwal(String hari, String waktu, String Ruangan, Dosen dosen, Matakuliah mk) {
        this.Hari = hari;
        this.Waktu = waktu;
        this.Ruangan = Ruangan;
        this.dosen = dosen;
        this.mk= mk;
    }

    public String getHari() {
        return Hari;
    }
    public String getWaktu() {
        return Waktu;
    }       

    public String getRuangan() {
        return Ruangan;
    }       

    public String getDosenName() {
        return dosen.name;
    }   

    public String getMatakuliahName() {
        return mk.NamaMK;
    }   
}
