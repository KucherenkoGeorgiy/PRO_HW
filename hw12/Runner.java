package com.hillel.kucherenko.hw12;


public class Runner {

    public static void main(String[] args) throws Exception {
        Integer[] someArray = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7};
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
    }
}



