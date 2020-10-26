package com.apozdniakov.xmlscan.service;

import com.apozdniakov.xmlscan.domain.User;

import java.util.Optional;

public interface UserService {
    Optional<User> get(int id);
}
