package com.finki.moviereviewssite.repository;
import com.finki.moviereviewssite.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    Optional<Review> findByUser(User user);
    void deleteByUser(User user);
}

