package com.apozdniakov.jsr330.dao;

import com.apozdniakov.jsr330.domain.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> get(int id);
}
