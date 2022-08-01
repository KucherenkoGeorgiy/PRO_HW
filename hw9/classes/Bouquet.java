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

    public Bouquet searchByStemLength(int min, int max){
        Bouquet resultOfSearch = null;
        for (int i = 0; i < myBouquets.length; i++) {
            if (myBouquets[i] instanceof Flower){
                if (((Flower) myBouquets[i]).getStemLength() > min &&
                ((Flower) myBouquets[i]).getStemLength() <max){
                    if (resultOfSearch == null){
                        resultOfSearch = new Bouquet(new ElementsOfBouquet[]{myBouquets[i]});
                    } else {
                        resultOfSearch.pushNewAccessoryToElements(myBouquets[i].getName(),
                                myBouquets[i].getPrice(), ((Flower) myBouquets[i]).getShelfLife(),
                                ((Flower) myBouquets[i]).getStemLength());
                    }
                }
            }
        }


        return resultOfSearch;
    }

    public Bouquet sortByShelfLife(){
        ElementsOfBouquet[] mySortedBouquets = new ElementsOfBouquet[myBouquets.length];
        ElementsOfBouquet tempElementOfBouquet;
        for (int i = 0; i < myBouquets.length; i++) {
            mySortedBouquets[i] = myBouquets[i];
        }
        for (int i = 0; i < mySortedBouquets.length; i++) {
            for (int j = 0; j < mySortedBouquets.length-1-i; j++) {
                if (mySortedBouquets[j] instanceof Accessory){
                    if (mySortedBouquets[j+1] instanceof Flower){
                        tempElementOfBouquet = mySortedBouquets[j];
                        mySortedBouquets[j] = mySortedBouquets[j+1];
                        mySortedBouquets[j+1] = tempElementOfBouquet;
                    }
                } else if (mySortedBouquets[j] instanceof Flower && mySortedBouquets[j+1] instanceof Flower){
                    if (((Flower) mySortedBouquets[j]).getShelfLife() < ((Flower) mySortedBouquets[j+1]).getShelfLife()){
                        tempElementOfBouquet = mySortedBouquets[j];
                        mySortedBouquets[j] = mySortedBouquets[j+1];
                        mySortedBouquets[j+1] = tempElementOfBouquet;

                    }
                }

            }

        }


        return new Bouquet(mySortedBouquets);
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

    public int getTotalPrice(){
        int totalPrice = 0;
        for (ElementsOfBouquet elementOfBouquet:
                myBouquets) {
            totalPrice+= elementOfBouquet.getPrice();
        }
        return totalPrice;
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
