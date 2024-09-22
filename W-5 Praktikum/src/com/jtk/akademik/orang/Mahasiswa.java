package com.jtk.akademik.orang;

public class Mahasiswa extends Orang{
    private String NIM;
    private String prodi;
    private String semester;

    public Mahasiswa(String name, int age, String gender, String NIM, String prodi, String semester) {
        super(name, age, gender);
        this.NIM = NIM;
        this.prodi = prodi;
        this.semester = semester;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String nIM) {
        NIM = nIM;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}