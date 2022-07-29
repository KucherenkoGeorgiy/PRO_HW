package com.hillel.kucherenko.hw8;

public class CarParkProcessorUtils {

    public static void sortMyPark(InterfaceTransport[] myPark) {
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

    public static int getTotalCostOfMyPark(InterfaceTransport[] myPark) {
        int totalCost = 0;

        for (InterfaceTransport transportUnit :
                myPark) {
            totalCost += transportUnit.getPrice();
        }
        return totalCost;
    }
    static InterfaceTransport[] searchByMinAndMaxSpeed(int minSpeed, int maxSpeed, InterfaceTransport[] myPark){
        InterfaceTransport[] resultArray = {};
        System.out.println("Min=" + minSpeed + ", Max=" + maxSpeed);
        for (int i = 0; i < myPark.length; i++) {
            if (maxSpeed >= myPark[i].getMaxSpeed() && minSpeed <= myPark[i].getMaxSpeed()){
                resultArray = addTransportToArray(resultArray, i, myPark);
            }
        }

        return resultArray;
    }
    private static InterfaceTransport[] addTransportToArray(InterfaceTransport[] resultArray, int i, InterfaceTransport[] myPark) {
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
    static void printMyPark(InterfaceTransport[] interfaceTransport){
        for (int i = 0; i < interfaceTransport.length; i++) {
            System.out.println(interfaceTransport[i].toString());
        }
    }


}
