package com.apozdniakov.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ServiceAImpl implements ServiceA {
    private ServiceB serviceB;

    public ServiceAImpl() {
    }

    public ServiceAImpl(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    @Autowired
    public void setServiceB(ServiceB serviceB) {
        this.serviceB = serviceB;
    }

    @Override
    public void callB() {
        serviceB.saySomething();
    }
}
