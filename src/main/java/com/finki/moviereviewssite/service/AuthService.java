package com.finki.moviereviewssite.service;

import com.finki.moviereviewssite.model.User;

public interface AuthService {
    User login(String username, String password);
}
