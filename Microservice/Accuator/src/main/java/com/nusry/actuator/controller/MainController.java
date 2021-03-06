package com.nusry.actuator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController
{
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String greeting(){
        return "Welcome Springboot";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String greeting2(){
        return "Welcome Springboot from post";
    }
}
