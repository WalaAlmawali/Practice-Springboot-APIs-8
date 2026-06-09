package com.example.Practice.Springboot.APIs8.Controller;

import com.example.Practice.Springboot.APIs8.Entity.Vehicle;
import com.example.Practice.Springboot.APIs8.Service.VehicleManager;

public class VehicleDemo {
    public static void main(String[] args) {

        VehicleManager manager = new VehicleManager();

        System.out.println("=== Existing Vehicles ===");
        manager.displayVehicles();

       // New Vehicle (POST Request Simulation)
        Vehicle newVehicle = new Vehicle("V104", "Kia Sportage", 30);

        System.out.println("\n=== Processing POST Operation ===");
        System.out.println(manager.addVehicle(newVehicle));

        System.out.println("\n=== Updated Vehicle List ===");
        manager.displayVehicles();
    }
}
