package com.hillel.kucherenko.hw2;

public class Task22 {
    public static void main(String[] args) {
        int[] myArray = {10, 20, 22, 43, 63, 75, 434, 5, 23, 2, 33, 44, 77, 88, 9};
        String result = "Простые числа:  ";

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != 2) {
                for (int j = 2; j < myArray[i]; j++) {
                    if (myArray[i] % j == 0) {
                        break;
                    }
                    if (myArray[i] - 1 == j) {
                        result = result + myArray[i] + ", ";
                    }
                }
            } else {
                result = result + myArray[i] + ", ";
            }
        }
        if (result.equals("Простые числа: ")) {
            System.out.println("В массиве не найдено простых чисел");
        } else {
            System.out.println(result.substring(0, result.length() - 2));
        }
    }
}
