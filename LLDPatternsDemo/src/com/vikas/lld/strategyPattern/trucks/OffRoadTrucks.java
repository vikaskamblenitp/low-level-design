package com.vikas.lld.strategyPattern.trucks;


import com.vikas.lld.strategyPattern.strategy.OffRoadDriveStrategy;

public class OffRoadTrucks extends Trucks {
    public OffRoadTrucks() {
        super(new OffRoadDriveStrategy());
    }
}
