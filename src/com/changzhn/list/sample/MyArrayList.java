package com.changzhn.list.sample;

public class MyArrayList {
  private static final int DEFAULT_CAPACITY = 10;

  private int theSize; // 集合中元素实际的个数
  private int[] theItems;

  public MyArrayList() {
    doClear();
  }

  public void clear() {
    doClear();
  }

  private void doClear() {
    theSize = 0;
    ensureCapacity(DEFAULT_CAPACITY);
  }

  public int size() {
    return theSize;
  }

  public boolean isEmpty() {
    return theSize == 0;
  }

  public void trimToSize() {
    ensureCapacity(theSize);
  }

  public int get(int idx) {
    if (idx < 0 || idx >= size()) {
      throw new ArrayIndexOutOfBoundsException();
    }
    return theItems[idx];
  }

  public int set(int idx, int newVal) {
    if (idx < 0 || idx > size()) {
      throw new ArrayIndexOutOfBoundsException();
    }
    int old = theItems[idx];
    theItems[idx] = newVal;
    return old;
  }

  private void ensureCapacity(int newCapacity) {
    if (newCapacity < size()) {
      // 如果要扩展的容量不足以容纳现有元素
      return;
    }
    int[] old = theItems;
    theItems = new int[newCapacity];
    for(int i = 0; i < size(); i++) {
      theItems[i] = old[i];
    }

  }

  public boolean add(int x) {
    add(theSize, x);
    return true;
  }

  // 向末尾追回一项
  private void add(int idx, int x) {
    if (theSize >= theItems.length) {
      ensureCapacity(theSize * 2 + 1);
    }
    theItems[idx] = x;
    theSize++;
  }

  public int remove(int idx) {
    if (idx < 0 || idx > size()) {
      throw new ArrayIndexOutOfBoundsException();
    }
    int removeItem = theItems[idx];
    for(int i = idx; i < size(); i++) {
      theItems[i] = theItems[i + 1];
    }
    theSize--;
    return removeItem;
  }

  public void printList() {
    for(int i = 0; i < size(); i++) {
      System.out.println(theItems[i]);
    }
  }
}