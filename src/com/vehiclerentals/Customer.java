package com.vehiclerentals;

import com.vehiclerentals.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private String contactNo;
    private List<Vehicle> rentedVehicles;


    public Customer(String customerId, String name, String contactNo) {
        this.customerId = customerId;
        this.name = name;
        this.contactNo = contactNo;
        this.rentedVehicles = new ArrayList<>();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public void rentVehicle(Vehicle vehicle){
        this.rentedVehicles.add(vehicle);
    }

    public void returnVehicle(Vehicle vehicle){
        this.rentedVehicles.remove(vehicle);
    }

    public void getRentedVehicles(){
        for(Vehicle rentedVehicles : rentedVehicles){
            System.out.println(rentedVehicles);
        }
    }


    @Override
    public String toString() {
        return  "Customer Id : "+customerId+
                " Name : "+name+
                " Contact No. : "+contactNo;
    }


}