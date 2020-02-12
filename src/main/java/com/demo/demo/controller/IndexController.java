package com.demo.demo.controller;

import com.demo.demo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    IndexService indexService;

    @RequestMapping("/")
    public String showIndex(){
        System.out.println("Count::"+indexService.getCount());
        return "Index";
    }
}
