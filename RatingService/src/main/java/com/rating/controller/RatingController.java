package com.rating.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.entities.Rating;
import com.rating.service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	private RatingService ratingService;
    private static final Logger logger = LoggerFactory.getLogger(RatingController.class);


	@PostMapping
	public ResponseEntity<Rating> saveRating(@RequestBody Rating rating) {
		Rating saveRating = ratingService.saveRating(rating);
		return ResponseEntity.status(HttpStatus.CREATED).body(saveRating);
	}

	@GetMapping("/rating")
	public ResponseEntity<List<Rating>> RatingList() {
		List<Rating> lists = ratingService.ratingList();
		return ResponseEntity.ok(lists);
	}

	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> RatingByUser(@PathVariable int userId) {
		List<Rating> ratingByUser = ratingService.getRatingByUserId(userId);
		return ResponseEntity.ok(ratingByUser);
	}

	@GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> ratingByHotel(@PathVariable int hotelId) {
        logger.debug("Received request for ratings of hotel with ID: " + hotelId);
        List<Rating> ratingByHotel = ratingService.getRatingByHotelId(hotelId);
        return ResponseEntity.ok(ratingByHotel);
    }
}
