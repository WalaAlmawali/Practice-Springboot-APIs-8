package com.example.Practice.Springboot.APIs8;

import java.util.ArrayList;
import java.util.List;

public class VehicleManager {
    private List<Vehicle> vehicles;

    public VehicleManager() {
        vehicles = new ArrayList<>();

        // Sample Vehicles
        vehicles.add(new Vehicle("V101", "Toyota Corolla", 20));
        vehicles.add(new Vehicle("V102", "Nissan Sunny", 18));
        vehicles.add(new Vehicle("V103", "Hyundai Elantra", 22));
    }

    // POST Operation
    public String addVehicle(Vehicle vehicle) {

        for (Vehicle v : vehicles) {
            if (v.getVehicleId().equals(vehicle.getVehicleId())) {
                return "Vehicle ID already exists\nNo vehicle was added";
            }
        }

        vehicles.add(vehicle);

        return "Vehicle Added Successfully\n"
                + "Vehicle ID: " + vehicle.getVehicleId() + "\n"
                + "Vehicle Model: " + vehicle.getVehicleModel() + "\n"
                + "Rental Price Per Day: " + vehicle.getRentalPricePerDay() + " OMR\n"
                + "Status: Created";
    }

    // Display Vehicles
    public void displayVehicles() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(
                    vehicle.getVehicleId()
                            + " -> "
                            + vehicle.getVehicleModel()
                            + " -> "
                            + vehicle.getRentalPricePerDay()
                            + " OMR/day"
            );
        }
    }

}
