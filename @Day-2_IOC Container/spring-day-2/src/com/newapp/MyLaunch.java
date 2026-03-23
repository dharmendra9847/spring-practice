package com.newapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyLaunch {

    static void main() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        MyEmployee emp = (MyEmployee) context.getBean("emp");
        System.out.println(emp);
    }

}
