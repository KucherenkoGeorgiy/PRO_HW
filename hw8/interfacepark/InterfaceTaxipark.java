package com.hillel.kucherenko.hw8.interfacepark;

import com.hillel.kucherenko.hw8.classesauto.Transport;

public interface InterfaceTaxipark {

    void sortMyPark();

    int getTotalCostOfMyPark();

    Transport[] searchByMinAndMaxSpeed(int minSpeed, int maxSpeed);

    Transport[] getMyPark();
}
