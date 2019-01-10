package com.example.demo.contiller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestContiller {


    @RequestMapping(value = "/view")
    public  String view(){
        return "helloword";
    }

    @RequestMapping(value = "/index")
    public ModelAndView index (){
        //分支删除代码
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index.html");
        mv.addObject("name", "主分支");
        System.out.println("分支打印合并ss");

        return mv;
    }
}
