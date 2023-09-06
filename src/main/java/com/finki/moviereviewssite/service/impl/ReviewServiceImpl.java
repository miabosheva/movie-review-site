package com.finki.moviereviewssite.service.impl;

import com.finki.moviereviewssite.model.Movie;
import com.finki.moviereviewssite.model.Review;
import com.finki.moviereviewssite.model.User;
import com.finki.moviereviewssite.model.dto.ReviewDto;
import com.finki.moviereviewssite.model.exceptions.MovieNotFoundException;
import com.finki.moviereviewssite.model.exceptions.ReviewNotFoundException;
import com.finki.moviereviewssite.repository.ReviewRepository;
import com.finki.moviereviewssite.service.ReviewService;

import java.util.List;
import java.util.Optional;

public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;
    private final MovieServiceImpl movieService;
    private final UserServiceImpl userService;

    public ReviewServiceImpl(ReviewRepository reviewRepository, MovieServiceImpl movieService, UserServiceImpl userService) {
        this.reviewRepository = reviewRepository;
        this.movieService = movieService;
        this.userService = userService;
    }

    @Override
    public Optional<Review> findById(Long id) {
        return reviewRepository.findById(id);
    }

    @Override
    public List<Review> findAllByMovie(Long id) {
        Movie movie = movieService.findById(id).orElseThrow(() -> new MovieNotFoundException(id));
        List<Review> reviews = movie.getReviews();
        return reviews;
    }

    @Override
    public List<Review> findAllByUser(User user) {
        return reviewRepository.findAllByUser(user);
    }

    @Override
    public Optional<Review> save(ReviewDto reviewDto) {
        Movie movie = movieService.findById(reviewDto.getMovie()).orElseThrow(() -> new MovieNotFoundException(reviewDto.getMovie()));
        User user = (User) userService.loadUserByUsername(reviewDto.getUsername());
        Review review = new Review(user, reviewDto.getDescription(), reviewDto.getRating(), movie);
        movie.getReviews().add(review);
        return Optional.of(reviewRepository.save(review));
    }

    @Override
    public Optional<Review> edit(Long id, ReviewDto reviewDto) {
        Review review = reviewRepository.findById(id).orElseThrow(() -> new ReviewNotFoundException(id));
        review.setDescription(reviewDto.getDescription());
        review.setRating(reviewDto.getRating());
        return Optional.of(review);
    }

    @Override
    public void deleteById(Long id) {
        reviewRepository.deleteById(id);
    }
}
