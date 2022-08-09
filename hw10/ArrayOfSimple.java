package com.hillel.kucherenko.hw10;

public class ArrayOfSimple {
    private final int minValueOfRange;
    private final int maxValueofRange;
    private final int quantityOfArrays;
    private int[] finalArray;

    public int[] getFinalArray() {
        return finalArray;
    }

    public ArrayOfSimple(int minValueOfRange, int maxValueofRange, int quantityOfArrays) {
        this.minValueOfRange = minValueOfRange;
        this.maxValueofRange = maxValueofRange;
        this.quantityOfArrays = quantityOfArrays;
    }

    public void makeThreads() {

        int rangeOfSubarray = (maxValueofRange - minValueOfRange) / quantityOfArrays;
        int counter = 0;
        for (int i = minValueOfRange; i < maxValueofRange; i += rangeOfSubarray) {
            counter++;
            if (counter != quantityOfArrays) {
                new MicroArray(this, i, i + rangeOfSubarray - 1);
            } else {
                new MicroArray(this, i, maxValueofRange);
                break;
            }
        }
    }


    public synchronized void createFinalArray(int[] array) {
        int[] tempArray;
        int quantityOfElementsOfFinalArray;
        if (finalArray == null) {
            finalArray = array;
        } else {
            quantityOfElementsOfFinalArray = finalArray.length + array.length;
            tempArray = new int[quantityOfElementsOfFinalArray];
            for (int i = 0; i < finalArray.length; i++) {
                tempArray[i] = finalArray[i];
            }
            for (int i = finalArray.length, j = 0; i < tempArray.length; i++, j++) {
                tempArray[i] = array[j];
            }
            finalArray = tempArray;
        }
    }
}
