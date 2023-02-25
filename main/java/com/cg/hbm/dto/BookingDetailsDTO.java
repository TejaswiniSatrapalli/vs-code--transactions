package com.cg.hbm.dto;

import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDetailsDTO {

	private int bookingId;
	
	//private String name;
	private String bookedFrom;
	private String bookedTo;
	
	private int noOfAdults;
	private int noOfChildren;
	private double amount;
}