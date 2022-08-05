package com.hillel.kucherenko.hw9.utils;

import com.hillel.kucherenko.hw9.classes.Bouquet;

public class PrintCurrentBouquets {

    public static void printCurrentBouquets(Bouquet[] myBouquet) {
        String separator = "=======================================================";
        System.out.print(separator + "\nTotally you have made ");
        if (myBouquet == null) {
            System.out.println("Zero bouquets!\n" + separator + "\n");
        } else {
            System.out.println(myBouquet.length + " bouquets!!");
            for (int i = 0; i < myBouquet.length; i++) {
                System.out.println(separator + "\n" + i + " <<<<<<----  Number of Bouquet");
                System.out.println(myBouquet[i].toString());
            }
            System.out.println(separator);
        }
    }
}
