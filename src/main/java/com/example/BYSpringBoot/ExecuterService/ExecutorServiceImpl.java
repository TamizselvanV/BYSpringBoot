package com.example.BYSpringBoot.ExecuterService;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

public class ExecutorServiceImpl {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(5);
		executorService.execute(newRunnable("Task 1"));
		executorService.execute(newRunnable("Task 2"));
		executorService.execute(newRunnable("Task 3"));
		executorService.shutdown();

		ExecutorService exSer = Executors.newFixedThreadPool(2);
		Future fuOrderDetails = exSer.submit(newCallableOrder("OrderDetails"));
		Future fuShipmentDetails = exSer.submit(newCallableShipment("ShipmentDetails"));
		System.out.println(fuOrderDetails.get());
		System.out.println(fuShipmentDetails.get());
		exSer.shutdown();

	}

	private static Callable newCallableShipment(String string) {
		// TODO Auto-generated method stub
		return new Callable() {

			@Override
			public Object call() throws Exception {
				String strShimentDetails = Thread.currentThread().getName()+ " : "+string;
				return strShimentDetails;
			}
		};
	}

	private static Callable newCallableOrder(String string) {
		// TODO Auto-generated method stub
		return new Callable() {

			@Override
			public Object call() throws Exception {
				String strOrderDetails = Thread.currentThread().getName()+ " : "+string;
				return strOrderDetails;
			}
		};
	}

	private static Runnable newRunnable(String string) {

		return new Runnable() {

			@Override
			public void run() {
				String returnMsg = Thread.currentThread().getName() + " : " + string;
				System.out.println(returnMsg);

			}
		};
	}

}
