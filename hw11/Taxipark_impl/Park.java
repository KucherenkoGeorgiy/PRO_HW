package com.hillel.kucherenko.hw11.Taxipark_impl;

import com.hillel.kucherenko.hw11.model.Transport;
import com.hillel.kucherenko.hw11.Taxipark.InterfaceTaxipark;

public class Park implements InterfaceTaxipark {
    private final Transport[] myPark;

    public Park(Transport[] myPark) {
        this.myPark = myPark;
    }

    public void sortMyPark() {
        Transport tempValueOfTransportUnit;
        for (int i = 0; i < myPark.length; i++) {
            for (int j = 0; j < myPark.length - i - 1; j++) {
                if (myPark[j].getFuelConsumption() > myPark[j + 1].getFuelConsumption()) {
                    tempValueOfTransportUnit = myPark[j + 1];
                    myPark[j + 1] = myPark[j];
                    myPark[j] = tempValueOfTransportUnit;
                }
            }
        }
    }

    public int getTotalCostOfMyPark() {
        int totalCost = 0;

        for (Transport transportUnit :
                myPark) {
            totalCost += transportUnit.getPrice();
        }
        return totalCost;
    }

    public Transport[] searchByMinAndMaxSpeed(int minSpeed, int maxSpeed) {
        Transport[] resultArray = {};
        System.out.println("Min=" + minSpeed + ", Max=" + maxSpeed);
        for (int i = 0; i < myPark.length; i++) {
            if (maxSpeed >= myPark[i].getMaxSpeed() && minSpeed <= myPark[i].getMaxSpeed()) {
                resultArray = addTransportToArray(resultArray, i, myPark);
            }
        }
        return (resultArray);
    }

    private Transport[] addTransportToArray(Transport[] resultArray, int i, Transport[] myPark) {
        if (resultArray.length == 0) {
            resultArray = new Transport[1];
            resultArray[0] = myPark[i];
        } else {
            Transport[] tempArray = new Transport[resultArray.length + 1];
            for (int j = 0; j < resultArray.length; j++) {
                tempArray[j] = resultArray[j];
            }
            tempArray[tempArray.length - 1] = myPark[i];
            resultArray = tempArray;
        }
        return resultArray;
    }

    @Override
    public String toString() {
        String result = "";
        for (Transport transport :
                myPark) {
            result += transport.toString() + "\n";
        }
        return result;
    }

    public Transport[] getMyPark() {
        return myPark;
    }
}
