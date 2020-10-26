package com.apozdniakov.xmlscan.dao;

import com.apozdniakov.xmlscan.domain.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> get(int id);
}
