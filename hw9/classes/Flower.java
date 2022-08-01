package com.hillel.kucherenko.hw9.classes;

public class Flower extends ElementsOfBouquet{
    private int shelfLife;
    private int stemLength;

    public Flower(String name, int price, int shelfLife, int stemLength) {
        super(name, price);
        this.shelfLife = shelfLife;
        this.stemLength = stemLength;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + this.getName() + '\'' +
                ", price=" + this.getPrice() +
                ", shelfLife=" + shelfLife +
                ", stemLength=" + stemLength +
                '}';
    }
}
