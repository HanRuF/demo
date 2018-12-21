package com.example.demo.contiller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/a")
public class TestContiller {


    @RequestMapping(value = "/view",method = RequestMethod.GET)
    public  String view(){

        return "hello word ";
    }
}
