package com.hillel.kucherenko.hw16.taxiparkimpl;

import com.hillel.kucherenko.hw16.model.Transport;
import com.hillel.kucherenko.hw16.taxipark.InterfaceTaxipark;
import com.hillel.kucherenko.hw16.utils.ComparatorByFuelCons;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Park implements InterfaceTaxipark {
    private ArrayList<Transport> myPark;

    public Park(ArrayList<Transport> myPark) {
        this.myPark = myPark;
    }

    public void sortMyPark() {
        myPark.sort(new ComparatorByFuelCons());
    }

    public void sortMyStream() {
        ArrayList<Transport> newPark = new ArrayList<>();
        Stream<Transport> sortedStream = this.getMyPark().stream()
                .sorted(new ComparatorByFuelCons());
        sortedStream.forEach(newPark::add);
        myPark = newPark;
    }

    public int getTotalCostOfMyPark() {
        int totalCost = 0;

        for (Transport transportUnit :
                myPark) {
            totalCost += transportUnit.getPrice();
        }
        return totalCost;
    }

    public int getTotalCostOfMyStream() {
        return getMyPark().stream().mapToInt(Transport::getPrice).sum();
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

    public ArrayList<Transport> searchByMinAndMaxStream(int minSpeed, int maxSpeed) {
        ArrayList<Transport> resultArray = new ArrayList<>();

        Stream<Transport> sortedStream = this.getMyPark().stream()
                .filter((n) -> n.getMaxSpeed() < maxSpeed)
                .filter((n) -> n.getMaxSpeed() > minSpeed);
        sortedStream.forEach(resultArray::add);

        return resultArray;
    }


    @Override
    public String toString() {

        return this.getMyPark().stream()
                .map(Object::toString)
                .collect(Collectors.joining("\n"));
    }

    public ArrayList<Transport> getMyPark() {
        return myPark;
    }
}
