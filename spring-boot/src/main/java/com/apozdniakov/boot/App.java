package com.apozdniakov.boot;

import com.apozdniakov.boot.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(App.class, args);
        UserService userService = ctx.getBean(UserService.class);
        userService.get(2).ifPresent(System.out::println);

        String beans = Arrays.stream(ctx.getBeanDefinitionNames())
                .collect(joining("\n\t", "beans:\n\t", ""));
        System.out.println(beans);
        System.out.println(ctx.getBeanDefinitionCount());
    }
}
