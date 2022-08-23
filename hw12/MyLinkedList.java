package com.hillel.kucherenko.hw12;


import java.util.NoSuchElementException;

public class MyLinkedList<T> {
    private Node first = new Node();
    private int size;

    public MyLinkedList() {
    }

    public MyLinkedList(T[] inputArray) {
        initLinkedList(inputArray);
    }

    private void initLinkedList(T[] inputArray) {
        int lengthOfInputArray = inputArray.length;

        if (lengthOfInputArray > 0) {
            addElementToTheBeginningOfList(inputArray[0]);
            if (lengthOfInputArray > 1) {
                for (int i = 1; i < inputArray.length; i++) {
                    addElementToTheEndOfList(inputArray[i]);
                }
            }
        }
    }


    @Override
    public String toString() {
        Node currentElement = first.next;
        String result = "[";
        while ((currentElement) != null) {
            result += (currentElement.value);
            if (currentElement.next != null){
                result += ", ";
            }
            currentElement = currentElement.next;
        }
        result +="]";
        return result;
    }

    public T getValue(int index) {
        return searchForIndex(index).getValue();
    }

    private Node searchForLastNode() {
        Node currentElement = first.next;
        while (true) {
            if (currentElement.next != null) {
                currentElement = currentElement.next;
            } else {
                return currentElement;
            }
        }
    }

    public void addElementToTheEndOfList(T value) {
        Node node = new Node();

        node.value = value;

        if (this.first.next == null) {
            this.first.next = node;
        } else {
            searchForLastNode().next = node;
        }

        size++;
    }

    public void addElementToTheBeginningOfList(T value) {
        Node node = new Node();

        node.value = value;
        if (first.next != null) {
            Node tempNOde = first.next;
            first.next = node;
            node.next = tempNOde;
        } else {
            first.next = node;
        }
        size++;
    }

    public void addElementByIndex(T value, int index) {
        if (index >= 1) {
            Node node = new Node();
            node.value = value;
            Node tempNode = searchForIndex(index - 1);
            node.next = tempNode.next;
            tempNode.next = node;
            size++;
        } else if (index == 0) {
            addElementToTheBeginningOfList(value);
        }
    }

    private Node searchForIndex(int index) {
        int counter = 0;
        Node currentElement = first.next;

        if (index + 1 >= size) {
            throw new NoSuchElementException("There are no element with searched"
                    + " index: " + index + " (length of list is " + size + ")");
        } else if (index < 0) {
            throw new NoSuchElementException("Index cannot be negative! You are "
                    + "trying to reach index " + index);
        } else {
            while (true) {
                if (currentElement.next != null) {
                    if (counter == index) return currentElement;
                    currentElement = currentElement.next;
                    counter++;
                    if (counter == index) return currentElement;
                }
            }
        }
    }

    public void deleteFirstElement() {
        if (first.next == null) {
            System.out.println("List is empty. Cannot do it");
        } else {
            first.next = first.next.next;
            size--;
        }
    }

    public void deleteLastElement() {
        if (size > 2) {
            searchForIndex(getLength() - 2).next = null;
        } else if (size == 2) {
            searchForIndex(0).next = null;
        }else {
            first = new Node();
        }
        size--;
    }

    public void deleteElementByIndex(int index) {
        int lengthOfList = getLength();

        if (index < 0 || index + 1 > lengthOfList) {
            throw new NoSuchElementException("Exception caught! You are trying to delete"
                    + " element with index " + index + " but the size of list is " + size);
        }

        Node node = searchForIndex(index - 1);
        node.next = node.next.next;
        size--;
    }

    public void inverseElements(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int currentLength = getLength();
        if ((max > currentLength - 1) || (min < 0) || (max == min)) {
            throw new NoSuchElementException("Wrong input. Size of list is " + size);
        } else {
            Node tempMin = searchForIndex(min);
            Node tempMax = searchForIndex(max);

            if (max == currentLength - 1) {
                deleteLastElement();
            } else {
                deleteElementByIndex(max);
            }

            if (min == 0) {
                deleteFirstElement();
            } else {
                deleteElementByIndex(min);
            }

            if (min == 0) {
                addElementToTheBeginningOfList(tempMax.getValue());
            } else {
                addElementByIndex(tempMax.getValue(), min);
            }

            if (max + 1 == currentLength) {
                addElementToTheEndOfList(tempMin.getValue());
            } else {
                addElementByIndex(tempMin.getValue(), max);
            }
        }
    }

    public int getLength() {
        return size;
    }

    public boolean isEmptyList() {
        return size == 0;
    }

    private class Node {
        private T value;
        private Node next;

        public T getValue() {
            return value;
        }
    }
}