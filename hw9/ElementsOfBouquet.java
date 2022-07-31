package com.hillel.kucherenko.hw9;

public abstract class ElementsOfBouquet {
    private String name;
    private int price;

    public ElementsOfBouquet(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
