package com.hillel.kucherenko.hw8.interfacepark;

import com.hillel.kucherenko.hw8.classespark.Park;
import com.hillel.kucherenko.hw8.interfaceauto.InterfaceTransport;
import com.sun.jdi.connect.Transport;

public interface InterfaceTaxipark {

    void sortMyPark();

    int getTotalCostOfMyPark();

    Park searchByMinAndMaxSpeed(int minSpeed, int maxSpeed);

//    InterfaceTransport[] addTransportToArray(InterfaceTransport[] resultArray, int i);


}
