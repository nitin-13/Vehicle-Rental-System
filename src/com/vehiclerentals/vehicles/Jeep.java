package com.vehiclerentals.vehicles;

public class Jeep extends Vehicle {
    private String type;


    public Jeep(String vehicleId, String make, String model, double rentRate,  String type) {
        super(vehicleId, make, model, rentRate);
        this.type = type;
    }


    public String getType() {
        return type;
    }

    @Override
    public void displayDetails() {
        System.out.println( "Jeep ID: " + getVehicleId() +
                            ",Jeep Make: " + getMake() +
                            ",Jeep Model: " + getModel() +
                            ", Rental Rate: ₹" + getRentRate() +
                            ", Rented: " + isRented()+
                            ", AWD OR FWD: "+getType());
    }
}