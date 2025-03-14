package com.vehiclerentals;

public class Customer {
    private String customerId;
    private String name;
    private String contactNo;


    public Customer(String customerId, String name, String contactNo) {
        this.customerId = customerId;
        this.name = name;
        this.contactNo = contactNo;
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

    @Override
    public String toString() {
        return "Customer Details : "+
                " Id : "+customerId+
                " Name : "+name+
                " Contact No. : "+contactNo;
    }


}