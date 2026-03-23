package com.mainapp;

import com.mainapp.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launch {

    static void main(String[] args) {

        AnnotationConfigApplicationContext ca = new AnnotationConfigApplicationContext(MyConfig.class);
//        Employee bean = (Employee) ca.getBean("emp");
//        bean.test();

        Employee employee1 = ca.getBean(Employee.class);
        employee1.test();

        Employee employee2 = ca.getBean(Employee.class);
        employee2.test();

        ca.close();
    }
}
