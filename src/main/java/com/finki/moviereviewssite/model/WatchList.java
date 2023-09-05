package com.finki.moviereviewssite.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class WatchList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "watchList", fetch = FetchType.LAZY)
    private User user;

    @ManyToMany
    private List<Movie> movies;

    public WatchList(User user) {
        this.user = user;
        this.movies = new ArrayList<>();
    }

    public WatchList() {
    }
}
