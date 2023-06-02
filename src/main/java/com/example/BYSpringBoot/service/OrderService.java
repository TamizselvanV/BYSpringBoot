package com.example.BYSpringBoot.service;

import java.util.List;
import java.util.function.Predicate;
import org.springframework.stereotype.Service;
import com.example.BYSpringBoot.data.OrderData;
import com.example.BYSpringBoot.model.Order;

@Service
public class OrderService {

	private static List<Order> lsOrder = OrderData.orderList();

	public List<Order> listOrders() {
		return lsOrder;
	}

	public Order fetchByOrderNo(String OrderNo) {
		Predicate<? super Order> predicate = Order -> Order.getOrderNo().equalsIgnoreCase(OrderNo);
		Order other = new Order("OrderNotFound", null, null);
		return lsOrder.stream().filter(predicate).findFirst().orElse(other);
	}
}
