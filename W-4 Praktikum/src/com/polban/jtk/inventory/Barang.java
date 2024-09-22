package com.polban.jtk.inventory;

public class Barang {
    String kode_barang;
    String nama_barang;
    int stok;

    public Barang(String kode_barang, String nama_barang, int stok) {
        this.kode_barang = kode_barang;
        this.nama_barang = nama_barang;
        this.stok = stok;
    }

    public String getKode_barang() {
        return kode_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public int getStok() {
        return stok;
    }

    void stock(int quantity) {
    if (quantity > 0) {
        stok -= quantity;
    } else {
        System.out.println("Jumlah stok tidak valid");
    }
}


}
