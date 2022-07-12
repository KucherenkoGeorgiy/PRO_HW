package com.hillel.kucherenko.hw3;

public class Task33 {

    public static void main(String[] args) {
        int[] bigArray = {123456, 333312, 113, 5556, 125552, 313, 4, 23, 5};
        boolean hasRepeats;
        int tempValue;

        for (int k = 0; k < bigArray.length; k++) {
            hasRepeats = false;
            for (int i = bigArray[k]; i > 10; i /= 10) {
                if (hasRepeats) {
                    break;
                }
                tempValue = i % 10;
                for (int j = i / 10; j > 0; j /= 10) {
                    if (tempValue == j % 10) {
                        hasRepeats = true;
                        break;
                    }
                }
            }
            if (!hasRepeats) {
                System.out.println("no repeats: " + bigArray[k]);
            }
        }
    }
}


