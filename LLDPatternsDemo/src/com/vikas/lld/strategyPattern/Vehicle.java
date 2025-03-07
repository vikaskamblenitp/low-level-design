package com.vikas.lld.strategyPattern;

import com.vikas.lld.strategyPattern.strategy.DriveStrategy;

public abstract class Vehicle {
    public DriveStrategy strategy;
    public Vehicle(DriveStrategy strategy) {
        this.strategy = strategy;
    }
    public abstract void drive();
}
