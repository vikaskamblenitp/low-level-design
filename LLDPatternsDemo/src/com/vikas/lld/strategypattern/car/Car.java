package com.vikas.lld.strategypattern.car;

import com.vikas.lld.strategypattern.Vehicle;
import com.vikas.lld.strategypattern.strategy.DriveStrategy;

public abstract class Car extends Vehicle {
    public Car(DriveStrategy strategy) {
        super(strategy);
    }

    @Override
    public void drive() {
        this.strategy.drive();
    }
}
