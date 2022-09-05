package com.hillel.kucherenko.hw17;

public class StringProcessor {

    public static void main(String[] args) {
        String sourceString = "Implementation commentc are mean for commenting out code " +
                "or for comments about the particulap implementation. ";
        StringWorker stringWorker = new StringWorker(sourceString);

        stringWorker.printRepeatsOfWords();
        stringWorker.changeKSymbolInAllWords(5, '#');
        stringWorker.printWordsWithEqualFirstAndLastSymbol();
        stringWorker.countPunctuationMarks();

    }


}
