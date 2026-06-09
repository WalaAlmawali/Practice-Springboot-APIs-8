package com.example.Practice.Springboot.APIs8;

import java.util.ArrayList;
import java.util.List;

public class CampaignManager {

    private List<Campaign> campaigns = new ArrayList<>();

    public CampaignManager() {

        // Sample Campaigns
        campaigns.add(new Campaign("C101",
                "Summer Sale", "Instagram", 500));

        campaigns.add(new Campaign("C102",
                "Black Friday", "Google Ads", 1000));

        campaigns.add(new Campaign("C103",
                "Email Promo", "Email", 300));
    }

    // POST Operation
    public String addCampaign(Campaign campaign) {

        for (Campaign c : campaigns) {
            if (c.getCampaignId().equals(campaign.getCampaignId())) {
                return "Campaign ID already exists\n"
                        + "No campaign was created";
            }
        }

        campaigns.add(campaign);

        return "Campaign Created Successfully\n"
                + "Campaign ID: " + campaign.getCampaignId() + "\n"
                + "Campaign Name: " + campaign.getCampaignName() + "\n"
                + "Platform: " + campaign.getPlatform() + "\n"
                + "Budget: " + campaign.getBudget() + "\n"
                + "Status: Active";
    }

    // Display Campaigns
    public void displayCampaigns() {
        for (Campaign campaign : campaigns) {
            System.out.println(
                    campaign.getCampaignId()
                            + " -> "
                            + campaign.getCampaignName()
                            + " -> "
                            + campaign.getPlatform()
                            + " -> "
                            + campaign.getBudget()
            );
        }
    }
}
