package com.apozdniakov;

import com.apozdniakov.xmlscan.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;

public class App {
    public static void main(String[] args) {
        System.out.println("xml component scan");
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");

        UserService userService = context.getBean(UserService.class);
        userService.get(2).ifPresent(System.out::println);

        String beans = Arrays.stream(context.getBeanDefinitionNames())
                .collect(joining("\n\t", "beans:\n\t", ""));
        System.out.println(beans);

    }
}
