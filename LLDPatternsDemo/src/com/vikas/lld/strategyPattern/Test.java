package com.vikas.lld.strategyPattern;

import com.vikas.lld.strategyPattern.car.Car;
import com.vikas.lld.strategyPattern.car.LuxuryCar;
import com.vikas.lld.strategyPattern.trucks.OffRoadTrucks;
import com.vikas.lld.strategyPattern.trucks.Trucks;

public class Test {
    public static void main(String[] args) {
        Trucks myTruck = new OffRoadTrucks();
        myTruck.drive();

        Car myCar = new LuxuryCar();
        myCar.drive();

        System.out.println(myCar.strategy.toString());

    }
}
