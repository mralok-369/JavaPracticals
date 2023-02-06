package com.company.codewithharry;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class adv2_date_and_time_and_calendar_class {
    public static void main(String[] args) {
        // Time methods
        /*
        System.out.println(System.currentTimeMillis()); // ms passed from 1900
        System.out.println(System.currentTimeMillis()/1000); // seconds passed from 1900
        System.out.println(System.currentTimeMillis()/1000/60); // minutes passed from 1900
        System.out.println(System.currentTimeMillis()/1000/60/60); // hours passed from 1900
        System.out.println(System.currentTimeMillis()/1000/3600/24); // days passed from 1900
        System.out.println(System.currentTimeMillis()/1000/3600/24/365); // years passed from 1900
        long l = System.currentTimeMillis();
        System.out.println(l);
        System.out.println(Long.MAX_VALUE);
         */

        // Date Class
        /*
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime()); // return ms since 1 jan 1970
        System.out.println(d.getDate()); // Deprecated. methods
        System.out.println(d.getYear()); // Deprecated. methods
        System.out.println(d.getMinutes()); // Deprecated. methods
         */

        // Calendar class -> This is an abstract class
        /*
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());

        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.get(Calendar.SECOND));
         */

        // Gregorian calendar -> This is an concrete class
        /*
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+ c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2020));
//        for (int i=0; i<TimeZone.getAvailableIDs().length; i++){
//            System.out.println(TimeZone.getAvailableIDs()[i]);
//        }
         */

        // Java.Time Api Package
        /*
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        */

        // DateTimeFormatter class
        LocalDateTime dt = LocalDateTime.now(); // date
        System.out.println(dt);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy--E"); // date format
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(dt.format(df2));
        String myDate = dt.format(df); //Creating date string using date and format
        System.out.println(myDate);
    }
}
