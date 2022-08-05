package com.hillel.kucherenko.hw9.menu;

import com.hillel.kucherenko.hw9.BouquetProcessor;
import com.hillel.kucherenko.hw9.classes.Bouquet;
import com.hillel.kucherenko.hw9.utils.PrintCurrentBouquets;

import java.util.Scanner;


class MenuBouquetOperations {

    static void bouquetOperations() {
        Scanner scanner = BouquetProcessor.getScanner();
        int result;
        int bouquetNumber;
        String mainScreen;

        Bouquet[] myBouquet = BouquetProcessor.getMyBouquet();
        if (myBouquet != null) {
            PrintCurrentBouquets.printCurrentBouquets(myBouquet);
            bouquetNumber = MenuScreen.showMenu(myBouquet.length, "Please choose the Bouquet", scanner);

            mainScreen = "Please choose the operation with Bouquet:\n" +
                    "1. Sort by Shelf-life\n" +
                    "2. Search by Stem-Length\n" +
                    "3. Print Bouquet's price\n" +
                    "4. Add Flower\n" +
                    "5. Add Accessory\n" +
                    "0. Back\n";
            result = MenuScreen.showMenu(6, mainScreen, scanner);
            if (result == 0) {
                MenuMain.mainMenu(scanner);
            } else if (result == 1) {
                System.out.println(myBouquet[bouquetNumber].sortByShelfLife().toString());
                MenuBouquetOperations.bouquetOperations();
            } else if (result == 2) {
                MenuSearchByStemLength.searchByStemLength(bouquetNumber);
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

        } else {
            System.out.println("You didn't make any bouquets yet!\n");
            MenuMain.mainMenu(scanner);
        }
    }
}
