package com.company.codewithharry;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;

public class ch15_practice_set {
    public static void main(String[] args) {
        // Question 1
        /*
        ArrayList<String> al = new ArrayList<>();
        al.add("Alok");
        al.add("Alex");
        al.add("Vishal");
        al.add("Harry");
        al.add("Ritu");
        for (String name : al) {
            System.out.println(name);
        }
        */

        // Question 2
        /*
        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(ldt1);
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("kk:mm:ss");
        String str = ldt1.format(dtf1);
        System.out.println(str);
        */

        // Question 3
        /*
        Calendar c = Calendar.getInstance();
        int h = c.get(Calendar.HOUR_OF_DAY);
        int m = c.get(Calendar.MINUTE);
        int s = c.get(Calendar.SECOND);
        System.out.println(h+":"+m+":"+s);
        */

        // Question 4
        /*
        LocalTime lt = LocalTime.now();
        int h1 = lt.getHour();
        int m1 = lt.getMinute();
        int s1 = lt.getSecond();
        System.out.println(h1+":"+m1+":"+s1);
        */

        // Question 5
        HashSet<Integer> hs = new HashSet<>();
        hs.add(25);
        hs.add(25);
        hs.add(25);
        hs.add(86);
        hs.add(86);
        hs.add(23);
        hs.add(23);
        hs.add(23);
        hs.add(123);
        hs.add(123);
        System.out.println(hs);
    }
}
