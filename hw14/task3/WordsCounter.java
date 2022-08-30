package com.hillel.kucherenko.hw14.task3;

import com.hillel.kucherenko.hw14.task3.ioutprocessor.IOutProcessor;
import com.hillel.kucherenko.hw11.model.Transport;

import java.util.HashMap;

public class WordsCounter {

    public static void main(String[] args) {
        IOutProcessor iOutProcessor = new IOutProcessor("someFile22.txt");
        HashMap<String, Integer> wordsList = iOutProcessor.loadFromFile();
        System.out.println(wordsList);
    }


}
