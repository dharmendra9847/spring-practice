package com.mainapp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorImpl implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        IO.println("--> postProcessBeforeInitialization <--");

        if (bean instanceof Employee) {
            IO.println("Employee specific work...Ex. Password Decrypt");
        } else if (bean instanceof Manager) {
            Manager manager = (Manager) bean;
            IO.println("bean is property instantiated and dependency are injected for the bean:- " + beanName);
            IO.println(manager);
        }
        return  bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        IO.println("--> postProcessAfterInitialization <--\n");

        if (bean instanceof Employee) {
            IO.println("Employee Validated Successfully:- " + beanName);
        } else if (bean instanceof Manager) {
            IO.println("Manager Connection Pool Modified:- " + beanName);
        }
        return bean;
    }
}
