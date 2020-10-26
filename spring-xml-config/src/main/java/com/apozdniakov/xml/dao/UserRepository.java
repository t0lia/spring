package com.apozdniakov.xml.dao;

import com.apozdniakov.xml.domain.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> get(int id);
}
