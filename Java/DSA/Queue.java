package com.company.DSA;

import java.util.NoSuchElementException;

public class Queue {
    private ListNode front;
    private ListNode rear;
    private int length;
    private class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
        }
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    // constructor to initialize a queue
    public Queue(){
        this.front = null;
        this.rear = null;
        this.length = 0;
    }
    // method to print the queue
    public void display(){
        if (isEmpty()){
            return;
        }
        ListNode current = front;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("mull");
    }
    // insertion (enqueue) in a queue
    public void enqueue(int data){
        ListNode temp = new ListNode(data);
        if (isEmpty()){
            front = temp;
        } else {
            rear.next = temp;
        }
        rear = temp;
        length++;
    }
    // deletion (dequeue) from a queue
    public int dequeue(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        int result = front.data;
        front = front.next;
        if (front == null){
            rear = null;
        }
        length--;
        return result;
    }
    // finding first element stored in queue
    public int getFrontElement(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        int res = front.data;
        return res;
    }
    // finding end element stored in queue
    public int getRearElement(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        int res = rear.data;
        return res;
    }

    // driver code
    public static void main(String[] args) {
        Queue que = new Queue();
        // insertion of elements
        que.enqueue(10);
        que.enqueue(20);
        que.enqueue(30);
        que.enqueue(40);
        que.enqueue(50);
        que.enqueue(60);
        que.display();
        // deletion of elements
        System.out.println(que.dequeue());
        System.out.println(que.dequeue());
        System.out.println(que.getFrontElement()); // get first element of queue
        System.out.println(que.getRearElement()); // get last element of queue
    }
}
