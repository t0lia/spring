package com.apozdniakov.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service("second")
public class ServiceBImpl2 implements ServiceB {
    private ServiceAImpl serviceA;

    public ServiceBImpl2() {
    }

    public ServiceBImpl2(ServiceAImpl serviceA) {
        this.serviceA = serviceA;
    }

    @Autowired
    public void setServiceA(ServiceAImpl serviceA) {
        this.serviceA = serviceA;
    }

    @Override
    public void saySomething() {
        System.out.println("it's ServiceBImpl2");
    }
}
