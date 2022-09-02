package com.hillel.kucherenko.hw14.task1.taxiparkimpl;

import com.hillel.kucherenko.hw14.task1.model.Transport;
import com.hillel.kucherenko.hw14.task1.taxipark.InterfaceTaxipark;
import com.hillel.kucherenko.hw14.task1.utils.ComparatorByFuelCons;

import java.util.ArrayList;

public class Park implements InterfaceTaxipark {
    private final ArrayList<Transport> myPark;

    public Park(ArrayList<Transport> myPark) {
        this.myPark = myPark;
    }

    public void sortMyPark() {
        myPark.sort(new ComparatorByFuelCons());
    }

    public int getTotalCostOfMyPark() {
        int totalCost = 0;

        for (Transport transportUnit :
                myPark) {
            totalCost += transportUnit.getPrice();
        }
        return totalCost;
    }

    public ArrayList<Transport> searchByMinAndMaxSpeed(int minSpeed, int maxSpeed) {
        ArrayList<Transport> resultArray = new ArrayList<>() {
        };
        System.out.println("Min=" + minSpeed + ", Max=" + maxSpeed);

        for (Transport transport :
                myPark) {
            if (maxSpeed >= transport.getMaxSpeed() && minSpeed <= transport.getMaxSpeed()) {
                resultArray.add(transport);
            }
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

    public ArrayList<Transport> getMyPark() {
        return myPark;
    }
}
