package com.mainapp;

import java.util.UUID;

public class Employee {

    private String id;
    private Account account;

    public Employee() {
    }

    public Employee(String id, Account account) {
        this.id = id;
        this.account = account;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public  void test() {
        System.out.println("test");
    }

//    public static Employee getObject() {
//
//        Employee employee = new Employee();
//        employee.setId(UUID.randomUUID().toString());
//
//        employee.setAccount(new Account());
//
//        return employee;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", account=" + account +
                '}';
    }
}
