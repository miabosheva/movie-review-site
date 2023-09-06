package com.finki.moviereviewssite.service;

import com.finki.moviereviewssite.model.Movie;
import com.finki.moviereviewssite.model.WatchList;

import java.util.List;

public interface WatchListService {
    List<Movie> listAllMoviesInWatchList(Long watchListId);

    WatchList getWatchList(String username);

    WatchList addMovieToWatchList(String username, Long movieId);
}
