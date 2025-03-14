package com.vehiclerentals;
import com.vehiclerentals.vehicles.*;

import java.util.Scanner;

public class RentalSystem {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Rental rental = new Rental();
        String custId;
        String vehicleId;

        Vehicle car = new Car("1", "Toyota", "Fortuner", 5000, "SUV", "Diesel");
        Vehicle bus = new Bus("2", "Volvo", "B11R", 10000, "Multi-Axle");
        Vehicle bike = new Motorcycle("3", "Royal Enfield", "Interceptor 650", 2000, "Geared");
        Vehicle scooter = new Motorcycle("4", "Honda", "Activa", 1000, "Non Geared");
        Vehicle jeep = new Jeep("5", "Mahindra", "Thar", 6500, "Soft Top");

        rental.addVehicle(car);
        rental.addVehicle(bus);
        rental.addVehicle(bike);
        rental.addVehicle(scooter);
        rental.addVehicle(jeep);

        Customer cust1 = new Customer("C1", "NS", "XY111");
        Customer cust2 = new Customer("C3", "US", "XY222");
        Customer cust3 = new Customer("C3", "XX", "XY3333");
        Customer cust4 = new Customer("C4", "YY", "XY4444");
        Customer cust5 = new Customer("C5", "ZZ", "XY5555");

        rental.addCustomer(cust1);
        rental.addCustomer(cust2);
        rental.addCustomer(cust3);
        rental.addCustomer(cust4);
        rental.addCustomer(cust5);

        while (true) {
            System.out.println("Welcome to the Vehicle Renting Service :\n");
            System.out.println("1. Rent a vehicle");
            System.out.println("2. Return a vehicle");
            System.out.println("3. Display Available Vehicles");
            System.out.println("4. Display Rented Vehicles");
            System.out.println("5. Display All Customers");
            System.out.println("6. Display All Vehicles");
            System.out.println("7. Exit\n");
            System.out.print("Enter your choice -> ");

            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    rental.displayAllCustomers();
                    System.out.print("Enter your Customer ID -> ");
                    in.nextLine();
                    custId = in.nextLine();
                    System.out.println("Below vehicles are available, please select the vehicle ID which you want to rent :");
                    rental.displayAvailableVehicles();
                    System.out.print("Enter VehicleID -> ");
                    vehicleId = in.nextLine();
                    System.out.print("Enter No. of days -> ");
                    int noOfDays = in.nextInt();
                    rental.rentVehicle(custId, vehicleId, noOfDays);
                    break;
                case 2:
                    rental.displayAllCustomers();
                    System.out.print("Enter your Customer ID -> ");
                    in.nextLine();
                    custId = in.nextLine();
                    System.out.println("Below vehicles are rented by you, please select the vehicle ID which you want to return :");
                   rental.findCustomer(custId).getRentedVehicles();
                    vehicleId = in.nextLine();
                    rental.returnVehicle(custId, vehicleId);
                    break;
                case 3:
                    rental.displayAvailableVehicles();
                    break;
                case 4:
                    rental.displayRentedVehicles();
                    break;
                case 5:
                    rental.displayAllCustomers();
                    break;
                case 6:
                    rental.displayAllVehicles();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    in.close();
                    return;
                default:
                    System.out.println("Invalid Choice. Please try again.");
            }
        }
    }
}