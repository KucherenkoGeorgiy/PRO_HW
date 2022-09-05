package com.hillel.kucherenko.hw17;

public class StringProcessor {

    public static void main(String[] args) {
        String sourceString = """
                Comments should be used to give overviews of code 
                and provide additional information that is not readily 
                available in the code itself. Comments should contain only 
                information that is relevant to reading and understanding 
                the program. For example, information about how the 
                corresponding package is built or in what directory it 
                resides should not be included as a comment""";

        StringWorker stringWorker = new StringWorker(sourceString);

        stringWorker.printRepeatsOfWords();
        stringWorker.changeKSymbolInAllWords(5, '#');
        stringWorker.printWordsWithEqualFirstAndLastSymbol();
        System.out.println("Quantity of punctuations marks is: " + stringWorker.countPunctuationMarks());
    }


}
