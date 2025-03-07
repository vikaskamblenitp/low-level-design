package com.vikas.lld.strategyPattern.car;

import com.vikas.lld.strategyPattern.Vehicle;
import com.vikas.lld.strategyPattern.strategy.DriveStrategy;

public abstract class Car extends Vehicle {
    public Car(DriveStrategy strategy) {
        super(strategy);
    }

    @Override
    public void drive() {
        this.strategy.drive();
    }
}
