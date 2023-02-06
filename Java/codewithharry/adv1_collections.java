package com.company.codewithharry;
//import java.util.ArrayList;
//import java.util.Set;
//import java.util.TreeSet;
import java.util.*;

public class adv1_collections {
    public static void main(String[] args) {
        // ArrayList  // array accessing is faster than linked list
//        /*
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(15);
        l2.add(25);
        l2.add(35);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(5);
        l1.add(0,5);
        l1.addAll(0,l2);
        System.out.println(l1.contains(27));
        l1.set(1,566);
        for (int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
        System.out.println(l1.indexOf(7));
        System.out.println(l1.lastIndexOf(6));
        System.out.println(l1.indexOf(667)); // return -1 bcoz it is not in list
//        l1.clear();
//        */

        // linked list  // insertion of element is faster than ArrayList
        /*
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(25);
        l2.add(35);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(5);
        l1.add(0,5);
        l1.addAll(0,l2);
        System.out.println(l1.contains(27));
        l1.set(1,566);
        l1.addFirst(22);
        l1.addLast(55);
        for (int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
        System.out.println();
        System.out.println(l1.indexOf(7));
        System.out.println(l1.lastIndexOf(6));
        System.out.println(l1.indexOf(667)); // return -1 bcoz it is not in list
//        l1.clear();
        System.out.println(l1.peek());
        System.out.println(l1.pollLast());
         */

        // Array Dequeue  // insertion & deletion can be done from both sides
        /*
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(23);
        ad1.addLast(32);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
          */

        // Hashing  -> A technique to search elements faster
        /*
        // HashSet
        // HashMap
        // Linked HashMap
        // Hash Table
         */

        // HashSet -> It have only unique values it have no repeatation
        /*
        HashSet<Integer> myHashSet = new HashSet<>(6,0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11);
        System.out.println(myHashSet);
         */


    }
}
