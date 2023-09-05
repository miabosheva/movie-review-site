package com.finki.moviereviewssite.service;

import com.finki.moviereviewssite.model.Movie;
import com.finki.moviereviewssite.model.dto.MovieDto;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    List<Movie> findAll();

    Optional<Movie> findById(Long id);

    Optional<Movie> findByTitle(String title);

    Optional<Movie> save(String title, Double totalRating, String description);

    Optional<Movie> save(MovieDto movieDto);

    Optional<Movie> edit(Long id, String title, Double totalRating, String description);

    Optional<Movie> edit(Long id, MovieDto movieDto);

    void deleteById(Long id);

}
