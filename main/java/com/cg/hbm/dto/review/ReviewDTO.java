package com.cg.hbm.dto.review;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ReviewDTO {
	
	private int id;
	private String userName;
	
	private int starRating;
	private String userReviewMsge;
	private int hotelId;
	private int roomId;


}
