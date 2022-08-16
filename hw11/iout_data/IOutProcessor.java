package com.hillel.kucherenko.hw11.iout_data;

import com.hillel.kucherenko.hw11.Taxipark_impl.Park;
import com.hillel.kucherenko.hw11.model.Transport;
import com.hillel.kucherenko.hw11.model_impl.Bus;
import com.hillel.kucherenko.hw11.model_impl.PassengerCar;
import com.hillel.kucherenko.hw11.model_impl.Truck;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOutProcessor {
    private final String fileName;

    public IOutProcessor(String fileName) {
        this.fileName = fileName;
    }

    public void saveToFile(Park myPark) {
        try (FileOutputStream fout = new FileOutputStream(this.fileName)) {
            byte[] myParkInArrayOfBytes = transferMyParkToArrayOfBytes(myPark);
            fout.write(myParkInArrayOfBytes);
            System.out.println("Successfully saved to file!");
        } catch (IOException e) {
            System.out.println("I/O exception: " + e);
        }
    }

    public Transport[] loadFromFile() {
        String resultString = "";
        String[] tempResultArray;
        String[] tempResultSubArray;
        Transport[] arrayOfTransport = new Transport[]{};
        int i;
        try (FileInputStream fin = new FileInputStream(this.fileName)) {
            do {
                i = fin.read();
                if (i != -1) {
                    resultString += (char) i;
                }
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception: " + e);
        } catch (IOException e) {
            System.out.println("IO Exception occurred: " + e);
        }
        tempResultArray = resultString.split(";\n");
        for (int j = 0; j < tempResultArray.length; j++) {
            tempResultSubArray = tempResultArray[j].split(",");
            switch (tempResultSubArray[0]) {
                case "bus" -> arrayOfTransport = addTransportToArrayOfTransport(arrayOfTransport,
                        new Bus(Integer.parseInt(tempResultSubArray[1]), tempResultSubArray[2],
                                tempResultSubArray[3], Integer.parseInt(tempResultSubArray[4]),
                                Double.parseDouble(tempResultSubArray[5]),
                                Integer.parseInt(tempResultSubArray[6]),
                                Integer.parseInt(tempResultSubArray[7])));
                case "car" -> arrayOfTransport = addTransportToArrayOfTransport(arrayOfTransport,
                        new PassengerCar(Integer.parseInt(tempResultSubArray[1]),
                                tempResultSubArray[2], tempResultSubArray[3],
                                Integer.parseInt(tempResultSubArray[4]),
                                Double.parseDouble(tempResultSubArray[5]),
                                Integer.parseInt(tempResultSubArray[6]),
                                Boolean.parseBoolean(tempResultSubArray[7])));
                case "truck" -> arrayOfTransport = addTransportToArrayOfTransport(arrayOfTransport,
                        new Truck(Integer.parseInt(tempResultSubArray[1]),
                                tempResultSubArray[2], tempResultSubArray[3],
                                Integer.parseInt(tempResultSubArray[4]),
                                Double.parseDouble(tempResultSubArray[5]),
                                Integer.parseInt(tempResultSubArray[6]),
                                Integer.parseInt(tempResultSubArray[7])));
            }
        }
        return arrayOfTransport;
    }

    private byte[] transferMyParkToArrayOfBytes(Park myPark) {
        String tempStringValue = "";
        byte[] resultingArray;
        for (Transport transport :
                myPark.getMyPark()) {
            if (!tempStringValue.equals("")) {
                tempStringValue += ";\n";
            }
            tempStringValue += transport.getTypeOfTransport() + ","
                    + transport.getYearOfProduceOfTransport() + ","
                    + transport.getBrandOfTransport() + ","
                    + transport.getModelOfTransport() + ","
                    + transport.getPrice() + ","
                    + transport.getFuelConsumption() + ","
                    + transport.getMaxSpeed();
            if (transport instanceof PassengerCar) {
                tempStringValue += "," + ((PassengerCar) transport).getIsForCourier();
            } else if (transport instanceof Bus) {
                tempStringValue += "," + ((Bus) transport).getQuantityOfPassengers();
            } else if (transport instanceof Truck) {
                tempStringValue += "," + ((Truck) transport).getLoadCapacity();
            }
        }
        resultingArray = tempStringValue.getBytes();
        return resultingArray;
    }

    private Transport[] addTransportToArrayOfTransport(Transport[] arrayOfTransport, Transport transport) {
        Transport[] tempArrayOfTransport;
        if (arrayOfTransport != null) {
            tempArrayOfTransport = new Transport[arrayOfTransport.length + 1];
            for (int i = 0; i < arrayOfTransport.length; i++) {
                tempArrayOfTransport[i] = arrayOfTransport[i];
            }
            tempArrayOfTransport[tempArrayOfTransport.length - 1] = transport;
        } else {
            tempArrayOfTransport = new Transport[]{transport};
        }
        arrayOfTransport = tempArrayOfTransport;
        return arrayOfTransport;
    }
}
