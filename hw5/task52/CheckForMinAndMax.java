package com.hillel.kucherenko.hw5.task52;

public class CheckForMinAndMax {
    int[] inputArray;

    public CheckForMinAndMax(int[] inputArray) {
        this.inputArray = inputArray;
    }

    public ResultOfMinMaxSearch findMaxValue (){
        int maxQty = lengthOfNumber(inputArray[0]);
        int maxIndex = 0;

        for (int i = 1; i < inputArray.length; i++) {
            if (lengthOfNumber(inputArray[i]) >= maxQty) {
                maxQty = lengthOfNumber(inputArray[i]);
                maxIndex = i;
            }
        }
        return (new ResultOfMinMaxSearch(maxQty, maxIndex));

    }

    public ResultOfMinMaxSearch findMinValue (){
        int minQty = lengthOfNumber(inputArray[0]);
        int minIndex = 0;

        for (int i = 1; i < inputArray.length; i++) {
            if (lengthOfNumber(inputArray[i]) <= minQty) {
                minQty = lengthOfNumber(inputArray[i]);
                minIndex = i;
            }
        }
        return (new ResultOfMinMaxSearch(minQty, minIndex));
    }

     int lengthOfNumber(int currNumb) {
        int qty = 1;
        currNumb /= 10;
        while (currNumb != 0) {
            qty++;
            currNumb /= 10;
        }
        return qty;
    }
}
