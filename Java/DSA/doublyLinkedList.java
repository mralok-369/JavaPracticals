package com.company.DSA;

import java.util.NoSuchElementException;

public class doublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;
    // create a DLL
    private class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;
        // constructor of ListNode
        public ListNode(int data){
            this.data = data;
        }
    }
    // constructor of DLL
    public doublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    public boolean isEmpty(){
        return  length == 0; // head == null
    }
    public int length(){
        return length;
    }

    // insert node at the beg of the DLL
    public void insertBeg(int value){
        ListNode newNode = new ListNode(value);
        if (isEmpty()){
            tail = newNode;
        } else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    // insert node in the last of DLL
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if (isEmpty()){
            head = newNode;
        }
        else {
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
        length++;
    }

    // print the DLL
    public void displayForward(){
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("null\n");
    }
    public void displayBackward(){
        if (tail == null){
            return;
        }
        ListNode temp = tail;
        while (temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.previous;
        }
        System.out.print("null\n");
    }

    // delete first node in a DLL
    public ListNode deleteFirst(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if (head == tail){
            tail = null;
        } else {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        return temp;
    }

    // delete last node in a DLL
    public ListNode deleteLast(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if (head == tail){
            head = null;
        } else {
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        return temp;
    }

    public static void main(String[] args) {
        doublyLinkedList dll = new doublyLinkedList();
        dll.insertLast(6);
        dll.insertLast(10);
        dll.insertLast(15);
        dll.insertLast(25);
//        dll.insertBeg(2);

        dll.displayForward();
//        dll.displayBackward();

//        dll.deleteFirst();
//        dll.displayForward();

        dll.deleteLast();
        dll.displayForward();
    }
}
