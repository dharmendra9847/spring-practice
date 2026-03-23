package com.mainapp;

public class Employee {

    private String id;
    private Account account;

    public Employee(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Employee() {
        IO.println("Employee constructor called");
    }

    public Employee(String id) {
        this.id = id;
        IO.println("Employee parameterized constructor called");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void test(){
        IO.println("Employee test called");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", account=" + account +
                '}';
    }
}
