package com.apozdniakov.java.service;

import com.apozdniakov.java.domain.User;

import java.util.Optional;

public interface UserService {
    Optional<User> get(int id);
}
