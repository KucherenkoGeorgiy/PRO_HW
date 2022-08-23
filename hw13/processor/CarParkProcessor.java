package com.hillel.kucherenko.hw13.processor;

import com.hillel.kucherenko.hw13.taxiparkimpl.Park;
import com.hillel.kucherenko.hw13.model.Transport;
import com.hillel.kucherenko.hw13.modelimpl.Bus;
import com.hillel.kucherenko.hw13.modelimpl.PassengerCar;
import com.hillel.kucherenko.hw13.modelimpl.Truck;

public class CarParkProcessor {

    public static void main(String[] args) {

        Park myPark = new Park(makeNewPark());
        Park myPark2 = new Park(makeNewPark());
        Park myPark3 = new Park(makeNewPark());

        System.out.println("My park:");
        System.out.println(myPark);

        System.out.println("My park sorted With Method:");
        myPark.sortWithMethod();
        System.out.println(myPark);

        System.out.println("My park:");
        System.out.println(myPark2);

        System.out.println("My park sorted With Lambda:");
        myPark2.sortWithLambda();
        System.out.println(myPark2);

        System.out.println("My park:");
        System.out.println(myPark3);

        System.out.println("My park sorted With Interface:");
        myPark3.sortWithInterface();
        System.out.println(myPark3);
    }

    private static Transport[] makeNewPark() {
        Transport[] park = new Transport[]{
                new PassengerCar(2020, "Skoda", "Fabia", 6000, 8.2, 160, true),
                new PassengerCar(2020, "BMW", "x5", 33000, 6.3, 240, false),
                new Bus(1995, "Ikarus", "ik200", 18000, 23, 130, 55),
                new Bus(1992, "Ikarus", "ik155", 14300, 5.5, 115, 48),
                new Truck(2006, "MAN", "MAN100", 55000, 38, 162, 22000)
        };

        return park;
    }

    static void printMyPark(Transport[] transport) {
        for (int i = 0; i < transport.length; i++) {
            System.out.println(transport[i].toString());
        }
    }
}
