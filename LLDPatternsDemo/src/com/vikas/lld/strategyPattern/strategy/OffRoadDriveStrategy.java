package com.vikas.lld.strategyPattern.strategy;

public class OffRoadDriveStrategy implements  DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Off road driving...");
    }
}
