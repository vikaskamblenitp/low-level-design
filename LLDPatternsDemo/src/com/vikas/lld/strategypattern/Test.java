package com.vikas.lld.strategypattern;

import com.vikas.lld.strategypattern.car.Car;
import com.vikas.lld.strategypattern.car.LuxuryCar;
import com.vikas.lld.strategypattern.trucks.OffRoadTrucks;
import com.vikas.lld.strategypattern.trucks.Trucks;

public class Test {
    public static void main(String[] args) {
        Trucks myTruck = new OffRoadTrucks();
        myTruck.drive();

        Car myCar = new LuxuryCar();
        myCar.drive();

        System.out.println(myCar.strategy.toString());

    }
}
