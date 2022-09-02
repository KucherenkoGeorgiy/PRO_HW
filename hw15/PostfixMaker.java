package com.hillel.kucherenko.hw15;

import java.util.*;

public class PostfixMaker {
    private final String inputData;
    private final Queue<String> queue = new LinkedList<>();
    private final Deque<String> deque = new LinkedList<>();
    private String[] tempResultArray;
    private static final HashMap<String, Integer> priorityData = new HashMap<>();

    static {
        priorityData.put("(", 2);
        priorityData.put(")", 2);
        priorityData.put("*", 1);
        priorityData.put("/", 1);
        priorityData.put("+", 0);
        priorityData.put("-", 0);
    }

    public PostfixMaker(String inputData) {
        this.inputData = inputData;
    }

    public Integer makePostfix() {
        getArrayFromString();
        makePostfixExpression();
        updateAllData();
        calculateExpression();
        return Integer.parseInt(deque.pop());
    }

    private void makePostfixExpression() {
        for (int i = 0; i < tempResultArray.length; i++) {
            if (tempResultArray[i].matches("\\d+")) {
                queue.add(tempResultArray[i]);
            } else if (tempResultArray[i].matches("\\*")
                    || tempResultArray[i].matches("/")
                    || tempResultArray[i].matches("-")
                    || tempResultArray[i].matches("\\+")) {
                makeChangesWithOperator(i);
            } else if (tempResultArray[i].matches("\\(")) {
                deque.push(tempResultArray[i]);
            } else if (tempResultArray[i].matches("\\)")) {
                while (!deque.getFirst().equals("(")) {
                    queue.add(deque.pop());
                }
                deque.pop();
            }
        }
        while (!deque.isEmpty()) {
            queue.add(deque.pop());
        }
    }

    private void getArrayFromString() {
        String resultString = String.copyValueOf(inputData.toCharArray());
        resultString = resultString.replace("(", " ( ")
                .replace(")", " ) ")
                .replace("+", " + ")
                .replace("-", " - ")
                .replace("*", " * ")
                .replace("/", " / ")
                .replace("  ", " ");

        tempResultArray = resultString.split("\s");
    }


    private void calculateExpression() {
        for (int i = 0; i < tempResultArray.length; i++) {
            if (tempResultArray[i].matches("\\d+")) {
                deque.push(tempResultArray[i]);
            } else if (tempResultArray[i].matches("\\*")
                    || tempResultArray[i].matches("/")
                    || tempResultArray[i].matches("-")
                    || tempResultArray[i].matches("\\+")) {
                makeOperation(i);
            }
        }
    }

    private void makeOperation(int i) {
        int amountA = Integer.parseInt(deque.pop());
        int amountB = Integer.parseInt(deque.pop());
        switch (tempResultArray[i]) {
            case "+" -> deque.push(String.valueOf(amountB + amountA));
            case "-" -> deque.push(String.valueOf(amountB - amountA));
            case "*" -> deque.push(String.valueOf(amountB * amountA));
            case "/" -> deque.push(String.valueOf(amountB / amountA));
        }
    }

    private void updateAllData() {
        tempResultArray = new String[queue.size()];
        int counter = 0;
        for (String valueOf :
                queue) {
            tempResultArray[counter] = valueOf;
            counter++;
        }
        deque.clear();
        queue.clear();
    }

    private void makeChangesWithOperator(int i) {
        if (deque.isEmpty() || deque.peek().equals("(")) {
            deque.push(tempResultArray[i]);
        } else if (priorityData.get(tempResultArray[i]) > priorityData.get(deque.getLast())) {
            deque.push(tempResultArray[i]);
        } else if (priorityData.get(tempResultArray[i]) <= priorityData.get(deque.getLast())) {
            while ((!deque.getFirst().equals("(")) || (priorityData.get(deque.getFirst()) < priorityData.get(tempResultArray[i]))) {
                if (deque.isEmpty()) break;
                queue.add(deque.pop());
                if (deque.isEmpty()) break;
            }
            deque.push(tempResultArray[i]);
        }
    }
}
