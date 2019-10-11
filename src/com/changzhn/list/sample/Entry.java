package com.changzhn.list.sample;

public class Entry {
    public static void main(String[] args) {
        testArrayList();
        testLinkedList();
    }

    public static void testArrayList() {
        MyArrayList lst = new MyArrayList();
        int[] nums = {1, 2, 3, 4, 5};
        for(int item: nums) {
            lst.add(item);
        }

        lst.add(6);
        lst.remove(0);
        lst.insert(0, 1);
        lst.printList();
    }

    public static void testLinkedList() {
        LinkedListSingle lst = new LinkedListSingle();
        int[] nums = {1, 2, 3, 4, 5};
        for(int item: nums) {
            lst.add(item);
        }
//        lst.printList();
//        System.out.println(lst.get(0));
//        System.out.println(lst.get(2));
//        System.out.println(lst.get(3));
//        System.out.println(lst.get(4));
        System.out.println(lst.remove(3));
        lst.printList();
        System.out.println(lst.size());
    }
}
