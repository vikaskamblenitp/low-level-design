package com.vikas.lld.strategyPattern.strategy;

public class FastDrivingStrategy implements  DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Fast driving...");
    }
}
