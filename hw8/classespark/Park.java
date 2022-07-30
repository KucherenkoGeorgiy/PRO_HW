package com.hillel.kucherenko.hw8.classespark;

import com.hillel.kucherenko.hw8.interfaceauto.InterfaceTransport;
import com.hillel.kucherenko.hw8.interfacepark.InterfaceTaxipark;
import com.sun.jdi.connect.Transport;

import java.util.Arrays;

public class Park implements InterfaceTaxipark {
    InterfaceTransport[] myPark;

    public Park(InterfaceTransport[] myPark) {
        this.myPark = myPark;
    }

    public void sortMyPark() {
        InterfaceTransport tempValueOfTransportUnit;
        for (int i = 0; i < myPark.length; i++) {
            for (int j = 0; j < myPark.length-i -1; j++) {
                if (myPark[j].getFuelConsumption() > myPark[j+1].getFuelConsumption()){
                    tempValueOfTransportUnit = myPark[j+1];
                    myPark[j+1] = myPark[j];
                    myPark[j]  = tempValueOfTransportUnit;
                }
            }
        }
    }

    public int getTotalCostOfMyPark() {
        int totalCost = 0;

        for (InterfaceTransport transportUnit :
                myPark) {
            totalCost += transportUnit.getPrice();
        }
        return totalCost;
    }

    public Park searchByMinAndMaxSpeed(int minSpeed, int maxSpeed){
        InterfaceTransport[] resultArray = {};
        System.out.println("Min=" + minSpeed + ", Max=" + maxSpeed);
        for (int i = 0; i < myPark.length; i++) {
            if (maxSpeed >= myPark[i].getMaxSpeed() && minSpeed <= myPark[i].getMaxSpeed()){
                resultArray = addTransportToArray(resultArray, i, myPark);
            }
        }

        return (new Park(resultArray));
    }

        private   InterfaceTransport[] addTransportToArray(InterfaceTransport[] resultArray, int i, InterfaceTransport[] myPark) {
        if (resultArray.length == 0){
            resultArray = new InterfaceTransport[1];
            resultArray[0] = myPark[i];
        } else {
            InterfaceTransport[] tempArray = new InterfaceTransport[resultArray.length + 1];
            for (int j = 0; j < resultArray.length; j++) {
                tempArray[j] = resultArray[j];
            }
            tempArray[tempArray.length-1] = myPark[i];
            resultArray = tempArray;

        }
        return resultArray;
    }

    @Override
    public String toString() {
        String result = "";

        for (InterfaceTransport transport:
             myPark) {
            result += transport.toString() + "\n";

        }
        return result;
    }
}
