package com.hillel.kucherenko.hw12;


import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) throws Exception {
        Integer[] someArray = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        MyLinkedList<Integer> arrayListNew = new MyLinkedList<>(someArray);
        System.out.println(arrayListNew);

        MyLinkedList<String> stringsLinkedList = new MyLinkedList<>();
        stringsLinkedList.addElementToTheEndOfList("0");
        stringsLinkedList.addElementToTheEndOfList("1");
        stringsLinkedList.addElementToTheEndOfList("2");
        System.out.println(stringsLinkedList);

        stringsLinkedList.getValue(1);
        stringsLinkedList.addElementToTheBeginningOfList("21");
        System.out.println(stringsLinkedList.getValue(0));

        ArrayList<Integer> myNewList = new ArrayList<>();

        myNewList.add(1);
        myNewList.add(2);
        myNewList.add(3);
        myNewList.add(4);
        myNewList.add(5);
        System.out.println("My new List:");
        System.out.println(myNewList);
    }
}



