package com.hillel.kucherenko.hw14.task3.ioutprocessor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOutProcessor {
    private final String fileName;

    public IOutProcessor(String fileName) {
        this.fileName = fileName;
    }

    public String loadFromFile() {
        String resultString = "";
        int i;

        try (FileInputStream fin = new FileInputStream(this.fileName)) {
            do {
                i = fin.read();
                if (i != -1) {
                    resultString += (char) i;
                }
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception: " + e);
        } catch (IOException e) {
            System.out.println("IO Exception occurred: " + e);
        }

        System.out.println(resultString);
        return resultString;
    }
}
