package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {

    static void main() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Employee emp = (Employee) context.getBean("emp");
        System.out.println(emp);
        emp.test();
    }
}
