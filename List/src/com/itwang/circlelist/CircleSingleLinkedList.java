package com.itwang.circlelist;

import com.itwang.singlelist.LNode;

public class CircleSingleLinkedList {
    private LNode head = null;
    private LNode temp;

    //增加一个结点
    void add(int num) {
        LNode node = new LNode(num, null);
        if (head == null) {
            head = node;
            head.next = head;
        }else {
            temp = head;
            while (true) {
                if (temp.next != head) {
                    temp = temp.next;
                } else {
                    break;
                }
            }
            temp.next = node;
            node.next = head;
        }
    }

    /**
     * 约瑟夫问题：
     *  设编号为1...n的n个人围坐成一圈，约定编号为k的人从1开始报数，数到第m个人出列，他的下一位又从1开始报数
     *   依次类推，直到所有人出列为止
     */
    void josepfu(int start, int m) {
        if (head == null) {
            System.out.println("环形队列为空");
            return;
        }
        if (head.next == head) {
            System.out.println("只有一个小孩");
            System.out.println(head.data);
            return;
        }
        temp = head;
        while (temp.data != start && temp.next != head) {
            temp = temp.next;
        }
        if (temp.next == head) {
            System.out.println("未找到起始编号");
        }

        //找到起始位置，起始位置为temp指向的结点
        //找到起始位置，开始遍历
        while (temp.next != temp) {
            for (int i=0; i<m-2; i++) {
                temp = temp.next;
            }
            System.out.println("当前出圈的小孩为" + temp.next.data);
            System.out.println("删除当前出圈的小孩结点");
            temp.next = temp.next.next;
            System.out.println("更改起始位置");
            temp = temp.next;
        }
        System.out.println("出循环，只剩最后一个小孩");
        System.out.println("最后出圈的小孩为" + temp.data);
    }
}
