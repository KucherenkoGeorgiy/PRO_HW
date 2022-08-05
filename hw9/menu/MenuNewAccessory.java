package com.hillel.kucherenko.hw9.menu;

import com.hillel.kucherenko.hw9.BouquetProcessor;
import com.hillel.kucherenko.hw9.classes.Accessory;
import com.hillel.kucherenko.hw9.classes.Bouquet;
import com.hillel.kucherenko.hw9.classes.ElementsOfBouquet;
import java.util.Scanner;
import static com.hillel.kucherenko.hw9.utils.GetNumericValueForBouquet.getNumericValueForBouquet;
import static com.hillel.kucherenko.hw9.utils.IncreaseBouquet.increaseBouquet;
import static com.hillel.kucherenko.hw9.menu.MenuCreateAccessory.createAccessory;

class MenuNewAccessory {

    public static void newAccessory() {
        Scanner scanner = BouquetProcessor.getScanner();
        Bouquet[] myBouquet = BouquetProcessor.getMyBouquet();
        int currentItem = BouquetProcessor.getCurrentItem();
        String name;
        int price;
        scanner.nextLine();
        System.out.println("Please input the name of Accessory:");
        name = scanner.nextLine();
        System.out.println("Please input the price of Accessory:");
        price = getNumericValueForBouquet(scanner);
        if (myBouquet == null) {
            // если у нас ноль букетов - запустить процесс создания 1го букета
            BouquetProcessor.setMyBouquet(new Bouquet[]{new Bouquet(new ElementsOfBouquet[]{new Accessory(name, price)})});
            BouquetProcessor.setCurrentItem(0);
            createAccessory();
        } else {
            if (currentItem == -1) {
                currentItem = myBouquet.length;
                myBouquet = increaseBouquet(myBouquet);
                myBouquet[currentItem] = new Bouquet(new ElementsOfBouquet[]{new Accessory(name, price)});
                BouquetProcessor.setMyBouquet(myBouquet);
                BouquetProcessor.setCurrentItem(currentItem);
                createAccessory();
            } else {
                myBouquet[currentItem].pushNewAccessoryToElements(name, price);
                BouquetProcessor.setMyBouquet(myBouquet);
                createAccessory();
            }
        }
    }
}
