package com.hillel.kucherenko.hw14.task1.taxipark;

import com.hillel.kucherenko.hw14.task1.model.Transport;

import java.util.ArrayList;
import java.util.List;

public interface InterfaceTaxipark {

    void sortMyPark();

    int getTotalCostOfMyPark();

    ArrayList<Transport> searchByMinAndMaxSpeed(int minSpeed, int maxSpeed);

    ArrayList<Transport> getMyPark();
}
