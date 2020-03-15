package com.gky.likned.list;

public class Node{ // 链表节点
    Node next;

    int data;

    public Node() {
    }

    public Node(int data) {  // 构造器来赋值
        this.data=data;
        this.next=null;
    }
}
