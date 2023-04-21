package com.example.BYSpringBoot;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class ShipmentService {
	
	private static List<Shipment> lsShipment = new ArrayList();

	static {
		
		lsShipment.add(new Shipment("5001", "SHIP001", "Delivered"));
		lsShipment.add(new Shipment("5002", "SHIP002", "Created"));
		lsShipment.add(new Shipment("5005", "SHIP005", "Ready For Customer Pickup"));
	}
	
	public List<Shipment> shipmentList(){
		return lsShipment;
	}
	
	public Shipment fetchByOrderNo(String OrderNo){
		
		Predicate<? super Shipment> predicate = Shipment -> Shipment.getOrderNo().equalsIgnoreCase(OrderNo);
		Shipment other = new Shipment("ShipmentNotFound", null, null);		
		return lsShipment.stream().filter(predicate ).findFirst().orElse(other);
	}
}
