package com.beanscope;

import com.eagertolazy.Manager;
import com.eagertolazy.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {

    static void main() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Employee emp1 = (Employee) context.getBean("emp");
        emp1.setTest(1000);
        emp1.test();

        Employee emp2 = (Employee) context.getBean("emp");
        emp2.test();

        context.close();
    }
}
