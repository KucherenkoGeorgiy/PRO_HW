package com.hillel.kucherenko.hw13.model_impl;

import com.hillel.kucherenko.hw13.model.Transport;

public class Truck extends Transport {
    private final int loadCapacity;

    public Truck(int yearOfProduceOfTransport, String brandOfTransport, String modelOfTransport, int price, double fuelConsumption, int maxSpeed, int loadCapacity) {
        super(yearOfProduceOfTransport, brandOfTransport, modelOfTransport, price, fuelConsumption, maxSpeed);
        this.loadCapacity = loadCapacity;
        super.typeOfTransport = "truck";
    }

    public int getLoadCapacity() {
        return loadCapacity;
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
