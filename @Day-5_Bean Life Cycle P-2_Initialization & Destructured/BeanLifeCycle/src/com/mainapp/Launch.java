package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {

    static void main() {

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        EmployeeXml emp = (EmployeeXml) context.getBean("emp");
//        emp.test();


//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        EmployeeAnno emp = (EmployeeAnno) context.getBean("emp");
//        emp.test();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        EmployeeCallBackInterface emp = (EmployeeCallBackInterface) context.getBean("emp");
        emp.test();

        //if bean scope is prototype than destroy not call automatically you call explicitly
        try {
            emp.destroy();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        context.close();
    }
}
