package com.example.BYSpringBoot.data;

import java.util.ArrayList;
import java.util.List;

import com.example.BYSpringBoot.model.Shipment;

public class ShipmentData {

	public static List<Shipment> shipmentDatat() {

		List<Shipment> lsShipment = new ArrayList();

		lsShipment.add(new Shipment("5001", "SHIP001", "Delivered"));
		lsShipment.add(new Shipment("5002", "SHIP002", "Created"));
		lsShipment.add(new Shipment("5005", "SHIP005", "Ready For Customer Pickup"));
		lsShipment.add(new Shipment("5006", "SHIP006", "BackOrdered"));

		return lsShipment;
	}

}
