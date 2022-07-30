package com.hillel.kucherenko.hw8.interfacepark;

import com.hillel.kucherenko.hw8.classespark.Park;

public interface InterfaceTaxipark {

    void sortMyPark();

    int getTotalCostOfMyPark();

    Park searchByMinAndMaxSpeed(int minSpeed, int maxSpeed);


}
