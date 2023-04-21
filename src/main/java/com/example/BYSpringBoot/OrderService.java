package com.example.BYSpringBoot;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	private static List<Order> lsOrder = new ArrayList<>();
	
	static {
		lsOrder.add(new Order("5001", "SHIP", "23.3"));		
		lsOrder.add(new Order("5002","PICK","50.5"));
		lsOrder.add(new Order("5005","DIGITAL","10.5"));
	}

	public List<Order> listOrders(){
		return lsOrder;
	}
	
	public Order fetchByOrderNo(String OrderNo){		
		Predicate<? super Order> predicate = Order -> Order.getOrderNo().equalsIgnoreCase(OrderNo);
		Order other = new Order("OrderNotFound", null, null);
		return lsOrder.stream().filter(predicate).findFirst().orElse(other);
	}
}
