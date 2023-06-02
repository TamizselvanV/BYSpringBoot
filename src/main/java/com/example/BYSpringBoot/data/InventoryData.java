package com.example.BYSpringBoot.data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.example.BYSpringBoot.model.InventoryDemand;
import com.example.BYSpringBoot.model.InventorySupply;

public class InventoryData {

	public static List<InventorySupply> listInventorySupply() {

		List<InventorySupply> listInvSuppply = new ArrayList<>();
		
		listInvSuppply.add(new InventorySupply("I001", 10, LocalDateTime.of(2023, 4, 19, 8, 30)));
		listInvSuppply.add(new InventorySupply("I002", 25, LocalDateTime.of(2023, 4, 18, 10, 10)));
		listInvSuppply.add(new InventorySupply("I003", 5, LocalDateTime.of(2023, 4, 17, 22, 50)));
		return listInvSuppply;
	}

	public static List<InventoryDemand> listInventoryDemand() {

		List<InventoryDemand> listInvDemand = new ArrayList<>();

		listInvDemand.add(new InventoryDemand("I001", 8, LocalDateTime.of(2023, 4, 19, 8, 30)));
		listInvDemand.add(new InventoryDemand("I002", 20, LocalDateTime.of(2023, 4, 19, 8, 30)));
		listInvDemand.add(new InventoryDemand("I003", 5, LocalDateTime.of(2023, 4, 19, 8, 30)));
		return listInvDemand;
	}
}
