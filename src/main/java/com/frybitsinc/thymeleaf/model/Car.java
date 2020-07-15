package com.frybitsinc.thymeleaf.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Car {

    private CarModel carModel;
    private int option;

}