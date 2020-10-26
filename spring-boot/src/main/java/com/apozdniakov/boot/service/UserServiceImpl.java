package com.apozdniakov.boot.service;

import com.apozdniakov.boot.dao.UserRepository;
import com.apozdniakov.boot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> get(int id) {
        return userRepository.get(id);
    }
}
