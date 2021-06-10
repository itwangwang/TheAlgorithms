package com.itwang;

public class BTNode {
    char data;
    BTNode lChild;
    BTNode rChild;

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public BTNode getlChild() {
        return lChild;
    }

    public void setlChild(BTNode lChild) {
        this.lChild = lChild;
    }

    public BTNode getrChild() {
        return rChild;
    }

    public void setrChild(BTNode rChild) {
        this.rChild = rChild;
    }

    public void preOrder() {
        if (this != null) {
            System.out.println(this.data);
            this.lChild.preOrder();
            this.rChild.preOrder();
        }
    }
}
