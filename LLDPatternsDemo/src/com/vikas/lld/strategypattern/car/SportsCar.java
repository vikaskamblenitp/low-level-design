package com.vikas.lld.strategypattern.car;

import com.vikas.lld.strategypattern.strategy.FastDrivingStrategy;

public class SportsCar extends Car{
    public SportsCar() {
        super(new FastDrivingStrategy());
    }
}
