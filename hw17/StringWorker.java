package com.hillel.kucherenko.hw17;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringWorker {
    private String usersInputString;
    private static final Pattern PATTERN_SEPARATOR = Pattern.compile("[\n ,.!?\\u2014-]");
    private static final Pattern PATTERN_PUNCTUATION_MARKS = Pattern.compile("[,.!?\\u2014-]");
    private static final Pattern WORDS_PATTERN = Pattern.compile("[A-Za-z]+");

    public StringWorker(String usersInputString) {
        this.usersInputString = usersInputString;
    }

    public HashMap<String, Integer> getRepeatsOfWords() {
        HashMap<String, Integer> repeatedWords = new HashMap<>();
        String[] arrayOfWords = PATTERN_SEPARATOR.split(this.usersInputString);

        for (int i = 0; i < arrayOfWords.length; i++) {
            if (repeatedWords.containsKey(arrayOfWords[i].toUpperCase())) {
                repeatedWords.put(arrayOfWords[i].toUpperCase(),
                        repeatedWords.get(arrayOfWords[i].toUpperCase()) + 1);
            } else {
                repeatedWords.put(arrayOfWords[i].toUpperCase(), 1);
            }
        }
        repeatedWords.remove("");
        return repeatedWords;
    }

    public void printRepeatsOfWords(HashMap<String, Integer> repeatedWords) {
        repeatedWords.entrySet().forEach(System.out::println);
    }

    public void changeKSymbolInAllWords(int k, char newSymbol) {
        Matcher wordsMatcher = WORDS_PATTERN.matcher(this.usersInputString);
        StringBuilder stringBuilder = new StringBuilder(usersInputString);

        while (wordsMatcher.find()) {
            if (wordsMatcher.end() - wordsMatcher.start() >= k) {
                stringBuilder.deleteCharAt(wordsMatcher.start() + k - 1);
                stringBuilder.insert(wordsMatcher.start() + k - 1, newSymbol);
            }
        }
        this.usersInputString = stringBuilder.toString();
    }

    public void printWordsWithEqualFirstAndLastSymbol() {
        String[] arrayOfWords = PATTERN_SEPARATOR.split(this.usersInputString);

        Arrays.stream(arrayOfWords)
                .filter((s) -> s.length() > 1)
                .filter((s) -> s.toUpperCase().charAt(0) == s.toUpperCase().charAt(s.length() - 1))
                .distinct().forEach(System.out::println);
    }

    public int countPunctuationMarks() {
        Matcher mat = PATTERN_PUNCTUATION_MARKS.matcher(usersInputString);
        return (int) mat.results().count();
    }

    public String getUsersInputString() {
        return usersInputString;
    }
}
