package com.finki.moviereviewssite.service.impl;

import com.finki.moviereviewssite.model.Movie;
import com.finki.moviereviewssite.model.Review;
import com.finki.moviereviewssite.model.User;
import com.finki.moviereviewssite.model.dto.MovieDto;
import com.finki.moviereviewssite.model.dto.ReviewDto;
import com.finki.moviereviewssite.model.exceptions.MovieNotFoundException;
import com.finki.moviereviewssite.repository.MovieRepository;
import com.finki.moviereviewssite.repository.ReviewRepository;
import com.finki.moviereviewssite.repository.UserRepository;
import com.finki.moviereviewssite.service.MovieService;
import com.finki.moviereviewssite.service.ReviewService;

import java.util.List;
import java.util.Optional;

public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;
    private final ReviewServiceImpl reviewService;
    private final UserServiceImpl userService;

    public MovieServiceImpl(MovieRepository movieRepository, ReviewServiceImpl reviewService, UserServiceImpl userService) {
        this.movieRepository = movieRepository;
        this.reviewService = reviewService;
        this.userService = userService;
    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Optional<Movie> findById(Long id) {
        return movieRepository.findById(id);
    }

    @Override
    public Optional<Movie> findByTitle(String title) {
        return movieRepository.findByTitle(title);
    }

    @Override
    public Optional<Movie> save(MovieDto movieDto) {
        movieRepository.deleteByTitle(movieDto.getTitle());
        Movie movie = new Movie(movieDto.getTitle(), movieDto.getDescription());
        return Optional.of(movieRepository.save(movie));
    }

    @Override
    public Optional<Movie> edit(Long id, MovieDto movieDto) {
        if (movieRepository.findById(id).isPresent()) {
            Movie movie = movieRepository.findById(id).get();
            movie.setTitle(movieDto.getTitle());
            movie.setDescription(movieDto.getDescription());
            return Optional.of(movie);
        } else {
            throw new MovieNotFoundException(id);
        }
    }

    @Override
    public void deleteById(Long id) {
        movieRepository.deleteById(id);
    }
}
