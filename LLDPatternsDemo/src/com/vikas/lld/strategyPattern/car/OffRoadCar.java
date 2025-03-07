package com.vikas.lld.strategyPattern.car;

import com.vikas.lld.strategyPattern.strategy.OffRoadDriveStrategy;

public class OffRoadCar extends Car {
    public OffRoadCar() {
        super(new OffRoadDriveStrategy());
    }
}
