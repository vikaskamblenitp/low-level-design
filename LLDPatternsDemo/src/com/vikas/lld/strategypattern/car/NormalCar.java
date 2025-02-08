package com.vikas.lld.strategypattern.car;

import com.vikas.lld.strategypattern.strategy.NormalDrivingStrategy;

public class NormalCar extends Car {

    public NormalCar() {
        super(new NormalDrivingStrategy());
    }
}
