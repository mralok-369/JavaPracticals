package com.company.DSA;

import java.util.List;

public class singlyLinkedList {
    private ListNode head;
    // inner class
    private static class ListNode {
        private int data; //generic type
        private  ListNode next;
        //constructor of ListNode class
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    // method to print SLL
    public void display(ListNode head){
        ListNode current = head;
        while (current!=null){
            System.out.print(current.data +" --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    // method to count length of a SLL
    public  int length(){
        if (head == null){
            return 0;
        }
        int count =0;
        ListNode current = head;
        while (current!=null){
            count++;
            current = current.next;
        }
        return count;
    }

    // method to insert a node at the beg of the SLL
    public void insertAtBeg(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    // method to insert a node at the end of a SLL
    public void insertAtEnd(int value){
        ListNode newNode = new ListNode(value);
        if (head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    // method to inset an element at a specific position
    public void insertAtSpecific(int data, int position){
        ListNode node = new ListNode(data);
        if (position == 1){
            node.next = head;
            head = node;
        } else {
            ListNode previous = head;
            int count =1;
            while(count < position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            node.next = current;
            previous.next = node;
        }
    }

    // Deleting first element of the SLL
    public ListNode deleteFirst(){
        if(head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    // deleting last node of SLL
    public ListNode deleteLast(){
        if(head == null || head.next ==null){
           return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    // deleting element from a specific location
    public void deleteAtSpecific(int position){
        // position is valid and starting from 1
        // 3 -> 4 -> 7 -> 8 -> 9 -> null
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while(count<position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    // Search an element in SLL
    public boolean searchElement(int searchKey){
        if (head == null){
            return false;
        }
        ListNode current = head;
        while (current != null){
            if (current.data == searchKey){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Reverse a singly linked list
    public ListNode reverseList(ListNode head){
        if (head == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    // finding middle node in a sll
    public ListNode getMiddleNode(){
        if (head == null){
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr!=null && fastPtr.next!=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    // finding nth node from the SLL
    public ListNode getNthNodeFromEnd(int n){
        if (head == null){
            return null;
        }
        if (n <=0){
            throw new IllegalArgumentException("Invalid value: = "+ n);
        }
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        while (count <n){
            if (refPtr == null){
                throw new IllegalArgumentException(n + " is greater than the number of nodes in list");
            }
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr != null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    // remove duplicate from the sorted SLL
    public void removeDuplicate(){
        if (head == null){
            return;
        }
        ListNode current = head;
        while(current!=null && current.next!=null){
            if (current.data == current.next.data){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        System.out.println();
    }

    // insert a node in a sorted SLL
    public ListNode insertInSortedList(int value){
        ListNode newNode = new ListNode(value);
        if (head == null){
            return null;
        }
        ListNode current = head;
        ListNode temp = null;
        while (current!=null && current.data < newNode.data){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        System.out.println();
        return head;
    }

    // remove a given key from the SLL
    public void removeGivenKey(int key){
        ListNode current = head;
        ListNode temp = null;
        if (current!=null && current.data == key){
            head = current.next;
            return;
        }
        while (current!=null && current.data != key){
            temp = current;
            current = current.next;
        }
        if (current==null) return;
        temp.next = current.next;
        System.out.println();
    }

    // detect a loop in SLL
    public boolean detectLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while(fastPtr!=null && fastPtr.next!=null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr){
                return true;
            }
        }
        return false;
    }
    // create a loop in SLL
    public void  createALoopInList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
        System.out.println();
    }

    // find start of a loop in SLL
    public ListNode findStartOfLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while(fastPtr!=null && fastPtr.next!=null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr){
                return getStartingNode(slowPtr);
            }
        }
        return null;
    } // is also known as Floyd's cycle detection algorithm
    public ListNode getStartingNode(ListNode slowPtr){
        ListNode temp = head;
        while (slowPtr != temp){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;
    }

    // remove loop from a SLL
    public void removeLoopFromList(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while(fastPtr!=null && fastPtr.next!=null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr){
                removeLoop(slowPtr);
                return;
            }
        }
    } // is also known as Floyd's cycle detection algorithm
    private void removeLoop(ListNode slowPtr){
        ListNode temp = head;
        while (slowPtr.next != temp.next){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = null;
    }

    // Driver function / main function
    public static void main(String[] args) {
        /*
        // creating an instance of SLL
        singlyLinkedList sll = new singlyLinkedList();
        sll.head = new ListNode(10); // head node

        // creating other node
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        // connecting nodes together to form a SLL
        sll.head.next = second; // 10 --> 1
        second.next = third; // 10 --> 1 --> 8
        third.next = fourth; // 10 --> 1 --> 8 --> 11 --> null

        // Insert an element at a given position in SLL
        sll.insertAtSpecific(13,3);
        sll.insertAtSpecific(25,2);
        sll.insertAtSpecific(26,4);

//        // Insert a node at the beg of list
//        sll.insertAtBeg(11);
//        sll.insertAtBeg(8);
//        sll.insertAtBeg(1);
//
//        // Inserting anode the end
//        sll.insertAtEnd(10);
//        sll.insertAtEnd(5);

        // delete first node
//        System.out.println("First deleted node is : " + sll.deleteFirst().data);
        // deleting last element of SLL
//        System.out.println("Last deleted node is : " + sll.deleteLast().data);
        // deleting element at specific position
//        sll.deleteAtSpecific(1);
//        sll.deleteAtSpecific(4);

        // searching an element in a SLL
//        System.out.println(sll.searchElement(12));

        // displaying the list
        sll.display();
        // find length of SLL
        System.out.println("\nThe length of the list : " + sll.length());

        // reverse a linked list
        sll.reverseList();
        sll.display();
        */

        // operations from reversing a list
        singlyLinkedList sll = new singlyLinkedList();
        sll.insertAtBeg(54);
        sll.insertAtBeg(33);
        sll.insertAtBeg(23);
        sll.insertAtBeg(17);
        sll.insertAtBeg(12);
        /*
        sll.insertAtBeg(1);
        sll.insertAtBeg(1);
        sll.insertAtBeg(2);
        sll.insertAtBeg(3);
        sll.insertAtBeg(3);*/
        sll.display(sll.head);

        // checking loop in SLL
        /*
        singlyLinkedList sl = new singlyLinkedList();
        sl.createALoopInList();
        sl.display(sl.head);
        System.out.println("\n" + sl.detectLoop());
        // finding start of loop in SLL
        System.out.println(sl.findStartOfLoop());
        sl.removeLoopFromList();
        sl.display(sl.head);
        */

        // remove a given key from the SLL
        /*
        sll.removeGivenKey(23);
        sll.display(sll.head);/*

        // inserting in sorted SLL
        /*
        sll.insertInSortedList(28);
        sll.display(sll.head);*/

        // remove duplicate nodes from the SLL
        /*
        sll.removeDuplicate();
        sll.display(sll.head);*/

        // reversing a list
        /*
        System.out.println();
        ListNode reverse = sll.reverseList(sll.head);
        sll.display(reverse);*/

        // finding middle node
        /*
        ListNode middle = sll.getMiddleNode();
        System.out.println("\nMiddle node of the list = " + middle.data);
         */

        // finding nth node
        /*
        ListNode nFromEnd = sll.getNthNodeFromEnd(2);
        System.out.println("\nNth node from the list = " + nFromEnd.data);
         */
    }
}