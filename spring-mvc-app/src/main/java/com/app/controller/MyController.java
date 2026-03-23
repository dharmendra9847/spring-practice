package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admission")
public class MyController {

    @GetMapping("/registration.do")
//    @RequestMapping(value = "/registration.do", method = RequestMethod.GET)
    public String doRegistration(){
        System.out.println("doRegistration Testing...");
        return "registration";
    }
}
