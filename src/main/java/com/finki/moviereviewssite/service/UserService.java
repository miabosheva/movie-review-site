package com.finki.moviereviewssite.service;

import com.finki.moviereviewssite.model.Review;
import com.finki.moviereviewssite.model.User;
import com.finki.moviereviewssite.model.enumerations.Role;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    User register(String username, String password, String repeatPassword, String name, String surname, Role role);
}
