package com.hillel.kucherenko.hw12;


public class MyLinkedList<T> {
    private final Node first = new Node();

    public MyLinkedList() {
    }

    public MyLinkedList(T[] inputArray) {
        initLinkedList(inputArray);
    }

    private void initLinkedList(T[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (i == 0) {
                addElementToTheBeginningOfList(inputArray[i]);
            } else {
                addElementToTheEndOfList(inputArray[i]);
            }
        }
    }


    @Override
    public String toString() {
        Node currentElement = first.next;
        String result = "Our List:\n";
        while ((currentElement) != null) {
            result += (currentElement.value) + "\n";
            currentElement = currentElement.next;
        }
        return result;
    }

    public Node searchForLastNode() {
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
    }

    public void addElementByIndex(T value, int index) {
        if (index >= 1) {
            Node node = new Node();
            node.value = value;
            try {

                Node tempNode = searchForIndex(index - 1);
                node.next = tempNode.next;
                tempNode.next = node;

            } catch (IndexOutOfBoundsException | NullPointerException e) {
                System.out.println("Exception caught! " + e.getMessage());//+ e.getMessage()
            }

        } else if (index == 0) {
            addElementToTheBeginningOfList(value);

        } else {
            System.out.println("Wrong input! Index cannot be negative!");
        }
    }

    public Node searchForIndex(int index) throws IndexOutOfBoundsException, NullPointerException {
        int counter = 0;
        Node currentElement = first.next;
        if (currentElement.next != null) {
            while (true) {
                if (currentElement.next != null) {
                    if (counter == index) return currentElement;
                    currentElement = currentElement.next;
                    counter++;
                    if (counter == index) return currentElement;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            }
        } else {
            throw new NullPointerException("List is Empty! Cannot do it!");
        }
    }

    public void deleteFirstElement() {
        if (first.next == null) {
            System.out.println("List is empty. Cannot do it");
        } else {
            first.next = first.next.next;
        }
    }

    public void deleteLastElement() {
        searchForIndex(getLength() - 2).next = null;
    }

    public void deleteElementByIndex(int index) {
        int lengthOfList = getLength();

        if (index < 0 || index + 1 > lengthOfList) {
            throw new IndexOutOfBoundsException("Incorrect Input!");
        }

        Node node = searchForIndex(index - 1);
        node.next = node.next.next;
    }

    public void inverseElements(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int currentLength = getLength();
        if ((max > currentLength - 1) || (min < 0) || (max == min)) {
            System.out.println("Impossible operation! Check Indexes! By the way.. Length of out list is " + getLength());
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
        int length = 0;
        Node currentElement = first.next;
        if (first.next != null) {
            while ((currentElement) != null) {
                currentElement = currentElement.next;
                length++;
            }
        } else {
            return 0;
        }
        return length;
    }

    public boolean isEmptyList() {
        if (first.next == null) {
            return true;
        } else {
            return false;
        }
    }

    public class Node {
        private T value;
        private Node next;

        public T getValue() {
            return value;
        }
    }
}