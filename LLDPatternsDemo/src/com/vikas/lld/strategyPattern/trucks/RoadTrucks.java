package com.vikas.lld.strategyPattern.trucks;

import com.vikas.lld.strategyPattern.strategy.NormalDrivingStrategy;

public class RoadTrucks extends Trucks {
    public RoadTrucks() {
        super(new NormalDrivingStrategy());
    }
}
