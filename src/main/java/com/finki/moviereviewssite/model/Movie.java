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
    private Long id;

    private String title;

    private Double totalRating;

    private String description;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<Review> reviews = new ArrayList<>();

    public Movie() {
    }

    public Movie(String title, Double totalRating, String description){
        this.title = title;
        this.totalRating = totalRating;
        this.description = description;
    }
}
