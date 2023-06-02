package com.example.BYSpringBoot.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class InventorySupply {

	private String ItemID;
	private int Supply;
	private LocalDateTime AvailableDate;	
	
	
}
