package com.changzhn.list.sample;

public class LinkedListSingle {
    private class Node {
        public int element;
        public Node next;

        public Node(int e) {
            element = e;
            next = null;
        }
    }

    private Node head = null;
    private int theSize = 0;

    public LinkedListSingle() {
        doClear();
    }

    public void clear() {
        doClear();
    }

    private void doClear() {
        head = null;
        theSize = 0;
    }

    public int size() {
        return theSize;
    }

    public int get(int idx) {
        if (idx < 0 || idx >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Node current = head;
        for(int i = 1; i <= idx; i++) {
            current = current.next;
        }
        return current.element;
    }

    public boolean add(int x) {
        Node node = new Node(x);
        if (head == null) {
            head = node;
            theSize++;
            return true;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
        theSize++;
        return true;
    }

    public int remove(int idx) {
        if (idx < 0 || idx >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (idx == 0) {
            return removeHead();

        } else if (idx == size() - 1) {
           return removeTail();

        } else {
            Node preNode = head;

            for(int i = 1; i < idx; i++) {
                preNode = preNode.next;
            }

            Node removeNode = preNode.next;
            preNode.next = removeNode.next;
            theSize--;
            return removeNode.element;
        }

    }

    private int removeHead() {
        Node current = head;
        head = current.next;
        theSize--;
        return current.element;
    }

    private int removeTail() {
        Node current = head;
        for (int i = 1; i < size() - 1; i++) {
            current = current.next;
        }
        Node lastNode = current.next;
        current.next = null;
        return lastNode.element;
    }

    public void printList() {
        if (head == null) {
            System.out.println("空表");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.element);
            current = current.next;
        }
    }
}
