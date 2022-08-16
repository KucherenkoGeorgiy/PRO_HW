package com.hillel.kucherenko.hw11.processor;

import com.hillel.kucherenko.hw11.iout_data.IOutProcessor;
import com.hillel.kucherenko.hw11.model.Transport;
import com.hillel.kucherenko.hw11.Taxipark_impl.Park;

public class CarParkProcessor {

    public static void main(String[] args) {
        IOutProcessor iOutProcessor = new IOutProcessor("someFile22.txt");
        Transport[] park = iOutProcessor.loadFromFile();

        Park myPark = new Park(park);

        System.out.println(myPark);
        System.out.println(myPark.getTotalCostOfMyPark());

        myPark.sortMyPark();
        System.out.println(myPark);

        System.out.println();
        printMyPark(myPark.searchByMinAndMaxSpeed(109, 161));

        iOutProcessor.saveToFile(myPark);
    }

    static void printMyPark(Transport[] transport) {
        for (int i = 0; i < transport.length; i++) {
            System.out.println(transport[i].toString());
        }
    }
}
