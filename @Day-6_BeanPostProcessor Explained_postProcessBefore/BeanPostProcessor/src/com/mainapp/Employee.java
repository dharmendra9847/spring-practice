package com.mainapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {

    public Employee() {
        IO.println("Employee bean Instantiation!");
    }

    // INITIALIZATION
    @PostConstruct
    public void init() {
        IO.println("Employee bean Initialization!");
    }

    public  void test() {
        System.out.println("Employee bean custom method!");
    }

    //DESTROY
    @PreDestroy
    public void destroy() {
        IO.println("Employee bean destroyed");
    }

}
