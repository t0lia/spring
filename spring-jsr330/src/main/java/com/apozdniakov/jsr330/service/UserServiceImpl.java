package com.apozdniakov.jsr330.service;

import com.apozdniakov.jsr330.dao.UserRepository;
import com.apozdniakov.jsr330.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Optional;

@Named
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Inject
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> get(int id) {
        return userRepository.get(id);
    }
}
