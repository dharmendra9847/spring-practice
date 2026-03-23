package com.mypractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyPracticeLaunch {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        MyPracticeEmployee mpe = (MyPracticeEmployee) context.getBean("mpe");
        MyPracticeStore mps = (MyPracticeStore) context.getBean("mps");
        MyPracticeStudent mpstd = (MyPracticeStudent) context.getBean("mpstd");
        mpe.myEmpMethod();
        mps.myPsMethod();
        mpstd.myStdMethod();

    }
}
