package com.vikas.lld.strategypattern.trucks;

import com.vikas.lld.strategypattern.Vehicle;
import com.vikas.lld.strategypattern.strategy.DriveStrategy;

public abstract class Trucks extends Vehicle {
    public Trucks(DriveStrategy strategy) {
        super(strategy);
    }

    @Override
    public void drive() {
        this.strategy.drive();
    }
}
