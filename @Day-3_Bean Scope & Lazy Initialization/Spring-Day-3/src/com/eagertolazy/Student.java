package com.eagertolazy;

public class Student {

    static {
        IO.println("Hello Student static!");
    }

    public Student() {
        IO.println("Hello Student constructor!");
    }

    public void test(){
        IO.println("Hello Student test!");
    }
}
