package com.example.Practice.Springboot.APIs8.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "campaign")
public class Campaign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long campaignId;
    @NotBlank
    private String campaignName;
    @NotBlank
    private String platform;
    private double budget;

    public Campaign( String campaignName,
                    String platform, double budget) {
        this.campaignName = campaignName;
        this.platform = platform;
        this.budget = budget;
    }

    public Long getCampaignId() {
        return campaignId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public String getPlatform() {
        return platform;
    }

    public double getBudget() {
        return budget;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
