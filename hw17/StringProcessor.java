package com.hillel.kucherenko.hw17;


public class StringProcessor {
    static final String TEXT_SEPARATOR = "================================";
    static final String SOURCE_STRING = """
            Comments should be used to give overviews of code 
            and provide additional information that is not readily 
            available in the code itself. Comments should contain only 
            information that is relevant to reading and understanding 
            the program. For example, information about how the 
            corresponding package is built or in what directory it 
            resides should not be included as a comment""";

    public static void main(String[] args) {
        StringWorker stringWorker = new StringWorker(SOURCE_STRING);

        System.out.println(TEXT_SEPARATOR);
        System.out.println("now checking how many times each word is repeated in the text:");
        stringWorker.printRepeatsOfWords(stringWorker.getRepeatsOfWords());

        System.out.println(TEXT_SEPARATOR + "\n" + "Now changing symbol in words:");
        stringWorker.changeKSymbolInAllWords(5, '#');
        System.out.println(stringWorker.getUsersInputString());

        System.out.println(TEXT_SEPARATOR);
        System.out.println("Now searching for words with equal first and last symbol");
        stringWorker.printWordsWithEqualFirstAndLastSymbol();

        System.out.println(TEXT_SEPARATOR);
        System.out.println("Quantity of punctuations marks is: " + stringWorker.countPunctuationMarks());
    }
}
