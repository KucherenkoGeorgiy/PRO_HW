package com.hillel.kucherenko.hw16.taxipark;

import com.hillel.kucherenko.hw16.model.Transport;

import java.util.ArrayList;

public interface InterfaceTaxipark {

    void sortMyPark();

    int getTotalCostOfMyPark();

    ArrayList<Transport> searchByMinAndMaxSpeed(int minSpeed, int maxSpeed);

    ArrayList<Transport> getMyPark();
}
