package com.example.BYSpringBoot.Inventory;

import java.time.LocalDateTime;

public class InventorySupply {

	private String ItemID;
	private int Supply;
	private LocalDateTime AvailableDate;
	
	public String getItemID() {
		return ItemID;
	}
	public void setItemID(String itemID) {
		ItemID = itemID;
	}
	public int getSupply() {
		return Supply;
	}
	public void setSupply(int supply) {
		Supply = supply;
	}
	public LocalDateTime getAvailableDate() {
		return AvailableDate;
	}
	public void setAvailableDate(LocalDateTime availableDate) {
		AvailableDate = availableDate;
	}
	
	@Override
	public String toString() {
		return "InventorySupply [ItemID=" + ItemID + ", Supply=" + Supply + ", AvailableDate=" + AvailableDate + "]";
	}
	
	public InventorySupply(String itemID, int supply, LocalDateTime availableDate) {
		super();
		ItemID = itemID;
		Supply = supply;
		AvailableDate = availableDate;
	}
	
}
