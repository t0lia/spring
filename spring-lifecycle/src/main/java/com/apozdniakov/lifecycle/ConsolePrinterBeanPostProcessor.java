package com.apozdniakov.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;

@Component
public class ConsolePrinterBeanPostProcessor implements BeanPostProcessor {

    private Set<String> annotatedBeans = new HashSet<>();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass().isAnnotationPresent(ConsolePrinter.class)) {
            annotatedBeans.add(beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (annotatedBeans.contains(beanName))
            return Proxy.newProxyInstance(ConsolePrinterBeanPostProcessor.class.getClassLoader(),
                    bean.getClass().getInterfaces(),
                    (proxy, method, args) -> {
                        System.out.println("before method " + method.getName() + "bean " + beanName);
                        Object invoke = method.invoke(bean, args);
                        System.out.println("after method " + method.getName() + "bean " + beanName);
                        return invoke;
                    }
            );
        return bean;
    }
}
