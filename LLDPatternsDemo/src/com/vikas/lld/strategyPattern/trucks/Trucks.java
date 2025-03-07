package com.vikas.lld.strategyPattern.trucks;

import com.vikas.lld.strategyPattern.Vehicle;
import com.vikas.lld.strategyPattern.strategy.DriveStrategy;

public abstract class Trucks extends Vehicle {
    public Trucks(DriveStrategy strategy) {
        super(strategy);
    }

    @Override
    public void drive() {
        this.strategy.drive();
    }
}
