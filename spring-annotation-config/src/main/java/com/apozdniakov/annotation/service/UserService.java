package com.apozdniakov.annotation.service;


import com.apozdniakov.annotation.domain.User;

import java.util.Optional;

public interface UserService {
    Optional<User> get(int id);
}
