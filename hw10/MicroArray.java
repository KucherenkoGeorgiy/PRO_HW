package com.hillel.kucherenko.hw10;

public class MicroArray implements Runnable {
    private final ArrayOfSimple arrayOfSimple;
    private final int min;
    private final int max;
    Thread t;
    int[] res;


    public MicroArray(ArrayOfSimple arrayOfSimple, int min, int max) {
        this.arrayOfSimple = arrayOfSimple;
        this.min = min;
        this.max = max;
        t = new Thread(this, "Producer ");
//        t.start();
    }

    public int[] getRes() {
        return res;
    }

    private int[] searchForSimpleNumerics(int min, int max) {
        int[] tempResult = new int[]{};
        boolean isSimple;
        for (int i = min; i <= max; i++) {
            isSimple = false;
            if (i > 1) {
                for (int j = 2; j <= (i / 2); j++) {
                    if (i % j == 0) {
                        isSimple = true;
                        break;
                    }
                }
                if (!isSimple) {
                    tempResult = pushElementsToSubArray(tempResult, i);
                }
            }
        }
        return tempResult;
    }

    private int[] pushElementsToSubArray(int[] tempResult, int i) {
        int[] newTempResult;
        if (tempResult.length == 0) {
            tempResult = new int[]{i};
        } else {
            newTempResult = new int[tempResult.length + 1];
            for (int j = 0; j < tempResult.length; j++) {
                newTempResult[j] = tempResult[j];
            }
            newTempResult[tempResult.length] = i;
            tempResult = newTempResult;
        }
        return tempResult;
    }

    @Override
    public void run() {

        res = searchForSimpleNumerics(min, max);
        arrayOfSimple.createFinalArray(res);
    }
}
