package com.example.BYSpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Order {
	private String orderNo;
	private String orderType;
	private String orderTotal;
}
