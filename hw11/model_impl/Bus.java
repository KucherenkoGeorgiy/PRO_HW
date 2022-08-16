package com.hillel.kucherenko.hw11.model_impl;


import com.hillel.kucherenko.hw11.model.Transport;

public class Bus extends Transport {
    private int quantityOfPassengers;

    public Bus(int yearOfProduceOfTransport, String brandOfTransport, String modelOfTransport, int price, double fuelConsumption, int maxSpeed, int quantityOfPassengers) {
        super(yearOfProduceOfTransport, brandOfTransport, modelOfTransport, price, fuelConsumption, maxSpeed);
        this.quantityOfPassengers = quantityOfPassengers;
        super.typeOfTransport = "bus";
    }

    public int getQuantityOfPassengers() {
        return quantityOfPassengers;
    }

    public void setQuantityOfPassengers(int quantityOfPassengers) {
        this.quantityOfPassengers = quantityOfPassengers;
    }

    @Override
    public String toString() {
        return "Type of Transport: \'BUS\', yearOfProduceOfTransport=" + this.getYearOfProduceOfTransport() +
                ", brandOfTransport='" + this.getBrandOfTransport() + '\'' +
                ", modelOfTransport='" + this.getModelOfTransport() + '\'' +
                ", price=" + this.getPrice() +
                ", fuelConsumption=" + this.getFuelConsumption() +
                ", maxSpeed=" + this.getMaxSpeed() + ", quantityOfPassengers=" + quantityOfPassengers;
    }
}