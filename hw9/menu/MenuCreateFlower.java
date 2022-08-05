package com.hillel.kucherenko.hw9.menu;

import com.hillel.kucherenko.hw9.BouquetProcessor;
import java.util.Scanner;
import static com.hillel.kucherenko.hw9.menu.MenuCreateBouquet.createBouquet;
import static com.hillel.kucherenko.hw9.menu.MenuNewFlower.newFlower;

class MenuCreateFlower {

    public static void createFlower() {
        Scanner scanner = BouquetProcessor.getScanner();
        int result;
        String mainScreen;
        mainScreen = "Please choose an option:\n" +
                "1. New Flower\n" +
                "0. Back\n";
        result = MenuScreen.showMenu(2, mainScreen, scanner);
        if (result == 0) {
            createBouquet();
        } else if (result == 1) {
            newFlower();
        }
    }
}
