package com.vehiclerentals.vehicles;

public class Bus extends Vehicle{
    private String type;

    public Bus(String vehicleId, String make, String model, double rentRate, String type) {
        super(vehicleId, make, model, rentRate);
        this.type = type;
    }


    public String getType() {
        return type;
    }

    @Override
    public void displayDetails() {
        System.out.println( "Bus ID: " + getVehicleId() +
                            ",Bus Make: " + getMake() +
                            ",Bus Model: " + getModel() +
                            ", Rental Rate: ₹" + getRentRate() +
                            ", Rented: " + isRented());
    }
}