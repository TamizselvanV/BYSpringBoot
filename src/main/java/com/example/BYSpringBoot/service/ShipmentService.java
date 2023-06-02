package com.example.BYSpringBoot.service;

import java.util.List;
import java.util.function.Predicate;
import org.springframework.stereotype.Service;
import com.example.BYSpringBoot.data.ShipmentData;
import com.example.BYSpringBoot.model.Shipment;

@Service
public class ShipmentService {

	private static List<Shipment> lsShipment = ShipmentData.shipmentDatat();

	public List<Shipment> shipmentList() {
		return lsShipment;
	}

	public Shipment fetchByOrderNo(String OrderNo) {

		Predicate<? super Shipment> predicate = Shipment -> Shipment.getOrderNo().equalsIgnoreCase(OrderNo);
		Shipment other = new Shipment("ShipmentNotFound", null, null);
		return lsShipment.stream().filter(predicate).findFirst().orElse(other);
	}
}
