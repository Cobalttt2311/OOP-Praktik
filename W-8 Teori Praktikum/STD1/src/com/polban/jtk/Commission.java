package com.polban.jtk;

public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    // Konstruktor dengan 6 parameter
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);  // Memanggil konstruktor superclass
        commissionRate = commRate;
        totalSales = 0;  // Inisialisasi total sales
    }

    // Method untuk menambahkan penjualan
    public void addSales(double sales) {
        totalSales += sales;
    }

    // Override metode pay() dari Hourly
    @Override
    public double pay() {
        double payment = super.pay() + (commissionRate * totalSales);
        totalSales = 0;  // Reset total sales setelah membayar komisi
        return payment;
    }

    // Override metode toString() untuk menambahkan informasi total sales
    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        return result;
    }
}
