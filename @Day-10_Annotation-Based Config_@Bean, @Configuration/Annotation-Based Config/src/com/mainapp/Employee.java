package com.mainapp;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component  (without name)
//@Component  ("emp")
//@Lazy
//@Scope ("prototype")
public class Employee {

    public Employee() {
        System.out.println("BEAN INSTANTIATION");
    }

    //@PostConstruct
    public void init() {
        System.out.println("PostConstruct");
    }

    //@PreDestroy
    public void destroy() {
        System.out.println("PreDestroy");
    }

    public void test(){
        System.out.println("TESTED");
    }
}
