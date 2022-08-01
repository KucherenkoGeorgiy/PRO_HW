package com.hillel.kucherenko.hw9.classes;

public class Accessory extends ElementsOfBouquet{

    public Accessory(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Accessory{" +
                "name='" + this.getName() + '\'' +
                ", price=" + this.getPrice() +
                "}";
    }
}
