package com.vikas.lld.strategyPattern.car;

import com.vikas.lld.strategyPattern.strategy.FastDrivingStrategy;

public class LuxuryCar extends Car {
    public LuxuryCar() {
        super(new FastDrivingStrategy());
    }
}
