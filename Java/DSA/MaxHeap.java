package com.company.DSA;

public class MaxHeap {
    private Integer[] heap;
    private int n; // size of max heap
    // constructor of maxHeap
    public MaxHeap(int capacity){
        heap = new Integer[capacity+1]; // index 0 kept as empty
        n = 0;
    }
    public boolean isEmpty(){
        return n==0;
    }
    public int size(){
        return n;
    }

    public static void main(String[] args) {
        MaxHeap pq = new MaxHeap(3);
        System.out.println(pq.size());
        System.out.println(pq.isEmpty());
    }
}
