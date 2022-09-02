package com.hillel.kucherenko.hw16.processor;

import com.hillel.kucherenko.hw16.model.Transport;
import com.hillel.kucherenko.hw16.modelimpl.Bus;
import com.hillel.kucherenko.hw16.modelimpl.PassengerCar;
import com.hillel.kucherenko.hw16.modelimpl.Truck;
import com.hillel.kucherenko.hw16.taxiparkimpl.Park;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class CarParkProcessor {

    public static void main(String[] args) {

        Park myPark = new Park(makeNewPark());

        System.out.println("My park:");
        System.out.println(myPark);

        System.out.println("My park sorted:");
        myPark.sortMyStream();
        System.out.println(myPark);

        System.out.println(myPark.getTotalCostOfMyPark());
        System.out.println(myPark.getTotalCostOfMyStream());

        System.out.println(myPark.searchByMinAndMaxStream(114, 131).stream().map(Object::toString)
                .collect(Collectors.joining("\n")));
    }

    private static ArrayList<Transport> makeNewPark() {
        ArrayList<Transport> myPark = new ArrayList<>();
        myPark.add(new PassengerCar(2020, "Skoda", "Fabia", 6000, 8.2, 160, true));
        myPark.add(new PassengerCar(2020, "BMW", "x5", 33000, 6.3, 240, false));
        myPark.add(new Bus(1995, "Ikarus", "ik200", 18000, 23, 130, 55));
        myPark.add(new Bus(1992, "Ikarus", "ik155", 14300, 5.5, 115, 48));
        myPark.add(new Truck(2006, "MAN", "MAN100", 55000, 38, 162, 22000));
        return myPark;
    }
}
