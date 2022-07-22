package com.hillel.kucherenko.hw7.task1;

public class CarProcessor {
    Car[] cars;

    CarProcessor(Car[] cars) {
        this.cars = cars;
    }

    CarProcessor() {
        this.cars = new Car[]{};
    }

    void findAllByBrand(Car[] car, String brand) {
        for (int i = 0; i < car.length; i++) {
            if (car[i].brand.equals(brand)) {
                printCarDetails(car[i]);
            }
        }
    }

    void findAllByBrand(String brand) {
        if (cars.length != 0) {
            for (int i = 0; i < cars.length; i++) {
                if (cars[i].brand.equals(brand)) {
                    printCarDetails(cars[i]);
                }
            }
        } else {
            System.out.println("Array is empty!");
        }
    }

    void findAllByModelAndTimeOfUse(Car[] car, String model, String usageTime) {
        for (int i = 0; i < car.length; i++) {
            if (((2022 - Integer.parseInt(car[i].yearOfIssue)) > Integer.parseInt(usageTime))
                    && model.equals(car[i].model)) {
                printCarDetails(car[i]);
            }
        }
    }

    void findAllByModelAndTimeOfUse(String model, String usageTime) {
        if (cars.length != 0) {
            for (int i = 0; i < cars.length; i++) {
                if (((2022 - Integer.parseInt(cars[i].yearOfIssue)) > Integer.parseInt(usageTime))
                        && model.equals(cars[i].model)) {
                    printCarDetails(cars[i]);
                }
            }
        } else {
            System.out.println("Array is empty!");
        }
    }

    void findAllByPriceAndYearOfIssue(Car[] car, String price, String yearOfIssue) {
        for (int i = 0; i < car.length; i++) {
            if ((Integer.parseInt(car[i].price) > Integer.parseInt(price)) && car[i].yearOfIssue.equals(yearOfIssue)) {
                printCarDetails(car[i]);
            }
        }
    }

    void findAllByPriceAndYearOfIssue(String price, String yearOfIssue) {
        if (cars.length != 0) {
            for (int i = 0; i < cars.length; i++) {
                if ((Integer.parseInt(cars[i].price) > Integer.parseInt(price)) && cars[i].yearOfIssue.equals(yearOfIssue)) {
                    printCarDetails(cars[i]);
                }
            }
        } else {
            System.out.println("Array is empty!");
        }
    }


    void printCarDetails(Car car) {
        System.out.println(car.brand + " " + car.model + " " + car.yearOfIssue
                + " " + car.color + " " + car.price + " " + car.vinCode);
    }
}
