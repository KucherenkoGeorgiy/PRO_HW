package com.hillel.kucherenko.hw8.classesauto;


public class Truck extends Transport {
    private int loadCapacity;

    public Truck(int yearOfProduceOfTransport, String brandOfTransport, String modelOfTransport, int price, double fuelConsumption, int maxSpeed, int loadCapacity) {
        super(yearOfProduceOfTransport, brandOfTransport, modelOfTransport, price, fuelConsumption, maxSpeed);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Type of Transport: 'TRUCK', yearOfProduceOfTransport=" + this.getYearOfProduceOfTransport() +
                ", brandOfTransport='" + this.getBrandOfTransport() + '\'' +
                ", modelOfTransport='" + this.getModelOfTransport() + '\'' +
                ", price=" + this.getPrice() +
                ", fuelConsumption=" + this.getFuelConsumption() +
                ", maxSpeed=" + this.getMaxSpeed() + ", loadCapacity=" + loadCapacity;

    }
}
