package com.vikas.lld.strategyPattern.car;

import com.vikas.lld.strategyPattern.strategy.NormalDrivingStrategy;

public class NormalCar extends Car {

    public NormalCar() {
        super(new NormalDrivingStrategy());
    }
}
