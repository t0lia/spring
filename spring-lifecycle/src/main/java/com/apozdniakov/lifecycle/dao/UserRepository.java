package com.apozdniakov.lifecycle.dao;

import com.apozdniakov.lifecycle.domain.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> get(int id);
}
