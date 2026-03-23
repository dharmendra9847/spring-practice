package com.mainapp;

public class EmployeeXml {

    public EmployeeXml() {
        IO.println("Emp bean Instantiation!");
    }

    // INITIALIZATION
    public void xmlInit() {
        IO.println("Emp Resource allocated Ready!");
    }

    public  void test() {
        System.out.println("Emp bean tested...");
    }

    // destroy
    public void xmlDestroy() {
        IO.println("Emp Resource de-allocated!");
    }

}
