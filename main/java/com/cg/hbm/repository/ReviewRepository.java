package com.cg.hbm.repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hbm.entity.Review;

@Repository

public interface ReviewRepository extends JpaRepository<Review,Integer>{

	

List<Review> getReviewByStarRating(int starRating);	
	
	List<Review> getReviewByHotelId(int hotelId) ;
	
	List<Review> getReviewByRoomId(int roomId) ;
	
	//public List<Review> getAllReviews();
	
   
}
