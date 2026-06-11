package com.example.Practice.Springboot.APIs8.Controller;

import com.example.Practice.Springboot.APIs8.Entity.Campaign;
import com.example.Practice.Springboot.APIs8.Service.CampaignService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/campaigns")
public class CampaignController {
    private final CampaignService service;

    public CampaignController(CampaignService service) {
        this.service = service;
    }

    @GetMapping
    public List<Campaign> getAllCampaign(){
        return service.getAllCampaign();
    }

    @GetMapping("/{id}")
    public Campaign gitCampaignById(@PathVariable Long id){
        return service.getCampaignById(id);
    }
    @PostMapping
    public Campaign addCampaign(@Valid @RequestBody Campaign campaign){
        return service.addCampaign(campaign);
    }
    @PutMapping("/{id}")
    public Campaign updateCampaign(@PathVariable Long id , @RequestBody Campaign campaign){
        return service.updateCampaign(id,campaign);
    }
    @DeleteMapping("/{id}")
    public String deleteCampaign(@PathVariable Long id){
        service.deleteCampaign(id);
        return "Campaign deleted successfully";
    }

}
