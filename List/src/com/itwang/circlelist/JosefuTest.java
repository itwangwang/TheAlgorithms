package com.itwang.circlelist;

public class JosefuTest {
    //增加五个小孩，起始位置为编号为2的小孩，每次数3次
    public static void main(String[] args) {
        CircleSingleLinkedList linkedList = new CircleSingleLinkedList();
        for (int i=1; i<=5; i++) {
            linkedList.add(i);
        }

        linkedList.josepfu(2,2);
    }
}
