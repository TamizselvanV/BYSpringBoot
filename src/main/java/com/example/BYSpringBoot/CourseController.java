package com.example.BYSpringBoot;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// to return a set of static values

@RestController
public class CourseController {
	
	OrderService orderService;
	ShipmentService shipmentService;

	public CourseController(OrderService orderService, ShipmentService shipmentService) {
		super();
		this.orderService = orderService;
		this.shipmentService = shipmentService;
	}

	@RequestMapping("orderDetailsPage")
	public String goToWelcomePage() {
		return "orderDetails";
	}

	@RequestMapping("/orders")
	public List<Order> fetchAllOrders() {
		return orderService.listOrders();

	}

	@RequestMapping("/shipments")
	public List<Shipment> fetchAllShipments() {
		return shipmentService.shipmentList();

	}

	@RequestMapping(value = "/fetchOrderAndShipment", method = RequestMethod.POST)
	public List<Object> fetchOrderAndShipment(@RequestBody Order Order)
			throws InterruptedException, ExecutionException {
		
		String strOrderNo = Order.getOrderNo();
		ExecutorService executService = Executors.newFixedThreadPool(2);
		Future<Order> order = executService.submit(callOrderService(strOrderNo));
		Future<Shipment> shipment = executService.submit(callShipmentService(strOrderNo));
		executService.shutdown();

		List<Object> listOrderShipment = new ArrayList<>();
		listOrderShipment.add(order.get());
		listOrderShipment.add(shipment.get());
		return listOrderShipment;
	}
	

	private Callable<Shipment> callShipmentService(String orderNo) {
		return new Callable<Shipment>() {
			public Shipment call() throws Exception {
				return shipmentService.fetchByOrderNo(orderNo);
			}
		};
	}

	private Callable<Order> callOrderService(String orderNo) {
		return new Callable<Order>() {
			public Order call() throws Exception {
				return orderService.fetchByOrderNo(orderNo);
			}
		};
	}

}
