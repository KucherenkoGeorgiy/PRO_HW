package com.hillel.kucherenko.hw9.classes;

public class Bouquet {
    private ElementsOfBouquet[] myBouquets;

    public Bouquet(ElementsOfBouquet[] myBouquets) {
        this.myBouquets = myBouquets;
    }

    public ElementsOfBouquet[] getMyBouquets() {
        return myBouquets;
    }

    public void setMyBouquets(ElementsOfBouquet[] myBouquets) {
        this.myBouquets = myBouquets;
    }

    public void pushNewAccessoryToElements (String name, int price){
        ElementsOfBouquet[] tempElementsOfBouquet = new ElementsOfBouquet[myBouquets.length + 1];
        for (int i = 0; i < myBouquets.length; i++) {
            tempElementsOfBouquet[i] = myBouquets[i];
        }
        tempElementsOfBouquet[myBouquets.length] = new Accessory(name, price);
        myBouquets = tempElementsOfBouquet;
    }
    public void pushNewAccessoryToElements (String name, int price, int shelfLife, int stemLength){
        ElementsOfBouquet[] tempElementsOfBouquet = new ElementsOfBouquet[myBouquets.length + 1];
        for (int i = 0; i < myBouquets.length; i++) {
            tempElementsOfBouquet[i] = myBouquets[i];
        }
        tempElementsOfBouquet[myBouquets.length] = new Flower(name, price, shelfLife, stemLength);
        myBouquets = tempElementsOfBouquet;
    }

    @Override
    public String toString() {
        String result;
        int totalPrice = 0;
        result = "";
        for (ElementsOfBouquet elementOfBouquet:
             myBouquets) {
            result += "\t" + elementOfBouquet.toString() + "\n";
            totalPrice+= elementOfBouquet.getPrice();
        }
        result+="\tTOTAL PRICE of Bouquet: " + totalPrice;
        return result;
    }
}
