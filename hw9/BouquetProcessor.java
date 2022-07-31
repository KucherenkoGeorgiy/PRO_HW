package com.hillel.kucherenko.hw9;

import java.util.Scanner;

public class BouquetProcessor {
    static int currentItem = -1;
    boolean isInProcess;
    static Bouquet[] myBouquet;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu(){
        int result;
        String mainScreen;
        currentItem = -1;
        mainScreen = "Please choose an option:\n" +
                "1. Create Bouquet\n" +
                "2. Bouquet operations\n" +
                "3. Print current Bouquets\n" +
                "0. Exit\n";
        System.out.println(mainScreen);
        while (true){
            if (scanner.hasNextInt()){
                result = scanner.nextInt();
                if (result == 0) {
                    System.exit(0);
                } else if (result ==1) {
                    createBouquet();
                } else if (result ==2) {
                    bouquetOperations();
                } else if (result == 3) {
                    printCurrentBouquets();
                } else {
                    System.out.println("You must choose from 0 to 3");
                }
            } else {
                System.out.println("You must choose from 0 to 3");
                scanner.next();
            }
        }

}

    private static void bouquetOperations() {
        System.out.println("hello, you are in bouquetOperations!");
        mainMenu();

    }

    private static void createAccessory() {
        int result;
        String mainScreen;
        mainScreen = "Please choose an option:\n" +
                "1. New Accessory\n" +
                "0. Back\n";
        System.out.println(mainScreen);
        while (true){
            if (scanner.hasNextInt()){
                result = scanner.nextInt();
                if (result == 0) {
                    createBouquet();
                } else if (result ==1) {
                    newAccessory();
                } else {
                    System.out.println("You must choose from 0 to 1");
                }
            } else {
                System.out.println("You must choose from 0 to 1");
                scanner.nextLine();
            }
        }

    }

    private static void newAccessory() {
        String name;
        int price;
        scanner.nextLine();
        System.out.println("Please input the name of Accessory:");
        name = scanner.nextLine();
        System.out.println("Please input the price of Accessory:");
        while (true){
            if (scanner.hasNextInt()){
                price = scanner.nextInt();
                break;
            } else {
                System.out.println("You must put NUMERIC int value");
                scanner.nextLine();
            }
        }
        if (myBouquet == null){
            // если у нас ноль букетов - запустить процесс создания 1го букета
            myBouquet = new Bouquet[]{new Bouquet(new ElementsOfBouquet[]{new Accessory(name, price)})};
            currentItem = 0;
            System.out.println("Details of 1st bouquet:");
            System.out.println(myBouquet[currentItem].toString());
            createAccessory();
        } else {

                if (currentItem == - 1) {
                    currentItem = myBouquet.length;
                    myBouquet=increaseBouquet(myBouquet);
                    myBouquet[currentItem] = new Bouquet(new ElementsOfBouquet[]{new Accessory(name, price)});
createAccessory();
                } else {

                    myBouquet[currentItem].pushNewAccessoryToElements(name, price);
                    System.out.println(myBouquet[currentItem].toString());
                    createAccessory();
                }

        }


    }


    private static void createFlower() {
        int result;
        String mainScreen;
        mainScreen = "Please choose an option:\n" +
                "1. New Flower\n" +
                "0. Back\n";
        System.out.println(mainScreen);
        while (true){
            if (scanner.hasNextInt()){
                result = scanner.nextInt();
                if (result == 0) {
                    createBouquet();
                } else if (result ==1) {
                    newFlower();
                } else {
                    System.out.println("You must choose from 0 to 1");
                }
            } else {
                System.out.println("You must choose from 0 to 1");
                scanner.nextLine();
            }
        }


    }

    private static void newFlower() {
        System.out.println("hello, you are in newFlower!");
        String name;
        int price;
        int shelfLife;
        int stemLength;
scanner.nextLine();
        System.out.println("Please input the name of Flower:");

        name = scanner.nextLine();
//        scanner.nextLine();
        System.out.println("Please input the price of Flower:");
        while (true){
            if (scanner.hasNextInt()){
                price = scanner.nextInt();
                break;
            } else {
                System.out.println("You must put NUMERIC int value");
                scanner.nextLine();

            }
        }
        System.out.println("Please input ShelfLife of Flower:");
        scanner.nextLine();
        while (true){
            if (scanner.hasNextInt()){
                shelfLife = scanner.nextInt();
                break;
            } else {
                System.out.println("You must put NUMERIC int value");
                scanner.nextLine();
            }
        }
        System.out.println("Please input the stemLength of Flower:");
        scanner.nextLine();
        while (true){
            if (scanner.hasNextInt()){
                stemLength = scanner.nextInt();
                break;
            } else {
                System.out.println("You must put NUMERIC int value");
                scanner.nextLine();
            }
        }




        if (myBouquet == null){
            // ПЕРЕДЕЛАТЬ ЭТОТ БЛОК!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            myBouquet = new Bouquet[]{new Bouquet(new ElementsOfBouquet[]{new Flower(name, price, shelfLife, stemLength)})};
            currentItem = 0;
            System.out.println("Details of 1st bouquet:");
            System.out.println(myBouquet[currentItem].toString());
            createFlower();
        } else {
            if (currentItem == - 1){
                currentItem = myBouquet.length;
                myBouquet = increaseBouquet(myBouquet);
//                increaseBouquet(myBouquet);
                myBouquet[currentItem] = new Bouquet(new ElementsOfBouquet[]{new Flower(name, price, shelfLife, stemLength)});
createFlower();
            } else {

            myBouquet[currentItem].pushNewAccessoryToElements(name, price, shelfLife, stemLength);
            System.out.println(myBouquet[currentItem].toString());
            createFlower();
            }
        }




    }

    private static void createBouquet() {
        int result;
        String mainScreen;
        mainScreen = "Please choose an option:\n" +
                "1. Create Flower\n" +
                "2. Create Accessory\n" +
                "0. Main menu\n";
        System.out.println(mainScreen);
        while (true){
            if (scanner.hasNextInt()){
                result = scanner.nextInt();
                if (result == 0) {
                    mainMenu();
                } else if (result ==1) {
                    createFlower();
                } else if (result ==2) {
                    createAccessory();
                } else {
                    System.out.println("You must choose from 0 to 2");
                }
            } else {
                System.out.println("You must choose from 0 to 2");
                scanner.next();
            }
        }

    }

    private static void printCurrentBouquets() {
        System.out.print("Totally you have made ");
        System.out.println(myBouquet.length + " bouquets!!");
//        for (Bouquet bouquet:
//             myBouquet) {
//            System.out.println(bouquet.toString());
//        }

        for (int i = 0; i < myBouquet.length; i++) {
            System.out.println("Number of Bouquet: " + i);
            System.out.println(myBouquet[i].toString());
        }
//        System.out.println(myBouquet[0].toString());
        mainMenu();

    }
public static Bouquet[] increaseBouquet(Bouquet[] myBouquet){
      Bouquet[] tempBouquet = new Bouquet[myBouquet.length +1];
    for (int i = 0; i < myBouquet.length; i++) {
        tempBouquet[i] = myBouquet[i];
    }
    myBouquet = tempBouquet;
    return myBouquet;
}
}
