package com.hillel.kucherenko.hw9.menu;

import java.util.Scanner;

 class MenuScreen {

    public static int showMenu (int quantityOfMenuParameters, String textOfMenu, Scanner scanner){
        int result;

        System.out.println(textOfMenu);
        System.out.println("Scanner status 12: " + scanner.toString());
        while (true) {
            if (scanner.hasNextInt()) {
                result = scanner.nextInt();
                if (result >= 0 && result < quantityOfMenuParameters) {
                    return result;
                } else {
                    System.out.println("You must choose from 0 to " + (quantityOfMenuParameters-1));

                    System.out.println("Scanner status 23: " + scanner.toString());
                    scanner.nextLine();
                }
            } else {
                System.out.println("You must choose from 0 to " + (quantityOfMenuParameters-1));
                scanner.next();
                System.out.println("Scanner status: 29" + scanner.toString());

            }
        }
    }
}
