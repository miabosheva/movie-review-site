package com.finki.moviereviewssite.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.PRECONDITION_FAILED)
public class MovieAlreadyInWatchListException extends RuntimeException{

    public MovieAlreadyInWatchListException(Long id, String username) {
        super(String.format("Movie with id: %d already exists in movie list for user with username %s", id, username));
    }
}
