package com.apozdniakov.jsr330.service;


import com.apozdniakov.jsr330.domain.User;

import java.util.Optional;

public interface UserService {
    Optional<User> get(int id);
}
