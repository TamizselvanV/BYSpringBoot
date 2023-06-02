package com.example.BYSpringBoot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.BYSpringBoot.model.InventoryDemand;
import com.example.BYSpringBoot.model.InventorySupply;
import com.example.BYSpringBoot.service.InventoryService;

@RestController
public class InventoryController {
	
	Logger logger = LoggerFactory.getLogger(InventoryController.class);
	
	private InventoryService inventoryService;

	public InventoryController(InventoryService inventoryService) {
		super();
		this.inventoryService = inventoryService;
	}

	@RequestMapping("inventorySupplyList")
	public List<InventorySupply> listInvSupply(){
		logger.trace("Trace Level Logging");
		logger.debug("Debug Level Logging");
		logger.info("Info Level Logging");
		logger.warn("Warn Level Logging");
		logger.error("Error Level Logging");
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
