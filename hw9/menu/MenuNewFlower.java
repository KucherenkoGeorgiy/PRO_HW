package com.hillel.kucherenko.hw9.menu;

import com.hillel.kucherenko.hw9.BouquetProcessor;
import com.hillel.kucherenko.hw9.classes.Bouquet;
import com.hillel.kucherenko.hw9.classes.ElementsOfBouquet;
import com.hillel.kucherenko.hw9.classes.Flower;

import java.util.Scanner;

import static com.hillel.kucherenko.hw9.utils.GetNumericValueForBouquet.getNumericValueForBouquet;
import static com.hillel.kucherenko.hw9.utils.IncreaseBouquet.increaseBouquet;
import static com.hillel.kucherenko.hw9.menu.MenuCreateFlower.createFlower;

 class MenuNewFlower {

    static void newFlower() {
        String name;
        int price;
        int shelfLife;
        int stemLength;
        Scanner scanner = BouquetProcessor.getScanner();
        scanner.nextLine();
        Bouquet[] myBouquet = BouquetProcessor.getMyBouquet();
        int currentItem = BouquetProcessor.getCurrentItem();
        System.out.println("Please input the name of Flower:");

        name = scanner.nextLine();
        System.out.println("Please input the price of Flower:");
        price = getNumericValueForBouquet(scanner);
        System.out.println("Please input ShelfLife of Flower:");
        scanner.nextLine();
        shelfLife = getNumericValueForBouquet(scanner);
        System.out.println("Please input the stemLength of Flower:");
        scanner.nextLine();
        stemLength = getNumericValueForBouquet(scanner);

        if (myBouquet == null) {
            myBouquet = new Bouquet[]{new Bouquet(new ElementsOfBouquet[]{new Flower(name, price, shelfLife, stemLength)})};
            currentItem = 0;
            BouquetProcessor.setMyBouquet(myBouquet);
            BouquetProcessor.setCurrentItem(currentItem);

            createFlower();
        } else {
            if (currentItem == -1) {
                currentItem = myBouquet.length;
                myBouquet = increaseBouquet(myBouquet);
                myBouquet[currentItem] = new Bouquet(new ElementsOfBouquet[]{new Flower(name, price, shelfLife, stemLength)});
                BouquetProcessor.setMyBouquet(myBouquet);
                BouquetProcessor.setCurrentItem(currentItem);
                createFlower();
            } else {
                myBouquet[currentItem].pushNewAccessoryToElements(name, price, shelfLife, stemLength);
                BouquetProcessor.setMyBouquet(myBouquet);
                createFlower();
            }
        }
    }

}
