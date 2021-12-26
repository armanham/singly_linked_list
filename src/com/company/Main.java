package com.company;

public class Main {

    public static void main(String[] args) {
        MySinglyLinkedList myArrayList = new MySinglyLinkedList();
        myArrayList.add(10);
        myArrayList.add(2);
        myArrayList.add(4);
        myArrayList.add(34);
        myArrayList.add(76);
        myArrayList.remove(4);
        System.out.println(myArrayList.toString());
    }
}
