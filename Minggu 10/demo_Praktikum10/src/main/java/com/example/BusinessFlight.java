package com.example;

public class BusinessFlight extends Flight {
    public BusinessFlight(String id) {
        super(id, "Business");
    }

    @Override
    public boolean addPassenger(Passenger passenger) {
        if (passenger.isVip()) {
            return super.addPassenger(passenger);
        }
        return false;
    }

    @Override
    public boolean removePassenger(Passenger passenger) {
        return false;
    }
}
