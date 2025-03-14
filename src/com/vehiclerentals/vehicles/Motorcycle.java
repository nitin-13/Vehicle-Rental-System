package com.vehiclerentals.vehicles;

public class Motorcycle extends Vehicle {

    private String type;


    public Motorcycle(String vehicleId, String make, String model, double rentRate, String type) {
        super(vehicleId, make, model, rentRate);
        this.type = type;
    }


    public String getType() {
        return type;
    }

    @Override
    public void displayDetails() {
        System.out.println( "Motorcyle ID: " + getVehicleId() +
                            ", Motorcycle Make: " + getMake() +
                            ", Motorcycle Model: " + getModel() +
                            ", Rental Rate: ₹" + getRentRate() +
                            ", Rented: " + isRented() +
                            ", Geared / Non Geared: "+getType());
    }
}