package com.hillel.kucherenko.hw2;

public class Task24 {
    public static void main(String[] args) {
        int[] myArray = {10, 20, 22, 43, 63, 75, 434, 5, 23, 2, 33, 44, 77, 88, 9};
        int minValue = myArray[0];
        int maxValue = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > maxValue) {
                maxValue = myArray[i];
            } else if (myArray[i] < minValue) {
                minValue = myArray[i];
            }
        }
        System.out.println("Минимальное значение массива:  " + minValue);
        System.out.println("Максимальное значение массива:  " + maxValue);
    }
}
