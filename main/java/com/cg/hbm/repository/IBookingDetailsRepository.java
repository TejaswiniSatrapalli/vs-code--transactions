package com.cg.hbm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hbm.entity.BookingDetails;
import com.cg.hbm.entity.Transactions;
@Repository
public interface IBookingDetailsRepository extends JpaRepository<BookingDetails, Integer> {

//	BookingDetails findByBookingId(Integer id);
	
//	List<BookingDetails> getBookingByName(String name);
//	
//	List<BookingDetails> getBookingById(int bookingId);

	BookingDetails findByBookingId(int bookingId);
	
	List<BookingDetails> getBookingsByBookedFrom(String bookedFrom);
	
	 List<BookingDetails> getBookingByBookingId(int bookingId);
	
	
}
