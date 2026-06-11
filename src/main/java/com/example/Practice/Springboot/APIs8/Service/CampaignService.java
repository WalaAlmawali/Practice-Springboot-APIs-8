package com.example.Practice.Springboot.APIs8.Service;

import com.example.Practice.Springboot.APIs8.Entity.Campaign;
import com.example.Practice.Springboot.APIs8.Entity.Employee;
import com.example.Practice.Springboot.APIs8.Repository.CampaignRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampaignService {
    private final CampaignRepository repository;

    public CampaignService(CampaignRepository repository) {
        this.repository = repository;
    }

    //Add Campaign
    public Campaign addCampaign(Campaign campaign) {
        return repository.save(campaign);
    }

    // Get all Campaign
    public List<Campaign> getAllCampaign() {
        return repository.findAll();

    }
    // Get Campaign by id
    public Campaign getCampaignById(Long id){
        return repository.findById(id)
                .orElseThrow(() ->
                new RuntimeException("Campaign Not Found"));
    }
    // Update Campaign
    public Campaign updateCampaign(Long id, Campaign campaign){
        Campaign existing = getCampaignById(id);
        existing.setBudget(campaign.getBudget());
        existing.setCampaignName(campaign.getCampaignName());
        existing.setPlatform(campaign.getPlatform());

        return repository.save(existing);
    }
    // Delete Campaign
    public void deleteCampaign(Long id){
        repository.deleteById(id);
    }
}
