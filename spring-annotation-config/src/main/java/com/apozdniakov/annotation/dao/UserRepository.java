package com.apozdniakov.annotation.dao;

import com.apozdniakov.annotation.domain.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> get(int id);
}
