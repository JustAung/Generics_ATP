package main;

import linkedlist.GenericLinkedList;
import linkedlist.GenericNode;

public class TestLinkedList {

    public static void main(String[] args) {
        GenericLinkedList<Integer> intList = new GenericLinkedList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        GenericLinkedList<Double> doubleList = new GenericLinkedList<Double>();
        doubleList.add(1.0);
        doubleList.add(2.0);
        doubleList.add(3.0);

        GenericLinkedList<String> stringList = new GenericLinkedList<String>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");

        // Print the integer list
        System.out.print("Integer list: ");
        GenericNode<Integer> intCurrent = intList.getHead();
        while (intCurrent != null) {
            System.out.print(intCurrent.getData() + " ");
            intCurrent = intCurrent.getNextNode();
        }
        System.out.println();

        // Print the double list
        System.out.print("Double list: ");
        GenericNode<Double> doubleCurrent = doubleList.getHead();
        while (doubleCurrent != null) {
            System.out.print(doubleCurrent.getData() + " ");
            doubleCurrent = doubleCurrent.getNextNode();
        }
        System.out.println();

        // Print the string list
        System.out.print("String list: ");
        GenericNode<String> stringCurrent = stringList.getHead();
        while (stringCurrent != null) {
            System.out.print(stringCurrent.getData() + " ");
            stringCurrent = stringCurrent.getNextNode();
        }
        System.out.println();
    }
}
