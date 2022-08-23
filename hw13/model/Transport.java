package com.hillel.kucherenko.hw13.model;


public abstract class Transport {
    protected String typeOfTransport;
    private final int yearOfProduceOfTransport;
    private final String brandOfTransport;
    private final String modelOfTransport;
    private int price;
    private final double fuelConsumption;
    private int maxSpeed;

    public Transport(int yearOfProduceOfTransport, String brandOfTransport, String modelOfTransport, int price, double fuelConsumption, int maxSpeed) {
        this.yearOfProduceOfTransport = yearOfProduceOfTransport;
        this.brandOfTransport = brandOfTransport;
        this.modelOfTransport = modelOfTransport;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    public String getTypeOfTransport() {
        return typeOfTransport;
    }

    public int getYearOfProduceOfTransport() {
        return yearOfProduceOfTransport;
    }


    public String getBrandOfTransport() {
        return brandOfTransport;
    }


    public String getModelOfTransport() {
        return modelOfTransport;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
