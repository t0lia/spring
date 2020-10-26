package com.apozdniakov.annotation.service;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Starter {

    private final Map<String, Handler> handlers;

    public Starter(Map<String, Handler> handlers) {
        this.handlers = handlers;
    }

    @EventListener
    public void start(ContextRefreshedEvent event) {
        List<String> current = List.of("1", "hello", "777");
        System.out.println("All handlers: " + handlers.keySet());

        for (Handler handler : handlers.values()) {
            current = handler.handle(current);
        }
        System.out.println(current);
    }
}
