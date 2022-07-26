package com.hillel.kucherenko.hw6;

public class Triangle {
    final Point pointA;
    final Point pointB;
    final Point pointC;
    final double sideA;
    final double sideB;
    final double sideC;
    final double perimetr;
    final double square;
    final boolean isIsosceles;
    final boolean isEquilateral;
    final boolean isRectangular;
    final boolean isRegular;


    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        sideA = (Math.sqrt(Math.pow(pointA.x - pointB.x, 2) + Math.pow(pointA.y - pointB.y, 2)));
        sideB = (Math.sqrt(Math.pow(pointA.x - pointC.x, 2) + Math.pow(pointA.y - pointC.y, 2)));
        sideC = (Math.sqrt(Math.pow(pointB.x - pointC.x, 2) + Math.pow(pointB.y - pointC.y, 2)));
        perimetr = sideA + sideB + sideC;
        square = Math.sqrt(perimetr / 2 * (perimetr / 2 - sideA)
                * (perimetr / 2 - sideB) * (perimetr / 2 - sideC));

        isIsosceles = (sideA == sideB) || (sideB == sideC) || (sideA == sideC);

        isEquilateral = (Math.round(sideA * 1000) == Math.round(sideB * 1000))
                && (Math.round(sideA * 1000) == Math.round(sideC * 1000));

        isRectangular = Math.pow(sideA, 2) == (Math.pow(sideB, 2) + Math.pow(sideC, 2))
                || Math.pow(sideB, 2) == (Math.pow(sideA, 2) + Math.pow(sideC, 2))
                || Math.pow(sideC, 2) == (Math.pow(sideB, 2) + Math.pow(sideA, 2));

        isRegular = !isIsosceles && !isRectangular && !isEquilateral;
    }
}

