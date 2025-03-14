package com.vehiclerentals.vehicles;

public class Car extends Vehicle{
    private String type;

    public String getFuelType() {
        return fuelType;
    }

    private String fuelType;


    public Car(String vehicleId, String make, String model, double rentRate, String type,String fuelType) {
        super(vehicleId, make, model, rentRate);
        this.type = type;
        this.fuelType = fuelType;
    }


    public String getType() {
        return type;
    }

    @Override
    public void displayDetails() {
        System.out.println( "Car ID: " + getVehicleId() +
                ", Car Make: " + getMake() +
                ", Car Model: " + getModel() +
                ", Rental Rate: ₹" + getRentRate() +
                ", Rented: " + isRented() +
                ", Size: "+getType()+
                ", Fuel Type: "+getFuelType());
    }
}