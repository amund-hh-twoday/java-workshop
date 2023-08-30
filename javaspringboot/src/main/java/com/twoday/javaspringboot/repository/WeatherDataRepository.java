package com.twoday.javaspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twoday.javaspringboot.domain.Day;

@Repository
public interface WeatherDataRepository extends JpaRepository<Day, Long> { }
