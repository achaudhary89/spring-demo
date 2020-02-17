package com.demo.demo.controller;

import com.demo.demo.service.IndexService;
import org.h2.index.Index;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class IndexControllerUsingSetterInjection {

    IndexService indexService;

    public IndexService getIndexService() {
        return indexService;
    }

    @Autowired
    public void setIndexService(IndexService indexService) {
        this.indexService = indexService;
    }

    @RequestMapping("/setter/index")
    public String showIndex(){
        System.out.println("Count::"+indexService.getCount());
        return "Index";
    }
}
