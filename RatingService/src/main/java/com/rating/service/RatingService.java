package com.rating.service;

import java.util.List;

import com.rating.entities.Rating;

public interface RatingService {

	Rating saveRating(Rating rating);
	
	List<Rating>ratingList();
	
	List<Rating>getRatingByUserId(int userId);
	
	List<Rating>getRatingByHotelId(int HotelId);
	
}
