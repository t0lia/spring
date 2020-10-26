package com.apozdniakov.boot.service;

import com.apozdniakov.boot.domain.User;

import java.util.Optional;

public interface UserService {
    Optional<User> get(int id);
}
