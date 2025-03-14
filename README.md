# Vehicle-Rental-System
This project simulates a basic vehicle rental system, using core Object-Oriented Programming (OOP) concepts like encapsulation, inheritance, and polymorphism.

OOP Principles: The code demonstrates encapsulation, inheritance, and polymorphism.  
Data Structures: ArrayList is used

## Project Structure:
```
VehicleRentalSystem
          /com.vehiclerentals
                     └── vehicles
                     ├── Vehicle.java
                     ├── Car.java
                     ├── Motorcycle.java
                     ├── Bus.java
                     └── Main.java
         ├── Customer.java
         ├── Rental.java
         ├── RentalSystem.java
         └── Main.java
```

## Classes:
1. Vehicle.java (Abstract Class): This is the base class for all vehicles. It defines common attributes and methods.  
    Description:
    - abstract class: Vehicle cannot be instantiated directly.
    - Encapsulation: Private attributes are accessed through public getters and setters.
    - abstract method displayDetails(): Forces subclasses to implement specific details.
    - toString(): Provides a string representation of the vehicle.

2. Car.java (Subclass of Vehicle): Represents cars with specific attributes.  
   Description:
   - Inheritance: Car inherits from Vehicle.
   - Polymorphism: Overrides displayDetails() and toString().

3. Motorcycle.java (Subclass of Vehicle): Represents motorcycles with specific attributes.  
    Description: 
   - Inheritance: Motorcycle inherits from Vehicle. 
   - Polymorphism: Overrides displayDetails() and toString().

4. Customer.java: Represents customers.

5. Rental.java: Represents a rental transaction.

6. RentalSystem.java: Manages vehicles, customers, and rentals.

7. Main.java: The main class to drive the system.