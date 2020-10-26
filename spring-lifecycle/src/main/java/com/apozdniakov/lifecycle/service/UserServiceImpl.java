package com.apozdniakov.lifecycle.service;

import com.apozdniakov.lifecycle.ConsolePrinter;
import com.apozdniakov.lifecycle.dao.UserRepository;
import com.apozdniakov.lifecycle.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Optional;

@Component
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        System.out.println("--- constructor");
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void init() {
        System.out.println("--- init");
    }

    @EventListener
    public void start(ContextRefreshedEvent event) {
        System.out.println("--- refreshed");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("--- destroy");
    }

    @Override
    public Optional<User> get(int id) {
        return userRepository.get(id);
    }
}
