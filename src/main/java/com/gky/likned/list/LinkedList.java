package com.gky.likned.list;

//链表方法
class Ways
{
    public Node Initlink(Node node) { // 初始化节点
        node=new Node();
        node.next=null;
        return node;
    }
    public Node insertHead(Node node) { // 头插法创建链表
        for (int i = 0; i < 10; i++) {
            Node pNode=new Node(i);
            pNode.next=node.next;
            node.next=pNode;
        }
        return node;
    }

    /*public Node insertTail(Node node) { // 尾插法创建链表
        Node s, r=node;
        for (int i = 0; i < 10; i++) {

            *//*
             * 遍历链表到最后一个结点
             *//*
            while(r != null){
                Node pNode=new Node(i);
                s = pNode;
                r=s.next;
                r=s;
                r.next = null;
            }
        }
        return node;
    }*/

    public void Printlink(Node L) {   // 打印输出链表
        Node node=L.next;
        while(node!=null) {
            System.out.print("data = " + "[" + node.data + "] ");
            node=node.next;
        }
    }
}
public class LinkedList {
    public static void main(String[] args) {
        Ways ways=new Ways();
        Node L=new Node();
        L=ways.Initlink(L);
        System.out.println("---头插法创建链表为：");
        L=ways.insertHead(L);
//        System.out.println("---尾插法创建链表为：");
//        L=ways.insertTail(L);
        ways.Printlink(L);
    }
}
