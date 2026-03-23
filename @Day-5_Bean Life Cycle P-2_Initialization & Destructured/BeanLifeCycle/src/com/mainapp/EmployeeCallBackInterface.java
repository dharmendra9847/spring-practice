package com.mainapp;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class EmployeeCallBackInterface implements InitializingBean, DisposableBean {

    public EmployeeCallBackInterface() {
        IO.println("Emp bean Instantiation!");
    }

    public  void test() {
        System.out.println("Emp bean tested...");
    }

    //DESTROY
    @Override
    public void destroy() throws Exception {
        IO.println("Emp Resource de-allocated!");
    }

    // INIT
    @Override
    public void afterPropertiesSet() throws Exception {
        IO.println("Emp Resource allocated Ready!");
    }
}
