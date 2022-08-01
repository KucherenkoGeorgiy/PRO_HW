package com.hillel.kucherenko.hw9;

import com.hillel.kucherenko.hw9.classes.Bouquet;

import java.util.Scanner;

import static com.hillel.kucherenko.hw9.menu.MenuMain.mainMenu;

public class BouquetProcessor {
    private static int currentItem = -1;
    private static Bouquet[] myBouquet;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu(scanner);
    }

    public static int getCurrentItem() {
        return currentItem;
    }

    public static void setCurrentItem(int currentItem) {
        BouquetProcessor.currentItem = currentItem;
    }

    public static Bouquet[] getMyBouquet() {
        return myBouquet;
    }

    public static void setMyBouquet(Bouquet[] myBouquet) {
        BouquetProcessor.myBouquet = myBouquet;
    }

    public static Scanner getScanner() {
        return scanner;
    }
}
