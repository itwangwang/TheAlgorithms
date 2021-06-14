package com.itwang.singlelist;

public class LNode {
    public LNode(int data, LNode next) {
        this.data = data;
        this.next = next;
    }

    public int data;
    public LNode next;

    public LNode() {
    }

    @Override
    public String toString() {
        return String.valueOf(this.data);
    }
}
