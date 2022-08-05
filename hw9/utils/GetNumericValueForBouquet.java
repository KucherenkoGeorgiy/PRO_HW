package com.hillel.kucherenko.hw9.utils;

import com.hillel.kucherenko.hw9.classes.MistypeException;
import java.util.Scanner;

public class GetNumericValueForBouquet {

    public static int getNumericValueForBouquet(Scanner scanner) {
        int result;

        while (true) {
            try {
                if (scanner.hasNextInt()) {
                    result = scanner.nextInt();
                    break;
                } else {
                    scanner.nextLine();
                    throw (new MistypeException());
                }
            } catch (MistypeException mistypeException) {
                System.out.println(mistypeException);
            }
        }
        return result;
    }
}
