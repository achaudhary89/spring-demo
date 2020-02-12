package com.demo.demo.controller;

import com.demo.demo.service.IndexService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControllerUsingConstructorInjection {

    IndexService indexService;

    public IndexControllerUsingConstructorInjection(IndexService indexService) {
        this.indexService = indexService;
    }

    @RequestMapping("/index")
    public String showIndex(){
        System.out.println("Count::"+indexService.getCount());
        return "Index";
    }

}
