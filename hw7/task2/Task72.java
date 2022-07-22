package com.hillel.kucherenko.hw7.task2;

public class Task72 {

    public static void main(String[] args) {
        int n = 5;
        int someValue = 123456;

        System.out.println(printNumbers(n));
        System.out.println(getTotalOfNumerics(someValue));
    }

    static String printNumbers(int number) {
        if (number == 1) {
            return "1";
        }
        return printNumbers(number - 1) + " " + number;
    }

    static int getTotalOfNumerics(int someValue) {
        if (someValue % 10 == 0) {
            return 0;
        }
        return getTotalOfNumerics(someValue / 10) + someValue % 10;
    }
}
