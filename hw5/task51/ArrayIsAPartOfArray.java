package com.hillel.kucherenko.hw5.task51;

public class ArrayIsAPartOfArray {
    int[] bigArray;
    int[] smallArray;

    public ArrayIsAPartOfArray(int[] bigArray, int[] smallArray) {
        this.bigArray = bigArray;
        this.smallArray = smallArray;
    }

    public ResultOfComparing compareArrays() {

        int tempValue;
        boolean isCorrect = false;

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
                break;
            }
        }
        return (new ResultOfComparing(isCorrect));
    }

}
