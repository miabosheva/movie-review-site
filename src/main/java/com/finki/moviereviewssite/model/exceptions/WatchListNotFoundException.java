package com.finki.moviereviewssite.model.exceptions;

public class WatchListNotFoundException extends RuntimeException {

    public WatchListNotFoundException(Long id) {
        super(String.format("Watch list with id: %d was not found", id));
    }
}
