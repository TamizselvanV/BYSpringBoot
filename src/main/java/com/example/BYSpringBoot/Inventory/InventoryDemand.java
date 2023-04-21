package com.example.BYSpringBoot.Inventory;

import java.time.LocalDateTime;

public class InventoryDemand {
	
	private String ItemID;
	private int Demand;
	private LocalDateTime LastUpdatedDate;
	
	public String getItemID() {
		return ItemID;
	}
	public void setItemID(String itemID) {
		ItemID = itemID;
	}
	public int getDemand() {
		return Demand;
	}
	public void setDemand(int demand) {
		Demand = demand;
	}
	public LocalDateTime getLastUpdatedDate() {
		return LastUpdatedDate;
	}
	public void setLastUpdatedDate(LocalDateTime lastUpdatedDate) {
		LastUpdatedDate = lastUpdatedDate;
	}
	
	public InventoryDemand(String itemID, int demand, LocalDateTime lastUpdatedDate) {
		super();
		ItemID = itemID;
		Demand = demand;
		LastUpdatedDate = lastUpdatedDate;
	}
	
	@Override
	public String toString() {
		return "InventoryDemad [ItemID=" + ItemID + ", Demand=" + Demand + ", LastUpdatedDate=" + LastUpdatedDate + "]";
	}
	
	

}
