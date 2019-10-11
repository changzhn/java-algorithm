package com.changzhn.list.sample;

public class Entry {
    public static void main(String[] args) {
        MyArrayList lst = new MyArrayList();
        int[] nums = {3, 8, 1, 2, 5, 7, 6, 0};
        for(int item: nums) {
            lst.add(item);
        }
        lst.printList();
    }
}
