package com.polban.jtk;

public class Executive extends Employee {
    private double bonus;

    public Executive(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        bonus = 0; // Inisialisasi bonus menjadi 0
    }

    // Method untuk menambahkan bonus
    public void awardBonus(double execBonus) {
        bonus = execBonus;
    }

    @Override
    public double pay() {
        double payment = super.pay() + bonus;
        bonus = 0; // Reset bonus setelah pembayaran
        return payment;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nBonus: " + bonus;
        return result;
    }
}

