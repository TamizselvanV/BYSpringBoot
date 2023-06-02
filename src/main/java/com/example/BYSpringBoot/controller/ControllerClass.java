package com.example.BYSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerClass {

	@RequestMapping("orderDetails")
	public String orderDetailsPage(@RequestParam String orderNo) {
		//System.out.println("Inside OrderDetails Page "+strOrderNo);		
		return "orderDetails";
	}

}
