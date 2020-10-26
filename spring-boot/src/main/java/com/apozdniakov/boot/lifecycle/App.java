package com.apozdniakov.boot.lifecycle;

import com.apozdniakov.boot.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;

public class App {
    public static void main(String[] args) {

        System.out.println("annotation config");
        ApplicationContext context = new AnnotationConfigApplicationContext("com.apozdniakov.spring.annotation");

        UserService userService = context.getBean(UserService.class);
        userService.get(2).ifPresent(System.out::println);

        String beans = Arrays.stream(context.getBeanDefinitionNames())
                .collect(joining("\n\t", "beans:\n\t", ""));
        System.out.println(beans);

    }
}
