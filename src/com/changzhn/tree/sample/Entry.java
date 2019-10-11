package com.changzhn.tree.sample;

public class Entry {
    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();

        int[] nums = {3, 8, 1, 2, 5, 7, 6, 0};

        for (int i: nums) {
            bt.insert(i);
        }


//        System.out.println(bt.contains(77));
//        System.out.println(bt.findMax());
//        System.out.println(bt.findMin());
        bt.printTree();
    }
}
