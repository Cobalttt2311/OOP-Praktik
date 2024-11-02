package com.example;

public class EconomyFlight extends Flight {
    public EconomyFlight(String id) {
        super(id, "Economy");
    }

    @Override
    public boolean addPassenger(Passenger passenger) {
        return passengers.add(passenger); 
    }

    @Override
    public boolean removePassenger(Passenger passenger) {
        if (!passenger.isVip()) {
            return passengers.remove(passenger); // Pastikan daftar 'passengers' digunakan
        }
        return false;
    }
}
