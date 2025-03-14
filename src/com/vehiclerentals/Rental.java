package com.vehiclerentals;

import com.vehiclerentals.vehicles.Vehicle;

public class Rental {
    private Customer customer;
    private Vehicle vehicle;
    private int noOfDaysRented;


    public Rental(Customer customer, Vehicle vehicle, int noOfDaysRented) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.noOfDaysRented = noOfDaysRented;
    }


    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getNoOfDaysRented() {
        return noOfDaysRented;
    }

    public double rentalCost(){
        return vehicle.getRentRate() * noOfDaysRented;
    }

    @Override
    public String toString() {
        return "Rental Details : Customer - " + customer.getName() +
                ", Vehicle - " + vehicle.getMake() +
                " " + vehicle.getModel() +
                ", Days: " + noOfDaysRented +
                ", Total Rental Cost: ₹" + rentalCost();
    }
}