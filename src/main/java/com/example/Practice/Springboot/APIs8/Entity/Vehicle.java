package com.example.Practice.Springboot.APIs8.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "Vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleId;
    @NotBlank
    private String vehicleModel;
    @NotBlank
    private double rentalPricePerDay;

    //Constructor
    public Vehicle( String vehicleModel, double rentalPricePerDay) {
        this.vehicleModel = vehicleModel;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    //Getter methods
    public Long getVehicleId() {
        return vehicleId;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }
}
