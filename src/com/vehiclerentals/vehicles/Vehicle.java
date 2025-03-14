package com.vehiclerentals.vehicles;

public abstract class Vehicle {
    private String vehicleId;
    private String make;
    private String model;
    private double rentRate;
    private boolean isRented;


    public Vehicle(String vehicleId, String make, String model, double rentRate) {
        this.vehicleId = vehicleId;
        this.make = make;
        this.model = model;
        this.rentRate = rentRate;
        this.isRented = false;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getRentRate() {
        return rentRate;
    }

    public void setRentRate(double rentRate) {
        this.rentRate = rentRate;
    }

    public boolean isRented() {
        return isRented;
    }

    public void rentVehicle() {
        this.isRented = true;
    }

    public void returnVehicle() {
        this.isRented = false;
    }

    public abstract void displayDetails();

    @Override
    public String toString() {
         return "Vehicle ID: " + vehicleId + ", Make: " + make + ", Model: " + model + ", Rental Rate: ₹" + rentRate + ", Rented: " + isRented;

    }
}