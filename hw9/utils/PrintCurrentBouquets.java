package com.hillel.kucherenko.hw9.utils;

import com.hillel.kucherenko.hw9.classes.Bouquet;

public class PrintCurrentBouquets {

    public static void printCurrentBouquets(Bouquet[] myBouquet) {
        System.out.print("Totally you have made ");
//        System.out.println(myBouquet.length  + " bouquets!!");
//        System.out.println(myBouquet == null ? "Zero bouquets!" : (myBouquet.length + " bouquets!!"));
        if (myBouquet == null) {
            System.out.println("Zero bouquets!");
        } else {
            System.out.println(myBouquet.length + " bouquets!!");

            for (int i = 0; i < myBouquet.length; i++) {
                System.out.println("Number of Bouquet: " + i);
                System.out.println(myBouquet[i].toString());
            }
        }


//        mainMenu();

    }

}
