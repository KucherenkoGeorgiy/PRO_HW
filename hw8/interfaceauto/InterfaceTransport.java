package com.hillel.kucherenko.hw8.interfaceauto;

public interface InterfaceTransport {

    public int getYearOfProduceOfTransport();

    public void setYearOfProduceOfTransport(int yearOfProduceOfTransport);

    public String getBrandOfTransport();

    public void setBrandOfTransport(String brandOfTransport);

    public String getModelOfTransport();

    public void setModelOfTransport(String modelOfTransport);

    public int getPrice();

    public void setPrice(int price);

    public double getFuelConsumption();

    public void setFuelConsumption(double fuelConsumption);

    public int getMaxSpeed();

    public void setMaxSpeed(int maxSpeed);

    public String toString();

}
