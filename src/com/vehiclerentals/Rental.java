package com.vehiclerentals;

import com.vehiclerentals.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Rental {
    private List<Customer> customers ;
    private List<Vehicle> vehicles ;
    private int noOfDays;

    public Rental() {
        this.customers = new ArrayList<>();
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public Vehicle findVehicle(String vehicleId){
        for(Vehicle vehicle : vehicles){
            if(vehicle.getVehicleId().equalsIgnoreCase(vehicleId)){
                return vehicle;
            }
        }
        return null;
    }

    public Customer findCustomer(String customerId){
        for(Customer cust : customers){
            if(cust.getCustomerId().equalsIgnoreCase(customerId)){
                return cust;
            }
        }
        return null;
    }

    public void rentVehicle(String customerId,String vehicleId, int noOfDays){

        Customer cust = findCustomer(customerId);
        Vehicle vehicle = findVehicle(vehicleId);

        if(cust != null && vehicle != null && (!vehicle.isRented())){
            vehicle.rentVehicle();
            cust.rentVehicle(vehicle);
            System.out.println("Vehicle rented successfully");
            System.out.println("INFO: "+cust.getName()+" rented "+vehicle.getModel()+" for "+noOfDays+" days. Total cost of renting is : ₹"+(noOfDays * vehicle.getRentRate()));
        }
        else {
            System.out.println("Vehicle already rented");
        }
    }

    public void returnVehicle(String customerId,String vehicleId){

        Customer cust = findCustomer(customerId);
        Vehicle vehicle = findVehicle(vehicleId);

        if(cust != null && vehicle != null && vehicle.isRented()){
            vehicle.returnVehicle();
            cust.returnVehicle(vehicle);
            System.out.println("Vehicle returned successfully");
            System.out.println("INFO: "+cust.getName()+" returned "+vehicle.getModel());
        }
        else {
            System.out.println("Vehicle not rented");
        }
    }


    public void displayAllCustomers(){
        for(Customer cust : customers){
            System.out.println(cust);
        }
    }


    public void displayAllVehicles() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }


    public void displayAvailableVehicles() {
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