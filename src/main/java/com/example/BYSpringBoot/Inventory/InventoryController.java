package com.example.BYSpringBoot.Inventory;

import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {
	
	private InventoryService inventoryService;

	public InventoryController(InventoryService inventoryService) {
		super();
		this.inventoryService = inventoryService;
	}

	@RequestMapping("inventorySupplyList")
	public List<InventorySupply> listInvSupply(){
		return InventoryService.listInvSuppply;
		
	}
	
	@RequestMapping("inventoryDemandList")
	public List<InventoryDemand> listInvDemand(){
		return InventoryService.listInvDemand;
		
	}
	
	@RequestMapping(value= "fetchItemATP", method=RequestMethod.POST)
	public Object fetchItemATP(@RequestBody InventorySupply invSupply) {
		return inventoryService.fetchATPOfItem(invSupply.getItemID());
	}
	
	@RequestMapping(value="updateInventory", method = RequestMethod.POST)
	public Object updateInventory(@RequestBody InventorySupply invUpdate) {		
		return inventoryService.updateSupply(invUpdate);		

	}
}
