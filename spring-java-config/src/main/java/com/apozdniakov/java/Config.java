package com.apozdniakov.java;

import com.apozdniakov.java.dao.UserRepository;
import com.apozdniakov.java.dao.UserRepositoryImpl;
import com.apozdniakov.java.service.UserService;
import com.apozdniakov.java.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public UserRepository getUserRepository() {
        return new UserRepositoryImpl();
    }

    @Bean
    public UserService getUserService(UserRepository userRepository) {
        return new UserServiceImpl(userRepository);
    }

}
