package com.finki.moviereviewssite.model.dto;

import lombok.Data;

@Data
public class ReviewDto {
    private String username;
    private String description;
    private Integer rating;
    private Long movie;

    public ReviewDto() {
    }

    public ReviewDto(String username, String description, Integer rating, Long movie) {
        this.username = username;
        this.description = description;
        this.rating = rating;
        this.movie = movie;
    }
}
