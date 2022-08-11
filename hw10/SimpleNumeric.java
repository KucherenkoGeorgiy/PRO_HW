package com.hillel.kucherenko.hw10;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleNumeric {
    static int minValue;
    static int maxValue;
    static int quantityOfThreads;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Now you have to input MIN and MAX values of range");

        receiveAllNeededData(scanner);

        ArrayOfSimple arrayOfSimple = new ArrayOfSimple(minValue, maxValue, quantityOfThreads);
        arrayOfSimple.makeThreads();
        System.out.println("Final Array: " + Arrays.toString(arrayOfSimple.getFinalArray()));
        Arrays.sort(arrayOfSimple.getFinalArray());
        System.out.println("=======================");
        System.out.println("Final Array sorted: " + Arrays.toString(arrayOfSimple.getFinalArray()));
        scanner.close();
    }

    private static void receiveAllNeededData(Scanner scanner) {
        while (true) {
            System.out.println("Please type min value");
            minValue = getInputFromUser(scanner);
            System.out.println("Please type max value");
            maxValue = getInputFromUser(scanner);
            System.out.println("Please type quantity of threads");
            quantityOfThreads = getInputFromUser(scanner);

            if (maxValue > minValue && minValue > 0 && quantityOfThreads <= (maxValue - minValue)) {
                break;
            } else {
                System.out.println("Your input is incorrect! The rules of Input:\n"
                        + "1) MAX > MIN > 0\n"
                        + "2) Quantity of Threads >= MAX - MIN\n"
                        + "Please, try again!\n");
            }
        }
    }

    private static int getInputFromUser(Scanner scanner) {
        int usersValue;

        while (true) {
            if (scanner.hasNextInt()) {
                usersValue = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Please type numeric value");
                scanner.next();
            }
        }
        return usersValue;
    }
}
