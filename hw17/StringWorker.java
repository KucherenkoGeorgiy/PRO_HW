package com.hillel.kucherenko.hw17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringWorker {
    private String inputString;
    private HashMap<String, Integer> repeatedWords = new HashMap<>();
    private static final Pattern patternSeparator = Pattern.compile("[ ,.!?-]");
    private static final Pattern wordsPattern = Pattern.compile("[A-Za-z]+");

    public StringWorker(String inputString) {
        this.inputString = inputString;
    }

    public HashMap<String, Integer> getRepeatsOfWords(){
        String[] arrayOfWords = patternSeparator.split(this.inputString);

        for (int i = 0; i < arrayOfWords.length; i++) {
            if (repeatedWords.containsKey(arrayOfWords[i].toUpperCase())){
                repeatedWords.put(arrayOfWords[i].toUpperCase(), repeatedWords.get(arrayOfWords[i].toUpperCase()) + 1);
            } else {
                repeatedWords.put(arrayOfWords[i].toUpperCase(), 1);
            }
        }
        return repeatedWords;
    }

    public void printRepeatsOfWords() {
        if (repeatedWords.isEmpty()){
            getRepeatsOfWords();
        }
        System.out.println("below is a list of words with repeats quantity:");
        repeatedWords.entrySet().forEach(System.out::println);
    }

    public void changeKSymbolInAllWords(int k, char newSymbol){
        Matcher wordsMatcher = wordsPattern.matcher(this.inputString);
        StringBuilder newInputString= new StringBuilder(inputString);

        while (wordsMatcher.find()){
            if (wordsMatcher.end() - wordsMatcher.start() >= k){
                newInputString.deleteCharAt(wordsMatcher.start() + k-1);
                newInputString.insert(wordsMatcher.start() + k-1, newSymbol);
            }
        }
        this.inputString = newInputString.toString();
        System.out.println(newInputString);
    }

    public void printWordsWithEqualFirstAndLastSymbol(){
        String[] arrayOfWords = patternSeparator.split(this.inputString);

                Arrays.stream(arrayOfWords)
                        .filter((s) -> s.substring(0, 1).equalsIgnoreCase(s.substring(s.length() - 1)))
                        .forEach(System.out::println);
    }

    public int countPunctuationMarks(){



        return 0;
    }
}