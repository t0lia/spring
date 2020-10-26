package com.apozdniakov.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class ServiceBImpl implements ServiceB {
    private ServiceA serviceA;

    public ServiceBImpl() {
    }

    public ServiceBImpl(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    @Autowired
    public void setServiceA(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    @Override
    public void saySomething() {
        System.out.println("it's ServiceBImpl");
    }
}
