package com.hillel.kucherenko.hw9.classes;

public class MistypeException extends Exception {
    String message = "Mistype Exception!";

    public MistypeException() {
        System.out.println(message);
    }
}
