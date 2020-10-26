package com.apozdniakov.circular;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("circular dependencies");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class.getPackageName());
        ctx.getBean(ServiceA.class).callB();
        ctx.registerShutdownHook();
    }
}
