package com.hillel.kucherenko.hw3;

public class Task34 {

    public static void main(String[] args) {
        int k = 12;
        int matrixVal = (int) Math.ceil(Math.sqrt(k));
        int matrixTotal = matrixVal * matrixVal;

        for (int i = 1; i <= matrixTotal; i++) {
            if (i <= k) {
                if (i % matrixVal == 0) {
                    System.out.println(i);
                } else {
                    System.out.print(i + "\t");
                }
            } else {
                if (i % matrixVal == 0) {
                    System.out.println(0);
                } else {
                    System.out.print(0 + "\t");
                }
            }
        }
    }
}
