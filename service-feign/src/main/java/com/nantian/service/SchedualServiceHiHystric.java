package com.nantian.service;

import org.springframework.stereotype.Component;

/**
 * Created by nantian on 2018/10/11.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
