package com.example.Practice.Springboot.APIs8.Controller;

import com.example.Practice.Springboot.APIs8.Entity.Employee;
import com.example.Practice.Springboot.APIs8.Entity.Vehicle;
import com.example.Practice.Springboot.APIs8.Service.EmployeeService;
import com.example.Practice.Springboot.APIs8.Service.VehicleService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    private final VehicleService service;

    public VehicleController(VehicleService service) {
        this.service = service;
    }

    @GetMapping
    public List<Vehicle> getVehicles() {
        return service.getAllVehicle();
    }

    @GetMapping("/{id}")
    public Vehicle getVehicle(@PathVariable Long id) {

        return service.getVehicleById(id);
    }

    @PostMapping
    public Vehicle addVehicle(
            @Valid @RequestBody Vehicle vehicle) {

        return service.addVehicle(vehicle);
    }

    @PutMapping("/{id}")
    public Vehicle updateVehicle(
            @PathVariable Long id,
            @RequestBody Vehicle vehicle) {

        return service.updateVehicle(id, vehicle);
    }

    @DeleteMapping("/{id}")
    public String deleteVehicle(
            @PathVariable Long id) {

        service.deleteVehicle(id);

        return "Vehicle Deleted Successfully";
    }
}
