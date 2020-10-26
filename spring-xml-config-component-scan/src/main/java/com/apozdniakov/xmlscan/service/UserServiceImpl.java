package com.apozdniakov.xmlscan.service;

import com.apozdniakov.xmlscan.dao.UserRepository;
import com.apozdniakov.xmlscan.domain.User;
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
