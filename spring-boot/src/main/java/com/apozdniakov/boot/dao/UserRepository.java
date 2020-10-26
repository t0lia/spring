package com.apozdniakov.boot.dao;

import com.apozdniakov.boot.domain.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> get(int id);
}
