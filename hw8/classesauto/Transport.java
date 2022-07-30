package com.hillel.kucherenko.hw8.classesauto;


import com.hillel.kucherenko.hw8.interfaceauto.InterfaceTransport;

abstract class Transport implements InterfaceTransport {
    private int yearOfProduceOfTransport;
    private String brandOfTransport;
    private String modelOfTransport;
    private int price;
    private double fuelConsumption;
    private int maxSpeed;

    public Transport(int yearOfProduceOfTransport, String brandOfTransport, String modelOfTransport, int price, double fuelConsumption, int maxSpeed) {
        this.yearOfProduceOfTransport = yearOfProduceOfTransport;
        this.brandOfTransport = brandOfTransport;
        this.modelOfTransport = modelOfTransport;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    public int getYearOfProduceOfTransport() {
        return yearOfProduceOfTransport;
    }

    public void setYearOfProduceOfTransport(int yearOfProduceOfTransport) {
        this.yearOfProduceOfTransport = yearOfProduceOfTransport;
    }

    public String getBrandOfTransport() {
        return brandOfTransport;
    }

    public void setBrandOfTransport(String brandOfTransport) {
        this.brandOfTransport = brandOfTransport;
    }

    public String getModelOfTransport() {
        return modelOfTransport;
    }

    public void setModelOfTransport(String modelOfTransport) {
        this.modelOfTransport = modelOfTransport;
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

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
