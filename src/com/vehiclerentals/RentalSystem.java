package com.vehiclerentals;

import com.vehiclerentals.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
    private List<Customer> customers = new ArrayList<>();
    private List<Vehicle> vehicles = new ArrayList<>();
    private List<Rental> rentals = new ArrayList<>();

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void rentVehicle(Customer customer,Vehicle vehicle, int noOfDays){
        if(vehicle.isRented()){
            System.out.println("Vehicle is already rented");
        }else {
            vehicle.setRented(true);
            Rental rental = new Rental(customer,vehicle,noOfDays);
            rentals.add(rental);
            System.out.println("Vehicle rented for "+noOfDays+" days. Total cost of renting will be : ₹"+(vehicle.getRentRate() * noOfDays));
        }
    }

    public void returnVehicle(Vehicle vehicle){
        vehicle.setRented(false);
    }

    public void displayCustomers(){
        for(Customer cust : customers){
            System.out.println(cust);
        }
    }

    public void displayRentals(){
        for(Rental rental : rentals){
            System.out.println(rental);
        }
    }

    public void displayAllVehicles() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
            }
        }


    public void displayAvailableVehicles() {
//        System.out.println("Available Vehicles:");
        for (Vehicle vehicle : vehicles) {
            if (!vehicle.isRented()) {
                System.out.println("Vehicle ID: " + vehicle.getVehicleId() + ", Make: " + vehicle.getMake() + ", Model: " + vehicle.getModel() + ", Rental Rate: ₹" + vehicle.getRentRate());
            }
        }
    }

    public void displayRentedVehicles() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isRented()) {
                System.out.println("Vehicle ID: " + vehicle.getVehicleId() + ", Make: " + vehicle.getMake() + ", Model: " + vehicle.getModel() + ", Rental Rate: ₹" + vehicle.getRentRate());
            }
        }
    }
}