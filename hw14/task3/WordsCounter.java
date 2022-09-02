package com.hillel.kucherenko.hw14.task3;

import com.hillel.kucherenko.hw14.task3.ioutprocessor.IOutProcessor;
import com.hillel.kucherenko.hw14.task3.wordsanalyzer.WordsAnalyzer;

import java.util.HashMap;

public class WordsCounter {

    public static void main(String[] args) {
        IOutProcessor iOutProcessor = new IOutProcessor("someFile23.txt");
        String inputText = iOutProcessor.loadFromFile();
        WordsAnalyzer wordsAnalyzer = new WordsAnalyzer(inputText);
        HashMap<String, Integer> resultList = wordsAnalyzer.getMapFromText();
    }
}
