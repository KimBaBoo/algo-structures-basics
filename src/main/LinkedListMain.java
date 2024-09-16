package main;

import linkedList.MyLinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        MyLinkedList node1 = new MyLinkedList(1);
        MyLinkedList node2 = new MyLinkedList(2);
        MyLinkedList node3 = new MyLinkedList(3);

        node1.setNext(node2);
        node2.setNext(node3);

        System.out.println(node1.getData());
        System.out.println(node1.getNext().getData());
        System.out.println(node1.getNext().getNext().getData());

        System.out.println("================= printList () ==================");

        MyLinkedList list = new MyLinkedList();

        list.insertAt(0, 0);
        list.insertAt(1, 1);
        list.insertAt(2, 2);
        list.insertAt(3, 3);
        list.insertAt(4, 4);
        list.printAll();

        System.out.println("================= clear () ==================");

        list.clear();
        list.printAll();

        System.out.println("================= clear () =================");
        list.insertLast(0);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.printAll();

        System.out.println("================= deleteAt () =================");

        list.deleteAt(0);
        list.printAll();
        list.deleteAt(1);
        list.printAll();

        System.out.println("================= deleteLast () =================");

        list.insertLast(5);
        list.deleteLast();
        list.deleteLast();
        list.deleteLast();
        //list.deleteLast();  //오류동작 확인
        list.printAll();

        System.out.println("================= getNodeAt () =================");

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);

        MyLinkedList secondNode = list.getNodeAt(2);
        System.out.println(secondNode.getData());
    }

}