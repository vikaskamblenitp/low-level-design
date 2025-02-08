package com.vikas.lld.strategypattern.car;

import com.vikas.lld.strategypattern.strategy.OffRoadDriveStrategy;

public class OffRoadCar extends Car {
    public OffRoadCar() {
        super(new OffRoadDriveStrategy());
    }
}
