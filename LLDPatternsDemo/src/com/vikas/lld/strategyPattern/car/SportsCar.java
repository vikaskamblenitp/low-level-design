package com.vikas.lld.strategyPattern.car;

import com.vikas.lld.strategyPattern.strategy.FastDrivingStrategy;

public class SportsCar extends Car{
    public SportsCar() {
        super(new FastDrivingStrategy());
    }
}
