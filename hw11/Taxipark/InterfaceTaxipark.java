package com.hillel.kucherenko.hw11.Taxipark;

import com.hillel.kucherenko.hw11.model.Transport;

public interface InterfaceTaxipark {

    void sortMyPark();

    int getTotalCostOfMyPark();

    Transport[] searchByMinAndMaxSpeed(int minSpeed, int maxSpeed);

    Transport[] getMyPark();
}
