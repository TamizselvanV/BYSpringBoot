package com.example.BYSpringBoot.Inventory;

public class InventoryATP {
	
	String ItemID;
	int AvailableToPromise;
	public String getItemID() {
		return ItemID;
	}
	public void setItemID(String itemID) {
		ItemID = itemID;
	}
	public int getAvailableToPromise() {
		return AvailableToPromise;
	}
	public void setAvailableToPromise(int availableToPromise) {
		AvailableToPromise = availableToPromise;
	}
	public InventoryATP(String itemID, int availableToPromise) {
		super();
		ItemID = itemID;
		AvailableToPromise = availableToPromise;
	}
	@Override
	public String toString() {
		return "InventoryATP [ItemID=" + ItemID + ", AvailableToPromise=" + AvailableToPromise + "]";
	}
	
	
	

}
