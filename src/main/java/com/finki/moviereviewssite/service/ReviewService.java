package com.finki.moviereviewssite.service;

import com.finki.moviereviewssite.model.Review;
import com.finki.moviereviewssite.model.User;
import com.finki.moviereviewssite.model.dto.ReviewDto;

import java.util.List;
import java.util.Optional;

public interface ReviewService {

    List<Review> findAll();

    Optional<Review> findById(Long id);

    List<Review> findAllByUser(User user);

    Optional<Review> save(User user, String description, Integer rating);

    Optional<Review> save(ReviewDto reviewDto);

    Optional<Review> edit(Long id, User user, String description, Integer rating);

    Optional<Review> edit(Long id, ReviewDto reviewDto);

    void deleteById(Long id);

}
