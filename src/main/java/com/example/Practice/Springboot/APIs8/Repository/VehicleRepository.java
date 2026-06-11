package com.example.Practice.Springboot.APIs8.Repository;

import com.example.Practice.Springboot.APIs8.Entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
