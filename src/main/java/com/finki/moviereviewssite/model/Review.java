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

    @ManyToOne
    private User user;

    private String description;

    private Integer rating;

    @ManyToOne
    private Movie movie;

    public Review(User user, String description, Integer rating){
        this.description = description;
        this.user = user;
        this.rating = rating;
    }

    public Review(){
    }
}
