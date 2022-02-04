package net.derpz.random_code.leetcode_stuff.custom_impl;

public class CustomListNodeImpl {
    private int val;
    private CustomListNodeImpl next;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public CustomListNodeImpl getNext() {
        return next;
    }

    public void setNext(CustomListNodeImpl next) {
        this.next = next;
    }

    public CustomListNodeImpl(int val) {
        this.setVal(val);
        this.setNext(null);
    }
}
