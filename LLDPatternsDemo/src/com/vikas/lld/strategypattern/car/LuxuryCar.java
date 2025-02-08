package com.vikas.lld.strategypattern.car;

import com.vikas.lld.strategypattern.strategy.FastDrivingStrategy;

public class LuxuryCar extends Car {
    public LuxuryCar() {
        super(new FastDrivingStrategy());
    }
}
