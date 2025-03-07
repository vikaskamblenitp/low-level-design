package com.vikas.lld.strategyPattern.strategy;

public class NormalDrivingStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal driving...");
    }
}
