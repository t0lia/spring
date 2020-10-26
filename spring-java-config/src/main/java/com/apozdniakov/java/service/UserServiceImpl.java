package com.apozdniakov.java.service;

import com.apozdniakov.java.dao.UserRepository;
import com.apozdniakov.java.domain.User;

import java.util.Optional;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> get(int id) {
        return userRepository.get(id);
    }
}
