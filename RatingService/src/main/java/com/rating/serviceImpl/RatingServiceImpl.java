package com.rating.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.entities.Rating;
import com.rating.repository.RatingRepository;
import com.rating.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository ratingRepo;

	@Override
	public Rating saveRating(Rating rating) {
		return ratingRepo.save(rating);
	}

	@Override
	public List<Rating> ratingList() {
		return ratingRepo.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(int userId) {
		return ratingRepo.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(int HotelId) {
		return ratingRepo.findByHotelId(HotelId);
	}

	

}
