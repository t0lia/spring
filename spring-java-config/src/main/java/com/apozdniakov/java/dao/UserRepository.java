package com.apozdniakov.java.dao;

import com.apozdniakov.java.domain.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> get(int id);
}
