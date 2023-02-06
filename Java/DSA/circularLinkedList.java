package com.company.DSA;

import java.io.LineNumberReader;
import java.util.NoSuchElementException;

public class circularLinkedList {
    private ListNode last;
    private  int length;
    private class ListNode {
        private ListNode next;
        private int data;
        public ListNode(int data){
            this.data = data;
        }
    }
    public circularLinkedList(){
        last = null;
        length = 0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty() {
        return length == 0;
    }
    // method to create a linked list
    public void createCircularList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;
        last = fourth;
    }
    // traverse and print the elements of a CLL
    public void printCircularList(){
        if (last == null){
            return;
        }
        ListNode first = last.next;
        while (first != last){
            System.out.print(first.data + " ");
            first = first.next;
        }
        System.out.print(first.data + "\n");
    }
    // insert node at the start of CLL
    public void insertAtBeg(int data){
        ListNode temp = new ListNode(data);
        if (last == null){
            last = temp;
        } else {
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }
    // insert node at the end of CLL
    public void insertAtEnd(int data){
        ListNode temp = new ListNode(data);
        if (last == null){
            last = temp;
            last.next = last;
        } else {
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }
    // Delete first node of the CLL
    public ListNode deleteFromBeg(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = last.next;
        if (last.next == last){
            last = null;
        } else {
            last.next = temp.next;
        }
        temp.next = null;
        length--;
        return  temp;
    }
    // Delete last node of the CLL     ----->>> incomplete
    public void deleteFromEnd(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = last.next;
        while (temp.next != last){
            temp = temp.next;
        }
        last = temp;
        last.next = temp;
    }

    // driver code main function
    public static void main(String[] args) {
        circularLinkedList cll = new circularLinkedList();
        cll.createCircularList(); // creating a list
        cll.insertAtBeg(5);  // insert at beg
        cll.insertAtEnd(35); // insert at end
        cll.deleteFromBeg();  // delete node from the beg of the list
//        cll.deleteFromEnd();  // delete node from the end of the list
        cll.printCircularList();  // print the CLL

    }
}
