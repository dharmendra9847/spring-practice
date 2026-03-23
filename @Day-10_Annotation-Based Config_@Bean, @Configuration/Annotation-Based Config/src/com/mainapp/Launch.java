package com.mainapp;

import com.mainapp.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launch {

    static void main(String[] args) {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
        Employee employee1 = ac.getBean(Employee.class);
        System.out.println(employee1);
        employee1.test();

        Employee employee2 = ac.getBean(Employee.class);
        System.out.println(employee2);
        employee2.test();


//        Employee emp1 = (Employee) ac.getBean("emp");
//        System.out.println(emp1);
//        emp1.test();

//        Employee emp2 = (Employee) ac.getBean("emp");
//        System.out.println(emp2);
//        emp2.test();


        ac.close();
    }
}
