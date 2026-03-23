package com.mainapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {

    public Student() {
        IO.println("Student bean Instantiation!");
    }

    // INITIALIZATION
    @PostConstruct
    public void init() {
        IO.println("Student bean Initialization!");
    }

    public  void test() {
        System.out.println("Student bean custom method!");
    }

    //DESTROY
    @PreDestroy
    public void destroy(){
        IO.println("Student bean destroyed!");
    }
}
