package com.apozdniakov.java.dao;

import com.apozdniakov.java.domain.User;

import java.util.Map;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {

    private Map<Integer, User> users = Map.of(
            1, new User(1, "John", 22),
            2, new User(2, "Mike", 27));

    @Override
    public Optional<User> get(int id) {
        if (users.containsKey(id)) {
            return Optional.of(users.get(id));
        }
        return Optional.empty();
    }
}
