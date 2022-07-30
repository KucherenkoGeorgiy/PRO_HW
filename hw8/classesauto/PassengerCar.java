package com.hillel.kucherenko.hw8.classesauto;


public class PassengerCar extends Transport {
    private boolean isForCourier;

    public PassengerCar(int yearOfProduceOfTransport, String brandOfTransport, String modelOfTransport, int price, double fuelConsumption, int maxSpeed, boolean isForCourier) {
        super(yearOfProduceOfTransport, brandOfTransport, modelOfTransport, price, fuelConsumption, maxSpeed);
        this.isForCourier = isForCourier;
    }

    public boolean isForCourier() {
        return isForCourier;
    }

    public void setForCourier(boolean forCourier) {
        isForCourier = forCourier;
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
