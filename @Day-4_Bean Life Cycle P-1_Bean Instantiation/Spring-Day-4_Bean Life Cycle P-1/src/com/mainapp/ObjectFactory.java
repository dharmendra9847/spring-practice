package com.mainapp;

import java.util.UUID;

public class ObjectFactory {

    public static Employee getObject(){

        Employee employee = new Employee();
        employee.setId(UUID.randomUUID().toString());

        employee.setAccount(new Account(1001, "Punjab National Bank"));

        return employee;
    }
}
