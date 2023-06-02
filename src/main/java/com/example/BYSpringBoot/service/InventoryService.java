package com.example.BYSpringBoot.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.BYSpringBoot.data.InventoryData;
import com.example.BYSpringBoot.model.InventoryATP;
import com.example.BYSpringBoot.model.InventoryDemand;
import com.example.BYSpringBoot.model.InventorySupply;

@Service
public class InventoryService {

	public static List<InventorySupply> listInvSuppply = InventoryData.listInventorySupply();
	public static List<InventoryDemand> listInvDemand = InventoryData.listInventoryDemand();

	public InventoryATP fetchATPOfItem(String ItemID) {

		Predicate<? super InventorySupply> predicateSupply = InventorySupply -> InventorySupply.getItemID()
				.equalsIgnoreCase(ItemID);
		Predicate<? super InventoryDemand> predicateDemand = InventoryDemand -> InventoryDemand.getItemID()
				.equalsIgnoreCase(ItemID);

		InventorySupply itemSupply = listInvSuppply.stream().filter(predicateSupply).findFirst().orElseThrow(() -> {
			throw new ResponseStatusException(HttpStatusCode.valueOf(203), "Supply Not Found for the Item");
		});
		InventoryDemand itemDemand = listInvDemand.stream().filter(predicateDemand).findFirst().orElseThrow(() -> {
			throw new ResponseStatusException(HttpStatusCode.valueOf(203), "Demand Not Found for the Item");
		});

		int iATP = itemSupply.getSupply() - itemDemand.getDemand();
		InventoryATP atp = new InventoryATP(ItemID, iATP);

		return atp;

	}

	public InventorySupply updateSupply(InventorySupply updateInv) {

		Predicate<? super InventorySupply> predicateSupply = InventorySupply -> InventorySupply.getItemID()
				.equalsIgnoreCase(updateInv.getItemID());

		InventorySupply itemSupply = listInvSuppply.stream().filter(predicateSupply).map((CurrentSupply) -> {		

			int intCurrentQty = CurrentSupply.getSupply();
			int intUpdateQty = updateInv.getSupply();
			if (updateInv.getAvailableDate().isAfter(CurrentSupply.getAvailableDate())) {
				CurrentSupply.setSupply(intCurrentQty + intUpdateQty);
				CurrentSupply.setAvailableDate(updateInv.getAvailableDate());
			}
			return CurrentSupply;
		}).findFirst().orElseThrow(() -> {
			throw new ResponseStatusException(HttpStatusCode.valueOf(203), "**Inventory Update Failed**");
		});

		return itemSupply;
	}
}
