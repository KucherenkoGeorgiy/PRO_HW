package com.hillel.kucherenko.hw9.menu;

import com.hillel.kucherenko.hw9.BouquetProcessor;

import java.util.Scanner;

import static com.hillel.kucherenko.hw9.menu.MenuMain.mainMenu;

 class MenuBouquetOperations {

    static void bouquetOperations() {
        Scanner scanner = BouquetProcessor.getScanner();
        System.out.println("We are working on this menu (BouquetOperations..\n" +
                "meanwhile sending you to mainMenu");
        mainMenu(scanner);

    }

}
