package com.example.BYSpringBoot;

public class Shipment {
	
	private String OrderNo;
	private String ShipmentNo;
	private String ShipmentStatus;
	
	
	
	public Shipment(String orderNo, String shipmentNo, String shipmentStatus) {
		super();
		OrderNo = orderNo;
		ShipmentNo = shipmentNo;
		ShipmentStatus = shipmentStatus;
	}



	public String getOrderNo() {
		return OrderNo;
	}



	public void setOrderNo(String orderNo) {
		OrderNo = orderNo;
	}



	public String getShipmentNo() {
		return ShipmentNo;
	}



	public void setShipmentNo(String shipmentNo) {
		ShipmentNo = shipmentNo;
	}



	public String getShipmentStatus() {
		return ShipmentStatus;
	}



	public void setShipmentStatus(String shipmentStatus) {
		ShipmentStatus = shipmentStatus;
	}



	@Override
	public String toString() {
		return "Shipment [OrderNo=" + OrderNo + ", ShipmentNo=" + ShipmentNo + ", ShipmentStatus=" + ShipmentStatus
				+ "]";
	}
	
	

}
