package com.mainapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Manager {

    public Manager() {
        IO.println("Manager bean Instantiation!");
    }

    // INITIALIZATION
    @PostConstruct
    public void init() {
        IO.println("Manager bean Initialization!");
    }

    public  void test() {
        System.out.println("Manager bean custom method!");
    }

    //DESTROY
    @PreDestroy
    public void destroy() {
        IO.println("Manager bean destroyed!");
    }
}
