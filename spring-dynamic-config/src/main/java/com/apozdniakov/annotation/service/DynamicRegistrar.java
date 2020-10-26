package com.apozdniakov.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Component
public class DynamicRegistrar {
    private ConfigurableBeanFactory beanFactory;
    private boolean invertor;
    private boolean deduplicator;
    private List<String> whiteList;
    private List<String> blackList;

    @Autowired
    public DynamicRegistrar(
            ConfigurableBeanFactory beanFactory,
            @Value("${dynamic.invertor:false}") boolean invertor,
            @Value("${dynamic.deduplicator:false}") boolean deduplicator,
            @Value("${dynamic.whiteList:}") List<String> whiteList,
            @Value("${dynamic.blackList:}") List<String> blackList
    ) {
        this.beanFactory = beanFactory;
        this.invertor = invertor;
        this.deduplicator = deduplicator;
        this.whiteList = whiteList;
        this.blackList = blackList;
    }

    @PostConstruct
    public void start() {
        System.out.println(invertor);
        System.out.println(deduplicator);
        System.out.println(whiteList);
        System.out.println(blackList);

        if (invertor) {
            beanFactory.registerSingleton("1_invertor-handler", (Handler) input -> {
                List<String> result = new ArrayList<>(input);
                Collections.reverse(result);
                return result;
            });
        }
        if (deduplicator) {
            beanFactory.registerSingleton("2_deduplicator-handler",
                    (Handler) input -> input.stream().distinct().collect(toList()));
        }
        if (!whiteList.isEmpty()) {
            beanFactory.registerSingleton("3_whitelist-handler",
                    (Handler) input -> input.stream().filter(whiteList::contains).collect(toList()));
        }
        if (!blackList.isEmpty()) {
            beanFactory.registerSingleton("4_blacklist-handler",
                    (Handler) input -> input.stream().filter(e -> !blackList.contains(e)).collect(toList()));
        }

    }

}
