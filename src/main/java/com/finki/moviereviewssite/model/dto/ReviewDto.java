package com.finki.moviereviewssite.model.dto;

import com.finki.moviereviewssite.model.Movie;
import com.finki.moviereviewssite.model.User;
import lombok.Data;

@Data
public class ReviewDto {
    private Long user;
    private String description;
    private Integer rating;
    private Long movie;

    public ReviewDto(){
    }

    public ReviewDto(Long user, String description, Integer rating, Long movie) {
        this.user = user;
        this.description = description;
        this.rating = rating;
        this.movie = movie;
    }
}
