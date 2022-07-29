package com.hillel.kucherenko.hw8;


public class CarParkProcessor {

    public static void main(String[] args) {
        InterfaceTransport[] myPark = new InterfaceTransport[]{
                new PassengerCar(2020, "Skoda", "Fabia", 6000, 8.2, 160, true),
                new PassengerCar(2020, "BMW", "x5", 33000, 6.3, 240, false),
                new Bus(1995, "Ikarus", "ik200", 18000, 23, 130, 55),
                new Bus(1992, "Ikarus", "ik155", 14300, 5.5, 115, 48),
                new Truck(2006, "MAN", "MAN100", 55000, 38, 162, 22000)
        };


        System.out.println(CarParkProcessorUtils.getTotalCostOfMyPark(myPark));
        System.out.println();
        CarParkProcessorUtils.printMyPark(myPark);
        System.out.println();
        CarParkProcessorUtils.sortMyPark(myPark);
        CarParkProcessorUtils.printMyPark(myPark);
        System.out.println("================");
        CarParkProcessorUtils.printMyPark(CarParkProcessorUtils.searchByMinAndMaxSpeed(114, 162, myPark));
    }

}
