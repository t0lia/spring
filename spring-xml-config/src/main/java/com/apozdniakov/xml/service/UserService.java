package com.apozdniakov.xml.service;

import com.apozdniakov.xml.domain.User;

import java.util.Optional;

public interface UserService {
    Optional<User> get(int id);
}
