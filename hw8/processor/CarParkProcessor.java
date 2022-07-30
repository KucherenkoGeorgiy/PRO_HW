package com.hillel.kucherenko.hw8.processor;


import com.hillel.kucherenko.hw8.classesauto.Bus;
import com.hillel.kucherenko.hw8.classesauto.PassengerCar;
import com.hillel.kucherenko.hw8.classesauto.Truck;
import com.hillel.kucherenko.hw8.classespark.Park;
import com.hillel.kucherenko.hw8.interfaceauto.InterfaceTransport;

public class CarParkProcessor {

    public static void main(String[] args) {
        InterfaceTransport[] park = new InterfaceTransport[]{
                new PassengerCar(2020, "Skoda", "Fabia", 6000, 8.2, 160, true),
                new PassengerCar(2020, "BMW", "x5", 33000, 6.3, 240, false),
                new Bus(1995, "Ikarus", "ik200", 18000, 23, 130, 55),
                new Bus(1992, "Ikarus", "ik155", 14300, 5.5, 115, 48),
                new Truck(2006, "MAN", "MAN100", 55000, 38, 162, 22000)
        };

        Park myPark = new Park(park);
        System.out.println(myPark.getTotalCostOfMyPark());
        System.out.println(myPark);
        myPark.sortMyPark();
        System.out.println(myPark);
        System.out.println("==========");
        System.out.println(park);
        System.out.println(myPark.searchByMinAndMaxSpeed(109, 161));

    }

//        static void printMyPark(InterfaceTransport[] interfaceTransport) {
//            for (int i = 0; i < interfaceTransport.length; i++) {
//                System.out.println(interfaceTransport[i].toString());
//            }
//
//        }
}
