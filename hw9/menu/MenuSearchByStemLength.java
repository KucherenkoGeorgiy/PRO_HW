package com.hillel.kucherenko.hw9.menu;

import com.hillel.kucherenko.hw9.BouquetProcessor;
import com.hillel.kucherenko.hw9.classes.Bouquet;
import com.hillel.kucherenko.hw9.utils.GetNumericValueForBouquet;
import java.util.Scanner;

public class MenuSearchByStemLength {

    public static void searchByStemLength(int bouquetNumber) {
        int min;
        int max;
        Bouquet[] myBouquet = BouquetProcessor.getMyBouquet();

        Scanner scanner = BouquetProcessor.getScanner();
        System.out.println("please input MIN value of StemLength");
        min = GetNumericValueForBouquet.getNumericValueForBouquet(scanner);
        System.out.println("please input MAX value of StemLength");
        max = GetNumericValueForBouquet.getNumericValueForBouquet(scanner);
        BouquetProcessor.setCurrentItem(bouquetNumber);
        System.out.println("The result:");
        if (myBouquet[bouquetNumber].searchByStemLength(min, max) != null) {
            System.out.println(myBouquet[bouquetNumber].searchByStemLength(min, max).toString());
        } else {
            System.out.println("We didn't find any bouquets with your parameters(");
        }
        System.out.println("========================");
        MenuBouquetOperations.bouquetOperations();
    }
}
