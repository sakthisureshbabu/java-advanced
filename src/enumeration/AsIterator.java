package enumeration;

// asIterator() method of enumeration is used to return an Iterator that traverses through the remaining elements covered by enumeration.
// This method accepts nothing and returns iterator of remaining elements of enumeration.

import java.util.*;

public class AsIterator {
    public static void main(String[] args) {
        Enumeration<String> Days;
        Vector<String> week = new Vector<>();

        week.add("Sunday");
        week.add("Monday");
        week.add("Tuesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");

        Days = week.elements();

        // get the iterator
        Days.asIterator().forEachRemaining(ele -> System.out.println(ele));
    }
}
