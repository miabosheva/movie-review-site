package com.finki.moviereviewssite.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class MovieDto {
    private String title;
    //private Double totalRating;
    private String description;

    public MovieDto() {
    }

    public MovieDto(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
