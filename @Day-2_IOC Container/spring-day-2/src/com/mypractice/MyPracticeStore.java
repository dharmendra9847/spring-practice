package com.mypractice;

public class MyPracticeStore {

    static {
        IO.println("Hello PS Static!");
    }

    public MyPracticeStore() {
        IO.println("Hello PS Constructor!");
    }

    public void myPsMethod(){
        IO.println("Hello PS Method!");
    }
}
