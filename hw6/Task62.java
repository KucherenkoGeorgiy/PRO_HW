package com.hillel.kucherenko.hw6;

public class Task62 {

    public static void main(String[] args) {
        Triangle[] array = new Triangle[]{
                new Triangle(new Point(0, 0), new Point(5, 8.66), new Point(10, 0)),
                new Triangle(new Point(0, 0), new Point(2.5, 4.33), new Point(5, 0)),
                new Triangle(new Point(0, 0), new Point(4, 3), new Point(0, 3)),
                new Triangle(new Point(0, 0), new Point(6, 6), new Point(12, 0)),
                new Triangle(new Point(0, 0), new Point(0, 8), new Point(8, 0)),
                new Triangle(new Point(0, 0), new Point(6, 12), new Point(12, 0)),
                new Triangle(new Point(0, 0), new Point(8, 6), new Point(0, 6)),
                new Triangle(new Point(0, 0), new Point(10, 16), new Point(15, 6)),
                new Triangle(new Point(0, 0), new Point(8, 6), new Point(12, 0)),

        };

        System.out.println("\nisIsosceles\tisEquilateral\tisRectangular\tisRegular\tPerimeter\tSquare\t"
                + "sideA\tsideB\tsideC");
        for (int i = 0; i < array.length; i++) {
            printDetailsOfTriangle(array[i]);
        }
        System.out.println("==================================================================");

        findAllIsosceles(array);
        findAllEquilateral(array);
        findAllRectangular(array);
        findAllRegular(array);
    }

    static void findAllIsosceles(Triangle[] array) {
        int counter = 0;
        double minSquare = 0;
        double minPerimetr = 0;
        double maxSquare = 0;
        double maxPerimetr = 0;
        boolean hasIsoscelles = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i].isIsosceles) {
                if (counter == 0) {
                    minSquare = array[i].square;
                    maxSquare = array[i].square;
                    minPerimetr = array[i].perimetr;
                    maxPerimetr = array[i].perimetr;
                    hasIsoscelles = true;
                } else {
                    minSquare = Math.min(minSquare, array[i].square);
                    maxSquare = Math.max(maxSquare, array[i].square);
                    minPerimetr = Math.min(minPerimetr, array[i].perimetr);
                    maxPerimetr = Math.max(maxPerimetr, array[i].perimetr);
                }
                counter++;
            }
        }
        if (hasIsoscelles) {
            System.out.println(printResult("Isosceles", counter, minSquare,
                    maxSquare, minPerimetr, maxPerimetr));
        } else {
            System.out.println("There are no Isosceles in Array! + \n");
        }
    }

    static void findAllEquilateral(Triangle[] array) {
        int counter = 0;
        double minSquare = 0;
        double minPerimetr = 0;
        double maxSquare = 0;
        double maxPerimetr = 0;
        boolean hasEquilateral = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i].isEquilateral) {
                if (counter == 0) {
                    minSquare = array[i].square;
                    maxSquare = array[i].square;
                    minPerimetr = array[i].perimetr;
                    maxPerimetr = array[i].perimetr;
                    hasEquilateral = true;
                } else {
                    minSquare = Math.min(minSquare, array[i].square);
                    maxSquare = Math.max(maxSquare, array[i].square);
                    minPerimetr = Math.min(minPerimetr, array[i].perimetr);
                    maxPerimetr = Math.max(maxPerimetr, array[i].perimetr);
                }
                counter++;
            }
        }
        if (hasEquilateral) {
            System.out.println(printResult("Equilateral", counter, minSquare,
                    maxSquare, minPerimetr, maxPerimetr));
        } else {
            System.out.println("There are no Equilateral in Array! + \n");
        }
    }

    static void findAllRectangular(Triangle[] array) {
        int counter = 0;
        double minSquare = 0;
        double minPerimetr = 0;
        double maxSquare = 0;
        double maxPerimetr = 0;
        boolean hasRectangular = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i].isRectangular) {
                if (counter == 0) {
                    minSquare = array[i].square;
                    maxSquare = array[i].square;
                    minPerimetr = array[i].perimetr;
                    maxPerimetr = array[i].perimetr;
                    hasRectangular = true;
                } else {
                    minSquare = Math.min(minSquare, array[i].square);
                    maxSquare = Math.max(maxSquare, array[i].square);
                    minPerimetr = Math.min(minPerimetr, array[i].perimetr);
                    maxPerimetr = Math.max(maxPerimetr, array[i].perimetr);
                }
                counter++;
            }
        }
        if (hasRectangular) {
            System.out.println(printResult("Rectangular", counter, minSquare,
                    maxSquare, minPerimetr, maxPerimetr));
        } else {
            System.out.println("There are no Rectangular in Array! + \n");
        }
    }

    static void findAllRegular(Triangle[] array) {
        int counter = 0;
        double minSquare = 0;
        double minPerimetr = 0;
        double maxSquare = 0;
        double maxPerimetr = 0;
        boolean hasRegular = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i].isRegular) {
                if (counter == 0) {
                    minSquare = array[i].square;
                    maxSquare = array[i].square;
                    minPerimetr = array[i].perimetr;
                    maxPerimetr = array[i].perimetr;
                    hasRegular = true;
                } else {
                    minSquare = Math.min(minSquare, array[i].square);
                    maxSquare = Math.max(maxSquare, array[i].square);
                    minPerimetr = Math.min(minPerimetr, array[i].perimetr);
                    maxPerimetr = Math.max(maxPerimetr, array[i].perimetr);
                }
                counter++;
            }
        }
        if (hasRegular) {
            System.out.println(printResult("Regular", counter, minSquare,
                    maxSquare, minPerimetr, maxPerimetr));
        } else {
            System.out.println("There are no Regular in Array! + \n");
        }
    }


    static String printResult(String typeOfTriangle, int counter, double minSquare, double maxSquare,
                              double minPerimetr, double maxPerimetr) {
        return "Total amount of " + typeOfTriangle + " is " + counter + "\n"
                + "min and max Perimeters are \t" + (double) Math.round(minPerimetr * 100) / 100 + "  \t"
                + (double) Math.round(maxPerimetr * 100) / 100 + "\n" + "min and max Squares are \t"
                + (double) Math.round(minSquare * 100) / 100 + " \t" + (double) Math.round(maxSquare * 100) / 100 + "\n";
    }

    static void printDetailsOfTriangle(Triangle triangle) {
        System.out.println(triangle.isIsosceles + "\t\t" + triangle.isEquilateral + "\t\t\t"
                + triangle.isRectangular + "\t\t\t" + triangle.isRegular + "\t\t"
                + Math.round(triangle.perimetr) + "\t\t\t" + Math.round(triangle.square) + "\t\t"
                + Math.round(triangle.sideA) + "\t\t" + Math.round(triangle.sideB) + "\t\t"
                + Math.round(triangle.sideC));
    }
}

