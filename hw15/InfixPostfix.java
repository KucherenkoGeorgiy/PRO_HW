package com.hillel.kucherenko.hw15;


public class InfixPostfix {

    public static void main(String[] args) {
        Integer resultDeque;
        String inputData = "5 * 6 -  8 * 5 + (120 / 6)";
        PostfixMaker postfixMaker = new PostfixMaker(inputData);

        resultDeque = postfixMaker.makePostfix();
        System.out.println("The result is " + resultDeque);
    }
}
