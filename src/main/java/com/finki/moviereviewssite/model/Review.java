package com.finki.moviereviewssite.model;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private User user;

    private String description;

    private Integer rating;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    public Review(User user, String description, Integer rating){
        this.description = description;
        this.user = user;
        this.rating = rating;
    }
}
