package com.hillel.kucherenko.hw5.task54;

public class BuildingMatrix {
    int userInput;

    public BuildingMatrix(int userInput) {
        this.userInput = userInput;
    }

    public String buildMatrix () {

        String result = "";
        int matrixVal = (int) Math.ceil(Math.sqrt(userInput));
        int matrixTotal = matrixVal * matrixVal;

        for (int i = 1; i <= matrixTotal; i++) {
            if (i <= userInput) {
                if (i % matrixVal == 0) {
                    result = result + i + "\n";
//                    System.out.println(i);
                } else {
//                    System.out.print(i + "\t");
                    result = result + i + "\t";
                }
            } else {
                if (i % matrixVal == 0) {
//                    System.out.println(0);
                    result = result + 0 + "\n";
                } else {
                    System.out.print(0 + "\t");
                    result = result + 0 + "\t";
                }
            }
        }
        return result;
    }
}
