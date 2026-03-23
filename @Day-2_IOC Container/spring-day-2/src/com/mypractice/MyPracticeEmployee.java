package com.mypractice;

public class MyPracticeEmployee {

    static {
        IO.println("Hello Emp Static!");
    }

    public MyPracticeEmployee() {
        IO.println("Hello Emp Constructor!");
    }

    public void myEmpMethod(){
        IO.println("Hello Emp Method!");
    }
}
