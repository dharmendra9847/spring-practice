package com.latestmainapp;

public class Employee {

    static {
        IO.println("EMP BEAN LOADING...");
    }

    public Employee() {
        IO.println("EMP BEAN INITIALIZING...");
    }

    public void test(){
        IO.println("EMP BEAN TESTING...");
    }
}
