package com.hillel.kucherenko.hw9.menu;

import java.util.Scanner;

class MenuScreen {

    public static int showMenu(int quantityOfMenuParameters, String textOfMenu, Scanner scanner) {
        int result;

        System.out.println(textOfMenu);
        while (true) {
            if (scanner.hasNextInt()) {
                result = scanner.nextInt();
                if (result >= 0 && result < quantityOfMenuParameters) {
                    return result;
                } else {
                    System.out.println("You must choose from 0 to " + (quantityOfMenuParameters - 1));
                    scanner.nextLine();
                }
            } else {
                System.out.println("You must choose from 0 to " + (quantityOfMenuParameters - 1));
                scanner.next();
            }
        }
    }
}
