package com.hillel.kucherenko.hw3;

public class Task32 {

    public static void main(String[] args) {
        int[] bigArray = {22222, 333312, 113, 5556, 125552, 313, 4, 23, 5};
        int minQty = lengthOfNumber(bigArray[0]);
        int minIndex = 0;
        int maxQty = lengthOfNumber(bigArray[0]);
        int maxIndex = 0;

        for (int i = 1; i < bigArray.length; i++) {
            if (lengthOfNumber(bigArray[i]) >= maxQty) {
                maxQty = lengthOfNumber(bigArray[i]);
                maxIndex = i;
            }
            if (lengthOfNumber(bigArray[i]) <= minQty) {
                minQty = lengthOfNumber(bigArray[i]);
                minIndex = i;
            }
        }

        System.out.println("Last MINIMAL amount in array: "
                + bigArray[minIndex] + ". Length of it : " + minQty);
        System.out.println("Last MAXIMAL amount in array: "
                + bigArray[maxIndex] + ". Length of it: " + maxQty);
    }

    static int lengthOfNumber(int currNumb) {
        int qty = 1;
        currNumb /= 10;
        while (currNumb != 0) {
            qty++;
            currNumb /= 10;
        }
        return qty;
    }
}
