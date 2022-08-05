package com.hillel.kucherenko.hw9.menu;

import com.hillel.kucherenko.hw9.BouquetProcessor;
import java.util.Scanner;
import static com.hillel.kucherenko.hw9.menu.MenuBouquetOperations.bouquetOperations;
import static com.hillel.kucherenko.hw9.menu.MenuCreateBouquet.createBouquet;
import static com.hillel.kucherenko.hw9.utils.PrintCurrentBouquets.printCurrentBouquets;

public class MenuMain {

    public static void mainMenu(Scanner scanner) {
        int result;
        String mainScreen;
        BouquetProcessor.setCurrentItem(-1);
        mainScreen = "Please choose an option:\n" +
                "1. Create Bouquet\n" +
                "2. Bouquet operations\n" +
                "3. Print current Bouquets\n" +
                "0. Exit\n";
        result = MenuScreen.showMenu(4, mainScreen, scanner);

        if (result == 1) {
            createBouquet();
        } else if (result == 2) {
            bouquetOperations();
        } else if (result == 3) {
            printCurrentBouquets(BouquetProcessor.getMyBouquet());
            mainMenu(scanner);
        } else if (result == 0) {
            System.exit(0);
        }
    }
}
