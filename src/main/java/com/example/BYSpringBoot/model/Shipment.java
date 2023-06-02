package com.example.BYSpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Shipment {
	
	private String OrderNo;
	private String ShipmentNo;
	private String ShipmentStatus;	

}
