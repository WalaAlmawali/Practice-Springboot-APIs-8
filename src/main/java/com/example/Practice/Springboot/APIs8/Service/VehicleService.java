package com.example.Practice.Springboot.APIs8.Service;

import com.example.Practice.Springboot.APIs8.Entity.Employee;
import com.example.Practice.Springboot.APIs8.Entity.Vehicle;
import com.example.Practice.Springboot.APIs8.Repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    private final VehicleRepository repository;

    public VehicleService(VehicleRepository repository) {
        this.repository = repository;
    }

    // Add vehicle
    public Vehicle addEmployee(Vehicle vehicle) {
        return repository.save(vehicle);
    }

    //Get all vehicle
    public List<Vehicle> getAllVehicle() {
        return repository.findAll();
    }

    // Get vehicle by ID
    public Vehicle getVehicleById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Vehicle Not Found"));
    }

    // Update vehicle
    public Vehicle updateVehicle(Long id, Vehicle vehicle) {

        Vehicle existing = getVehicleById(id);

        existing.setVehicleModel(vehicle.getVehicleModel());

        existing.setRentalPricePerDay(vehicle.getRentalPricePerDay());

        return repository.save(existing);
    }

    // Delete vehicle
    public void deleteVehicle(Long id) {

        repository.deleteById(id);
    }

}
