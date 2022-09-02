package com.hillel.kucherenko.hw14.task3.wordsanalyzer;

import java.util.HashMap;

public class WordsAnalyzer {
    private String inputText;
    private HashMap<String, Integer> wordsList = new HashMap<>();


    public WordsAnalyzer(String inputText) {
        this.inputText = inputText;
    }

    public HashMap<String, Integer> analyzeText() {
        String resultString = inputText;
        String[] tempResultArray;

        resultString = resultString.replaceAll("[^A-Za-z0-9]", " ")
                .replaceAll("[\\s]{2,}", " ");

        tempResultArray = resultString.split("\s");

        for (int j = 0; j < tempResultArray.length; j++) {
            if (wordsList.get(tempResultArray[j]) == null) {
                wordsList.put(tempResultArray[j], 1);
            } else {
                wordsList.put(tempResultArray[j], wordsList.get(tempResultArray[j]) + 1);
            }
        }
        printResultWordsList();
        return wordsList;
    }

    private void printResultWordsList() {
        for (String keyOf :
                wordsList.keySet()) {
            System.out.println(keyOf + " - " + wordsList.get(keyOf));
        }
    }
}
