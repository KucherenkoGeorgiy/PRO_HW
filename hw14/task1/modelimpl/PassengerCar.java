package com.hillel.kucherenko.hw14.task1.modelimpl;

import com.hillel.kucherenko.hw14.task1.model.Transport;

public class PassengerCar extends Transport {
    private final boolean isForCourier;

    public PassengerCar(int yearOfProduceOfTransport, String brandOfTransport, String modelOfTransport, int price, double fuelConsumption, int maxSpeed, boolean isForCourier) {
        super(yearOfProduceOfTransport, brandOfTransport, modelOfTransport, price, fuelConsumption, maxSpeed);
        this.isForCourier = isForCourier;
        super.typeOfTransport = "car";
    }

    public boolean getIsForCourier() {
        return isForCourier;
    }

    @Override
    public String toString() {
        return "Type of Transport: \'PassangerCar\', yearOfProduceOfTransport=" + this.getYearOfProduceOfTransport() +
                ", brandOfTransport='" + this.getBrandOfTransport() + '\'' +
                ", modelOfTransport='" + this.getModelOfTransport() + '\'' +
                ", price=" + this.getPrice() +
                ", fuelConsumption=" + this.getFuelConsumption() +
                ", maxSpeed=" + this.getMaxSpeed() + ", isForCourier=" + isForCourier;
    }
}
