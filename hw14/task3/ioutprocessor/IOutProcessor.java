package com.hillel.kucherenko.hw14.task3.ioutprocessor;

import com.hillel.kucherenko.hw11.Taxipark_impl.Park;
import com.hillel.kucherenko.hw11.model.Transport;
import com.hillel.kucherenko.hw11.model_impl.Bus;
import com.hillel.kucherenko.hw11.model_impl.PassengerCar;
import com.hillel.kucherenko.hw11.model_impl.Truck;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

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

    public HashMap<String, Integer> loadFromFile() {
        String resultString = "";
        String[] tempResultArray;
        String[] tempResultSubArray;
        HashMap<String, Integer> wordsList = new HashMap<>();
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
        System.out.println(resultString);
        resultString = resultString.replaceAll("[^A-Za-z]", " ");
//        tempResultArray = resultString.split(";\n");
        System.out.println(resultString);
        resultString = resultString.replaceAll("[\\s]{2,}", " ");

                tempResultArray = resultString.split("\s");
//        tempResultArray = resultString.split(";\n");
        System.out.println(Arrays.toString(tempResultArray));
        for (int j = 0; j < tempResultArray.length; j++) {
            if (wordsList.get(tempResultArray[j]) == null) {
                wordsList.put(tempResultArray[j], 1);
//                System.out.println("added " + tempResultArray[j]);
            } else {
                wordsList.put(tempResultArray[j], wordsList.get(tempResultArray[j]) + 1 );
            }
        }
        System.out.println("below is the final list!!");
//        System.out.println(wordsList.toString());
        /*
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
        */

        return wordsList;
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
