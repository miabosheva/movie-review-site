package com.finki.moviereviewssite.service.impl;

import com.finki.moviereviewssite.model.Movie;
import com.finki.moviereviewssite.model.User;
import com.finki.moviereviewssite.model.WatchList;
import com.finki.moviereviewssite.model.exceptions.MovieAlreadyInWatchListException;
import com.finki.moviereviewssite.model.exceptions.MovieNotFoundException;
import com.finki.moviereviewssite.model.exceptions.WatchListNotFoundException;
import com.finki.moviereviewssite.repository.WatchListRepository;
import com.finki.moviereviewssite.service.WatchListService;

import java.util.List;
import java.util.stream.Collectors;

public class WatchListServiceImpl implements WatchListService {

    private final WatchListRepository watchListRepository;
    private final UserServiceImpl userService;
    private final MovieServiceImpl movieService;

    public WatchListServiceImpl(WatchListRepository watchListRepository, UserServiceImpl userService, MovieServiceImpl movieService) {
        this.watchListRepository = watchListRepository;
        this.userService = userService;
        this.movieService = movieService;
    }

    @Override
    public List<Movie> listAllMoviesInWatchList(Long id) {
        WatchList watchList = watchListRepository.findById(id).orElseThrow(() -> new WatchListNotFoundException(id));
        return watchList.getMovies();
    }

    @Override
    public WatchList getWatchList(String username) {
        User user = (User) userService.loadUserByUsername(username);
        return watchListRepository.findByUser(user);
    }

    @Override
    public WatchList addMovieToWatchList(String username, Long movieId) {
        Movie movie = movieService.findById(movieId).orElseThrow(() -> new MovieNotFoundException(movieId));
        WatchList watchList = getWatchList(username);
        if (watchList.getMovies().stream().filter(i -> i.getMovieId() == movieId).collect(Collectors.toList()).size() > 0){
            throw new MovieAlreadyInWatchListException(movieId, username);
        }
        else{
            watchList.getMovies().add(movie);
        }
        return this.watchListRepository.save(watchList);
    }
}
