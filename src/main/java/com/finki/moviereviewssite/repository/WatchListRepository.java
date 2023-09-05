package com.finki.moviereviewssite.repository;

import com.finki.moviereviewssite.model.User;
import com.finki.moviereviewssite.model.WatchList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WatchListRepository extends JpaRepository<WatchList, Long> {
    Optional<WatchList> findByUser(User user);
}
