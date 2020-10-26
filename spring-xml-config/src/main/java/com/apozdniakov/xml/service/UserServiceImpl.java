package com.apozdniakov.xml.service;

import com.apozdniakov.xml.dao.UserRepository;
import com.apozdniakov.xml.domain.User;

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
