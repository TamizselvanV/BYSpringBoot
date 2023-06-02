package com.example.BYSpringBoot.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class InventoryDemand {

	private String ItemID;
	private int Demand;
	private LocalDateTime LastUpdatedDate;

}
