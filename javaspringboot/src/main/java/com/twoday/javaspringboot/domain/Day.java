package com.twoday.javaspringboot.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Day {
    @Id
    private int id;
    private String lowestTemp;
    private String highestTemp;
}
