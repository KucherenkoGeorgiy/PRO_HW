package com.hillel.kucherenko.hw16.utils;

import com.hillel.kucherenko.hw16.model.Transport;

import java.util.Comparator;

public class ComparatorByFuelCons implements Comparator<Transport> {
    @Override
    public int compare(Transport o1, Transport o2) {
        return (int) (Math.round(o1.getFuelConsumption() * 1000) - (int) Math.round(o2.getFuelConsumption() * 1000));
    }
}
