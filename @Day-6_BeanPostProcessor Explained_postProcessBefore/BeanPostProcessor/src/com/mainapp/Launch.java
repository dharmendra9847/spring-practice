package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {

    static void main() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Employee employee = context.getBean(Employee.class);
//        System.out.println(employee);
//        employee.test();
//
//        Manager manager = context.getBean(Manager.class);
//        manager.test();
//
//        Student student = context.getBean(Student.class);
//        student.test();

        context.close();
    }
}
