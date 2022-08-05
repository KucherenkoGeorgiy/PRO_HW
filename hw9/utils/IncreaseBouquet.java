package com.hillel.kucherenko.hw9.utils;

import com.hillel.kucherenko.hw9.classes.Bouquet;

public class IncreaseBouquet {

    public static Bouquet[] increaseBouquet(Bouquet[] myBouquet) {
        Bouquet[] tempBouquet = new Bouquet[myBouquet.length + 1];
        for (int i = 0; i < myBouquet.length; i++) {
            tempBouquet[i] = myBouquet[i];
        }
        myBouquet = tempBouquet;
        return myBouquet;
    }
}
