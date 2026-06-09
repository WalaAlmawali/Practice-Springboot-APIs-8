package com.example.Practice.Springboot.APIs8.Controller;

import com.example.Practice.Springboot.APIs8.Entity.Campaign;
import com.example.Practice.Springboot.APIs8.Service.CampaignManager;

public class CampaignDemo {

    public static void main(String[] args) {

        CampaignManager manager = new CampaignManager();

        System.out.println("=== Existing Campaigns ===");
        manager.displayCampaigns();

       // New Campaign (POST Request Simulation)
        Campaign newCampaign = new Campaign("C104", "Ramadan Offer", "Facebook Ads", 700);

        System.out.println("\n=== Processing POST Operation ===");
        System.out.println(manager.addCampaign(newCampaign));

        System.out.println("\n=== Updated Campaign List ===");
        manager.displayCampaigns();
    }
}
