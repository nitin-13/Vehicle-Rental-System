package com.vehiclerentals;
import com.vehiclerentals.vehicles.*;

public class Main {
    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem();

        Vehicle car = new Car("1","Toyota","Fortuner",5000,"SUV","Diesel");
        Vehicle bus = new Bus("2","Volvo","B11R",10000,"Multi-Axle");
        Vehicle bike = new Motorcycle("3","Royal Enfield","Interceptor 650",2000,"Geared");
        Vehicle scooter = new Motorcycle("4","Honda","Activa",1000,"Non Geared");
        Vehicle jeep = new Jeep("5","Mahindra","Thar",6500,"Soft Top");

        rentalSystem.addVehicle(car);
        rentalSystem.addVehicle(bus);
        rentalSystem.addVehicle(bike);
        rentalSystem.addVehicle(scooter);
        rentalSystem.addVehicle(jeep);

        Customer cust1 = new Customer("C1","NS","XY111");
        Customer cust2 = new Customer("C3","US","XY222");
        Customer cust3 = new Customer("C3","XX","XY3333");
        Customer cust4 = new Customer("C4","YY","XY4444");
        Customer cust5 = new Customer("C5","ZZ","XY5555");

        rentalSystem.addCustomer(cust1);
        rentalSystem.addCustomer(cust2);
        rentalSystem.addCustomer(cust3);
        rentalSystem.addCustomer(cust4);
        rentalSystem.addCustomer(cust5);

        System.out.println("Below are our customers : ");
        rentalSystem.displayCustomers();

        System.out.println("\nBelow are our vehicles : ");
        rentalSystem.displayAllVehicles();

        System.out.println("\nLets rent out a car, Details of car rented : ");
        rentalSystem.displayRentedVehicles();
        rentalSystem.rentVehicle(cust1,car,20);

        System.out.println("\nList of vehicles available now : ");
        rentalSystem.displayAvailableVehicles();

        System.out.println("\nReturn Rented Vehicle. List of vehicles available now after returning : ");
        rentalSystem.returnVehicle(car);
        rentalSystem.displayAvailableVehicles();



    }
}