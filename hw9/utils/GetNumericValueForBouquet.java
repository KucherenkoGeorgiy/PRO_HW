package com.hillel.kucherenko.hw9.utils;

import java.util.Scanner;

public class GetNumericValueForBouquet {

    public static int getNumericValueForBouquet(Scanner scanner){
        int result;

        while (true) {
            if (scanner.hasNextInt()) {
                result = scanner.nextInt();
                break;
            } else {
                System.out.println("You must put NUMERIC int value");
                scanner.nextLine();
            }
        }

        return result;
    }
}
