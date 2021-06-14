package com.itwang.singlelist;

public class SingleLinkedList {

    private LNode head;
    private LNode temp;

    public SingleLinkedList() {
        head = new LNode(0,null);
    }

    //增加一个结点
    void add(int num) {
        LNode node = new LNode(num, null);
        temp = head;
        while (true) {
            if (temp.next != null) {
                temp = temp.next;
            } else {
                break;
            }
        }
        temp.next = node;
    }

    void update(LNode node,int num) {
        temp = head;
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        while (temp.next != null) {
            if (temp.next.data == node.data) {
                break;
            }
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("没有匹配的结点");
            return;
        }
        temp.next.data = num;
    }

    void delete(LNode node) {
        temp = head;
        if (temp.next == null) {
            System.out.println("链表为空");
            return;
        }
        while (temp.next != null) {
            if (temp.next.data == node.data) {
                break;
            }
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("没有匹配的结点");
            return;
        }
        temp.next = temp.next.next;
    }

    void list() {
        temp = head;
        if (temp.next == null) {
            System.out.println("链表为空");
            return;
        }
        while (temp.next != null) {
            System.out.println(temp.next);
            temp = temp.next;
        }
    }
}
