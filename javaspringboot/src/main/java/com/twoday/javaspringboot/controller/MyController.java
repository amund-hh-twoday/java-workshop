package com.twoday.javaspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twoday.javaspringboot.service.CounterService;
import com.twoday.javaspringboot.service.WeatherDataService;

@RestController
public class MyController{
    private final WeatherDataService weatherDataService;
    private final CounterService counterService;


    public MyController(WeatherDataService myService, CounterService counterService){
        this.counterService = counterService;
        this.weatherDataService = myService;
    };

    @GetMapping("/api/getCounter")
    public int getCounter(){
        return counterService.increment();
    }

    @GetMapping("/api/getWeather")
    public String getWeather(){
        return weatherDataService.getWeather();
    }
}
