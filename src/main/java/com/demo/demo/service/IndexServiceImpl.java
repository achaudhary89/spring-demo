package com.demo.demo.service;

import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements  IndexService {

    @Override
    public Double  getCount() {
        return Math.random();
    }
}
