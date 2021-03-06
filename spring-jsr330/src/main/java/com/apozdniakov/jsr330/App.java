package com.apozdniakov.jsr330;

import com.apozdniakov.jsr330.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;

public class App {
    public static void main(String[] args) {

        System.out.println("Jsr-330");
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class.getPackageName());

        UserService userService = context.getBean(UserService.class);
        userService.get(2).ifPresent(System.out::println);

        String beans = Arrays.stream(context.getBeanDefinitionNames())
                .collect(joining("\n\t", "beans:\n\t", ""));
        System.out.println(beans);
        System.out.println(context.getBeanDefinitionCount());

    }
}
