package Entities;

import Abstract.Entity;

public class Campaign implements Entity {
int id;
String campaignName;
double campaignDiscount;
double campaignRate;

public Campaign() {
	
}

public Campaign(int id, String campaignName, double campaignDiscount, double campaignRate) {
	super();
	this.id = id;
	this.campaignName = campaignName;
	this.campaignDiscount = campaignDiscount;
	this.campaignRate = campaignRate;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCampaignName() {
	return campaignName;
}
public void setCampaignName(String campaignName) {
	this.campaignName = campaignName;
}
public double getCampaignDiscount() {
	return campaignDiscount;
}
public void setCampaignDiscount(double campaignDiscount) {
	this.campaignDiscount = campaignDiscount;
}
public double getCampaignRate() {
	return campaignRate;
}
public void setCampaignRate(double campaignRate) {
	
	this.campaignRate = campaignRate;
}
}
