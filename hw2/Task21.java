package com.hillel.kucherenko.hw2;

public class Task21 {

    public static void main(String[] args) {
        int[] myArray = {10, 20, 22, 43, 63, 75, 434, 5, 23, 2, 33, 44, 77, 88, 9};
        String chetChisl = "Четные числа:  ";
        String neChetChisl = "Нечетные числа:  ";

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                chetChisl = chetChisl + myArray[i] + ", ";
            } else {
                neChetChisl = neChetChisl + myArray[i] + ", ";
            }
        }

        System.out.println(chetChisl.substring(0, chetChisl.length() - 2));
        System.out.println(neChetChisl.substring(0, neChetChisl.length() - 2));
    }
}
