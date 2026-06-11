package com.example.Practice.Springboot.APIs8.Repository;

import com.example.Practice.Springboot.APIs8.Entity.Campaign;
import com.example.Practice.Springboot.APIs8.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepository extends JpaRepository<Campaign, Long> {
}
