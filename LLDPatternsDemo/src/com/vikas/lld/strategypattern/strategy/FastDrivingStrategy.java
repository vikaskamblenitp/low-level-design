package com.vikas.lld.strategypattern.strategy;

public class FastDrivingStrategy implements  DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Fast driving...");
    }
}
