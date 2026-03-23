package com.mainapp.config;

import com.mainapp.Employee;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan (basePackages = {"com.mainapp"})
public class MyConfig {

    @Bean (initMethod = "init", destroyMethod = "destroy")
    @Lazy
    @Scope("prototype")
    public Employee getEmployee(){

        System.out.println("CUSTOM LOGIC");
        return new Employee();
    }
}
