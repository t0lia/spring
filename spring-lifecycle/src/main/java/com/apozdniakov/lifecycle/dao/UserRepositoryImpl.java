package com.apozdniakov.lifecycle.dao;

import com.apozdniakov.lifecycle.ConsolePrinter;
import com.apozdniakov.lifecycle.domain.User;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;

@Component
@ConsolePrinter
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