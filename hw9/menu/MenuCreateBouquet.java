package com.hillel.kucherenko.hw9.menu;

import com.hillel.kucherenko.hw9.BouquetProcessor;
import java.util.Scanner;
import static com.hillel.kucherenko.hw9.menu.MenuCreateAccessory.createAccessory;
import static com.hillel.kucherenko.hw9.menu.MenuCreateFlower.createFlower;
import static com.hillel.kucherenko.hw9.menu.MenuMain.mainMenu;

class MenuCreateBouquet {
    static void createBouquet() {
        Scanner scanner = BouquetProcessor.getScanner();

        int result;
        String mainScreen;
        mainScreen = "Please choose an option:\n" +
                "1. Create Flower\n" +
                "2. Create Accessory\n" +
                "0. Main menu\n";
        result = MenuScreen.showMenu(3, mainScreen, scanner);
        if (result == 0) {
            mainMenu(scanner);
        } else if (result == 1) {
            createFlower();
        } else if (result == 2) {
            createAccessory();
        }
    }
}
