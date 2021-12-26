package com.company;

public class MySinglyLinkedList {
    Node first;
    Node last;
    int size;

    public void add(Integer obj) {
        Node node = new Node(obj);
        if (first == null) {
            first = node;
            last = node;
            size++;
            return;
        }
        last.next = node;
        last = node;
        size++;
    }

    public boolean remove(Integer obj) {
        Node current = first;
        if (first.value == obj) {
            first = current.next;
            size--;
            return true;
        } else {
            for (int i = 0; i < size - 1; i++) {
                if (i == size - 2) {
                    current.next = null;
                    last = current;
                    size--;
                    return true;
                }
                if (current.next.value == obj) {
                    current.next = current.next.next;
                    size--;
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node current = first;
        for (int i = 0; i < size; i++) {
            result.append(current.value);
            if (i < size - 1) {
                result.append(", ");
            }
            current = current.next;
        }
        result.append("]");
        return result.toString();

    }


    class Node {
        Integer value;
        Node next;

        public Node(Integer value) {
            this.value = value;
        }
    }
}
