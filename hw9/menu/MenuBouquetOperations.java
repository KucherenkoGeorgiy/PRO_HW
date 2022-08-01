package com.hillel.kucherenko.hw9.menu;

import com.hillel.kucherenko.hw9.BouquetProcessor;
import com.hillel.kucherenko.hw9.classes.Bouquet;
import com.hillel.kucherenko.hw9.classes.ElementsOfBouquet;
import com.hillel.kucherenko.hw9.utils.GetNumericValueForBouquet;
import com.hillel.kucherenko.hw9.utils.PrintCurrentBouquets;

import java.util.Scanner;

import static com.hillel.kucherenko.hw9.menu.MenuCreateBouquet.createBouquet;
import static com.hillel.kucherenko.hw9.menu.MenuMain.mainMenu;
import static com.hillel.kucherenko.hw9.menu.MenuNewFlower.newFlower;

class MenuBouquetOperations {

    static void bouquetOperations() {
        Scanner scanner = BouquetProcessor.getScanner();
        int result;
        int bouquetNumber;
        String mainScreen;
        int min;
        int max;
        Bouquet[] myBouquet = BouquetProcessor.getMyBouquet();
        PrintCurrentBouquets.printCurrentBouquets(myBouquet);
        bouquetNumber = MenuScreen.showMenu(myBouquet.length,"Please choose the Bouquet", scanner);

        mainScreen = "Please choose the operation with Bouquet:\n" +
                "1. Sort by Shelf-life\n" +
                "2. Search by Stem-Length\n" +
                "3. Print Bouquet's price\n" +
                "4. Add Flower\n" +
                "5. Add Accessory\n" +
                "0. Back\n";
        result = MenuScreen.showMenu(6, mainScreen, scanner);
        if (result == 0){
            MenuMain.mainMenu(scanner);
        } else if (result == 1) {
            System.out.println("Here we will sort later.. meanwhile go back");
            System.out.println(myBouquet[bouquetNumber].sortByShelfLife().toString());
            MenuBouquetOperations.bouquetOperations();
        } else if (result == 2) {
            System.out.println("please input MIN value of StemLength");
            min = GetNumericValueForBouquet.getNumericValueForBouquet(scanner);
            System.out.println("please input MAX value of StemLength");
            max = GetNumericValueForBouquet.getNumericValueForBouquet(scanner);
            BouquetProcessor.setCurrentItem(bouquetNumber);
            System.out.println("The result:");
            System.out.println(myBouquet[bouquetNumber].searchByStemLength(min, max).toString());
            System.out.println("========================");
            MenuBouquetOperations.bouquetOperations();
        } else if (result == 3) {
            System.out.println("Total price of Bouquet #" + bouquetNumber + ": "
                                + myBouquet[bouquetNumber].getTotalPrice());
            System.out.println("==================================================\n");
            MenuBouquetOperations.bouquetOperations();
        } else if (result == 4) {
            BouquetProcessor.setCurrentItem(bouquetNumber);
            MenuNewFlower.newFlower();
        } else if (result == 5) {
            BouquetProcessor.setCurrentItem(bouquetNumber);
            MenuNewAccessory.newAccessory();
        }
    }

}
