package com.hillel.kucherenko.hw3;

public class Task31 {

    public static void main(String[] args) {
        int[] bigArray = {2, 12, 3, 6, 12, 313, 4, 23, 77};
        int[] smallArray = {6, 12, 313};
        int tempValue;
        boolean isCorrect = false;
//this is for testing github
        for (int i = 0; i < (bigArray.length - smallArray.length + 1); i++) {
            if (bigArray[i] == smallArray[0]) {
                tempValue = i + 1;
                for (int j = 1; j < smallArray.length; j++) {
                    if (bigArray[tempValue] != smallArray[j]) {
                        break;
                    } else {
                        if (j + 1 == smallArray.length) {
                            isCorrect = true;
                        }
                    }
                    tempValue++;
                }
            }
            if (isCorrect) {
                System.out.println("Yes, small Array is a part of big Array");
                break;
            }
        }
        if (!isCorrect) {
            System.out.println("No, small array is not a part of big array");
        }
    }
}
