package com.example.BYSpringBoot.data;

import java.util.ArrayList;
import java.util.List;
import com.example.BYSpringBoot.model.Order;

public class OrderData {

	public static List<Order> orderList() {
		List<Order> lsOrder = new ArrayList<>();
		lsOrder.add(new Order("5001", "SHIP", "23.3"));
		lsOrder.add(new Order("5002", "PICK", "50.5"));
		lsOrder.add(new Order("5005", "DIGITAL", "10.5"));
		
		return lsOrder;
	}
}
