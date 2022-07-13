package com.hillel.kucherenko.hw4;

public class Runner {
    public static void main(String[] args) {
        Car[] cars = {new Car ("Skoda", "Fabia", "2010", "blue", "6500", "123456"),
                new Car ("Skoda", "Superb", "2010", "white", "6000", "516123"),
                new Car ("Volkswagen", "Fabia", "2020", "red", "16500", "5555666")};
        CarProcessor proc = new CarProcessor();

        proc.findAllByBrand(cars, "Skoda");
        System.out.println();
        proc.findAllByModelAndTimeOfUse(cars, "Fabia", "1");
        System.out.println();
        proc.findAllByPriceAndYearOfIssue(cars, "1000", "2010");
    }
}

class Car {
    String brand;
    String model;
    String yearOfIssue;
    String color;
    String price;
    String vinCode;

     Car (String brand, String model, String yearOfIssue, String color, String price, String vinCode){
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.price = price;
        this.vinCode = vinCode;
    }
}



class CarProcessor {
     void findAllByBrand (Car[] car, String brand){
        for (int i = 0; i < car.length; i++) {
            if (car[i].brand.equals(brand)){
                printCarDetails(car[i]);
            }
        }
    }

     void findAllByModelAndTimeOfUse(Car[] car, String model, String usageTime){
        for (int i = 0; i < car.length; i++) {
            if ((((2022 - Integer.parseInt(car[i].yearOfIssue)) > Integer.parseInt(usageTime))
                    && model.equals(car[i].model)) ){
                printCarDetails(car[i]);
            }
        }


    }

     void findAllByPriceAndYearOfIssue(Car[] car, String price, String yearOfIssue){
        for (int i = 0; i < car.length; i++) {
            if ((Integer.parseInt(car[i].price) > Integer.parseInt(price)) && car[i].yearOfIssue.equals(yearOfIssue)){
                printCarDetails(car[i]);
            }
        }
    }

     void printCarDetails (Car car){
        System.out.println(car.brand + " " + car.model + " " + car.yearOfIssue
                + " " + car.color + " " + car.price + " " + car.vinCode);
    }
}






