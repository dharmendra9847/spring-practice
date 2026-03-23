package com.mainapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class EmployeeAnno {

    public EmployeeAnno() {
        IO.println("Emp bean Instantiation!");
    }

    // INITIALIZATION
    @PostConstruct
    public void annoInit() {
        IO.println("Emp Resource allocated Ready!");
    }

    public  void test() {
        System.out.println("Emp bean tested...");
    }

    // destroy
    @PreDestroy
    public void annoDestroy() {
        IO.println("Emp Resource de-allocated!");
    }

}
