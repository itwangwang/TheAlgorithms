package com.itwang.singlelist;

public class LinkedListTest {
    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();
        for (int i=1; i<=5; i++) {
            linkedList.add(i);
        }
        System.out.println(linkedList);
        linkedList.list();
        linkedList.delete(new LNode(3,null));
        System.out.println("删除后的");
        linkedList.list();
        linkedList.update(new LNode(5,null),6);
        System.out.println("变更后的");
        linkedList.list();
    }
}
