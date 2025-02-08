package com.vikas.lld.strategypattern.strategy;

public class OffRoadDriveStrategy implements  DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Off road driving...");
    }
}
