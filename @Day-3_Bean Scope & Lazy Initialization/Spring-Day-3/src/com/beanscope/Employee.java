package com.beanscope;

public class Employee {

    private int test;

    static {
        IO.println("Employee static Loading!");
    }

    public Employee() {
        IO.println("Employee constructor Instantiated!");
    }

    public void test(){
        IO.println("Employee tested!--> "+test);
    }

    public Employee(int test) {
        this.test = test;
    }

    public int getTest(){
        return test;
    }
    public void setTest(int test){
        this.test = test;
    }
}
