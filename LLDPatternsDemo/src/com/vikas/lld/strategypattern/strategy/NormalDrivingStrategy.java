package com.vikas.lld.strategypattern.strategy;

public class NormalDrivingStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal driving...");
    }
}
