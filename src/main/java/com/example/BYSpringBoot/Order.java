package com.example.BYSpringBoot;

public class Order {

	private String orderNo;
	private String orderType;
	private String orderTotal;

	public String getOrderNo() {
		return orderNo;
	}

	public String getOrderType() {
		return orderType;
	}

	public String getOrderTotal() {
		return orderTotal;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public void setOrderTotal(String orderTotal) {
		this.orderTotal = orderTotal;
	}
	
	
	public Order(String orderNo, String orderType, String orderTotal) {
		super();
		this.orderNo = orderNo;
		this.orderType = orderType;
		this.orderTotal = orderTotal;
	}

	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", orderType=" + orderType + ", orderTotal=" + orderTotal + "]";
	}
}
