package com.apozdniakov.lifecycle.service;

import com.apozdniakov.lifecycle.domain.User;

import java.util.Optional;

public interface UserService {
    Optional<User> get(int id);

}
