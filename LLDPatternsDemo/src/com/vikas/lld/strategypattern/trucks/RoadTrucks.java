package com.vikas.lld.strategypattern.trucks;

import com.vikas.lld.strategypattern.strategy.NormalDrivingStrategy;

public class RoadTrucks extends Trucks {
    public RoadTrucks() {
        super(new NormalDrivingStrategy());
    }
}
