package com.mainapp.config;

import com.mainapp.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = {"com.mainapp"})
public class MyConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Lazy
    public Employee getEmployee(){
        System.out.println("Custom method called");
        return new Employee();
    }
}
