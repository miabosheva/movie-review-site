package com.finki.moviereviewssite.model.dto;

import lombok.Data;

@Data
public class MovieDto {
    private String title;
    private Double totalRating;
    private String description;
    private Long review;

    public MovieDto() {
    }

    public MovieDto(String title, String description, Double totalRating, Long review) {
        this.title = title;
        this.totalRating = totalRating;
        this.description = description;
        this.review = review;
    }
}
