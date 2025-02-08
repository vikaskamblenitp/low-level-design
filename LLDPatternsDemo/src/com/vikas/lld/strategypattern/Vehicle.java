package com.vikas.lld.strategypattern;

import com.vikas.lld.strategypattern.strategy.DriveStrategy;

public abstract class Vehicle {
    public DriveStrategy strategy;
    public Vehicle(DriveStrategy strategy) {
        this.strategy = strategy;
    }
    public abstract void drive();
}
