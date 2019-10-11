package com.changzhn.tree.sample;

public class BinarySearchTree {
    private BinaryNode root;

    private static class BinaryNode {
        int element;
        BinaryNode left;
        BinaryNode right;

        BinaryNode(int e) {
            this(e, null, null);
        }

        BinaryNode(int e, BinaryNode lt, BinaryNode rt) {
            element = e;
            left = lt;
            right = rt;
        }
    }

    public BinarySearchTree() {
        root = null;
    }

    public void makeEmpty() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int x) {
        root = insert(x, root);
    }

    /**
     * 递归版本的插入
     * @param x 要插入的值
     * @param t 临时节点
     * @return root节点
     */
    private BinaryNode insert(int x, BinaryNode t) {
        if (t == null) {
            return new BinaryNode(x);
        }

        if (x < t.element) {
            t.left = insert(x, t.left);
        } else if (x > t.element) {
            t.right = insert(x, t.right);
        }

        return t;
    }

    public boolean contains(int x) {
        return contains(x, root);
    }

    private boolean contains(int x, BinaryNode node) {
        if (node == null) {
            return false;
        }
        if (x == node.element) {
            return true;
        }

        if (x > node.element) {
            return contains(x, node.right);
        } else {
            return contains(x, node.left);
        }
    }

    public int findMax() {
        if (isEmpty()) {
            throw new Error("树为空");
        }

        BinaryNode current = root;

        while (current.right != null) {
            current = current.right;
        }

        return current.element;
    }

    public int findMin() {
        if (isEmpty()) {
            throw new Error("树为空");
        }

        BinaryNode current = root;

        while (current.left != null) {
            current = current.left;
        }

        return current.element;
    }

    public void printTree() {
        if (isEmpty()) {
            System.out.println("empty tree");
            return;
        }
        printTree(root);
    }

    private void printTree(BinaryNode node) {
        if (node != null) {
            printTree(node.left);
            System.out.println(node.element);
            printTree(node.right);
        }
    }
}
