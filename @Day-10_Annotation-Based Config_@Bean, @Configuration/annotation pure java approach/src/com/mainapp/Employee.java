package com.mainapp;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Component ("emp")
//@Lazy
//@Scope("prototype")
public class Employee {

    public Employee() {
        System.out.println("Bean Instantiated");
    }

    //@PostConstruct
    public void init(){
        System.out.println("Init method called");
    }

    //@PreDestroy
    public void destroy(){
        System.out.println("BEAN DESTROY");
    }

    public void test(){
        System.out.println("BEAN TESTED");
    }
}
