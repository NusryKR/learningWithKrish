package com.nusry.Practical.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class MainController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String greeting(){
        return "Welcome Springboot";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String greeting2(){
        return "Welcome Springboot from post";
    }
}
