package com.eagertolazy;

public class Employee {

    static {
        IO.println("Hello Employee static!");
    }

    public Employee() {
        IO.println("Hello Employee constructor!");
    }

    public void test(){
        IO.println("Hello Employee test!");
    }
}
