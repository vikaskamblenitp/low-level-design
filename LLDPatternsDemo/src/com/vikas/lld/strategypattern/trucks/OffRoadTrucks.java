package com.vikas.lld.strategypattern.trucks;


import com.vikas.lld.strategypattern.strategy.OffRoadDriveStrategy;

public class OffRoadTrucks extends Trucks {
    public OffRoadTrucks() {
        super(new OffRoadDriveStrategy());
    }
}
