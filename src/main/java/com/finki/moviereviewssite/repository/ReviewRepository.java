package com.finki.moviereviewssite.repository;
import com.finki.moviereviewssite.model.Movie;
import com.finki.moviereviewssite.model.Review;
import com.finki.moviereviewssite.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findAllByUser (User user);
    Optional<Review> findById (Long id);
    void deleteById (Long id);
}

