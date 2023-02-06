package com.company.DSA;

import java.util.EmptyStackException;

public class StackDS {
    private ListNode top;
    private int length;
    private class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
        }
    }
    public StackDS(){
        top = null;
        length = 0;
    }
    public int length(){
        return  length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    // push operation
    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }
    // pop operation
    public int pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }
    // peek method
    public int peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }

    // driver code
    public static void main(String[] args) {
        StackDS st = new StackDS();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
    }
}
