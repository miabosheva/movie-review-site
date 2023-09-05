package com.finki.moviereviewssite.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MovieListNotFoundException extends RuntimeException{

    public MovieListNotFoundException(Long id) {
        super(String.format("Movie list with id: %d was not found", id));
    }
}
