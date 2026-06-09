package com.example.Practice.Springboot.APIs8.Entity;

public class Vehicle {
    private String vehicleId;
    private String vehicleModel;
    private double rentalPricePerDay;

    //Constructor
    public Vehicle(String vehicleId, String vehicleModel, double rentalPricePerDay) {
        this.vehicleId = vehicleId;
        this.vehicleModel = vehicleModel;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    //Getter methods
    public String getVehicleId() {
        return vehicleId;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }
}
