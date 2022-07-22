package com.hillel.kucherenko.hw7.task1;

public class Runner {
    public static void main(String[] args) {
        Car[] cars = {new Car("Skoda", "Fabia", "2010", "blue", "6500", "123456"),
                new Car("Skoda", "Superb", "2010", "white", "6000", "516123"),
                new Car("Volkswagen", "Fabia", "2020", "red", "16500", "5555666")};

        CarProcessor proc = new CarProcessor();
        proc.findAllByBrand(cars, "Skoda");
        System.out.println();
        proc.findAllByModelAndTimeOfUse(cars, "Fabia", "1");
        System.out.println();
        proc.findAllByPriceAndYearOfIssue(cars, "1000", "2010");
        System.out.println();

        CarProcessor procWithoutArray = new CarProcessor();
        procWithoutArray.findAllByBrand("Skoda");
        System.out.println();
        procWithoutArray.findAllByModelAndTimeOfUse("Fabia", "1");
        System.out.println();
        procWithoutArray.findAllByPriceAndYearOfIssue("1000", "2010");
        System.out.println();

        CarProcessor procWithArray = new CarProcessor(cars);
        procWithArray.findAllByBrand("Skoda");
        System.out.println();
        procWithArray.findAllByModelAndTimeOfUse("Fabia", "1");
        System.out.println();
        procWithArray.findAllByPriceAndYearOfIssue("1000", "2010");
        System.out.println();
    }
}









