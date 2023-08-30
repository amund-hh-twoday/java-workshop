package com.twoday.javaspringboot.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.twoday.javaspringboot.domain.Day;
import com.twoday.javaspringboot.repository.WeatherDataRepository;

import reactor.core.publisher.Mono;

@Service
public class WeatherDataService {
    private final WeatherDataRepository weatherDataRepository;
    private final WebClient client;

    public WeatherDataService(WeatherDataRepository weatherDataRepository, WebClient client){
        this.weatherDataRepository = weatherDataRepository;
        this.client = client;
    }

    public String getWeather(){
        return client
            .get()
            .uri("https://v2.jokeapi.dev/joke/Any")
            .retrieve()
            .bodyToMono(String.class)
            .block();
    }

    public void saveData(){
        Day day = new Day();
        day.setId(1);

        day.setLowestTemp("10");
        day.setHighestTemp("20");
        weatherDataRepository.save(day);
    }
}
