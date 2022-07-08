package com.hillel.kucherenko.hw2;

public class Task23 {
    public static void main(String[] args) {
        int[] fibAr = new int[20];
        String fibResult = "Первые 20 чисел Фибоначчи:  0, 1, ";

        fibAr[0] = 0;
        fibAr[1] = 1;
        for (int i = 2; i < 20; i++) {
            fibAr[i] = fibAr[i - 1] + fibAr[i - 2];
            fibResult = fibResult + fibAr[i] + ", ";
        }

        System.out.println(fibResult.substring(0, fibResult.length() - 2));
    }
}
