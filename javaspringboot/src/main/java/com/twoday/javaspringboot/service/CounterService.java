package com.twoday.javaspringboot.service;

import org.springframework.stereotype.Service;

import com.twoday.javaspringboot.config.ApplicationConfig;

@Service
public class CounterService {
    private int counter = 0;
    public int increment(){
        return ++counter;
    }

    public CounterService(ApplicationConfig.Blah blah){
        System.out.println(blah.blah());
    }
}
