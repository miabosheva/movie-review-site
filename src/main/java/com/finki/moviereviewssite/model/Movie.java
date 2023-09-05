package com.finki.moviereviewssite.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;

    private String title;

    private Double totalRating;

    private String description;

    @OneToMany(mappedBy = "movie", fetch = FetchType.EAGER)
    private List<Review> reviews = new ArrayList<>();

    public Movie() {
    }

    public Movie(String title, String description){
        this.title = title;
        this.totalRating = 0.0;
        this.description = description;
    }
}
