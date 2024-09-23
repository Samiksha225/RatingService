package com.rating.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "user_ratings")
public class Rating {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rating_id")
	private int ratingId;

	@Column(name = "user_id")
	private int userId;

	@Column(name = "hotel_id")
	private int hotelId;

	@Column(name = "rating")
	private int rating;

	@Column(name = "feedback")
	private String feedback;
}
