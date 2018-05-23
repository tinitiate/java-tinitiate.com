---
YamlDesc: CONTENT-ARTICLE
Title: Java Comparable interface
MetaDescription: Java Collections Comparable interface code examples, tutorials
MetaKeywords: Java Collections, Comparable interface,compareTo, Collections.sort, code examples, tutorials
Author: Venkata Bhattaram / tinitiate.com
ContentName: collection-comparable-interface
---

# Comparable Interface compareTo Collections.sort
* Java Comparable interface [ from java.lang package ] sorts the objects of a
  user-defined class. The method `compareTo` of `the Comparable Interface`
  must be implemented.
* `Comparable` is used to compare Objects to help them in Sort
* Comparable object compares itself with another object.
* `java.lang.Comparable: int compareTo(Object Obj1)` This method compares
  "this" object with Obj1 object. Returns an integer,
  * Returns positive  = this object is greater than Obj1
  * Returns zero      = this object equals to Obj1
  * Returns negative  = this object is less than Obj1
* Comparable provides single element based sorting
* Using Comparable modifies the actual class, elements Natural Order for sorting.
* The methodcompareTo() is used to sort elements, part of the java.lang package.
* We can sort the list elements of Comparable type by Collections.sort(List) method.

## Understanding Comparable
* Lets assume we have a source list with elements: (3,1,5,4,2)
* By implementing `compareTo` method of the `Comparable Interface, we can create
  Custom sort orders, See example below:
  * Ascending sort: Collection.sort((3,1,5,4,2)) will return (1,2,3,4,5)
  * Descending sort: Collection.sort((3,1,5,4,2),Collections.reverseOrder())
    will return (5,4,3,2,1)
  * But if we want to write custom sorts like, Even numbers first, Then
    Ascending amongst them: (2,4,1,3,5) *or*
    Odd numbers first,  Then Ascending amongst them: (1,3,5,2,4)
    In such cases we can "IMPLEMENT" the Comparator Interface's
    "compare" Method.
* Overrides the sort order in Collections.sort and Arrays.sort
  * `java.util.Collections.sort(List),` Where Comparable.compareTo is
    written by the developer.
* It provide single sorting sequence only i.e. you can sort the elements on
  based on single data member only. For example it may be rollno, name,
  age or anything else.
```
package tinitiate.java.collections;

import java.util.*;

class NumberList implements Comparable<NumberList> {

    // Main Data
    int IntVal;

    // Creating multiple SortTypes
    public static String SortType;

    public NumberList(int iIntval) {
        IntVal = iIntval;
    }

    // OverRide compareTo class
    public int compareTo(NumberList val1) {

        // SortType ASCENDING
        if ( SortType.toUpperCase() == "ASCENDING" ) {
            return (val1.IntVal > IntVal ? -1 : (val1.IntVal == IntVal ? 0 : 1)); }

        // SortType DESCENDING
        else if  ( SortType.toUpperCase() == "DESCENDING" ) {
            return (val1.IntVal > IntVal ? 1 : (val1.IntVal == IntVal ? 0 : -1)); }

        // SortType EVEN NUMBER VALUES FIRST ASCENDING
        else if  ( SortType.toUpperCase() == "EVEN-FIRST-ASCENDING" ) {

            // Order data with Even numbers first and then odd numbers last
            // Amongst the even and odd do an ascending order
            // Check if both are even and both are odd
            if (((val1.IntVal%2) == 0 && (IntVal%2) == 0) || ((val1.IntVal%2) != 0 && (IntVal%2) != 0))
                { return (val1.IntVal > IntVal ? -1 : (val1.IntVal == IntVal ? 0 : 1)); }
            else if  ((val1.IntVal%2) == 0 && (IntVal%2) != 0)
                { return 1;}
            else if  ((val1.IntVal%2) != 0 && (IntVal%2) == 0)
                { return -1;}
            else
                return 0;
        }

        // SortType ODD NUMBER VALUES FIRST ASCENDING
        else if  ( SortType.toUpperCase() == "ODD-FIRST-ASCENDING" ) {

            // Order data with odd numbers first and then even numbers
            // Amongst the even and odd do an ascending order
            if (((val1.IntVal%2) == 0 && (IntVal%2) == 0) || ((val1.IntVal%2) != 0 && (IntVal%2) != 0)) {
                return (val1.IntVal > IntVal ? -1 : (val1.IntVal == IntVal ? 0 : 1)); }
            else if  ((val1.IntVal%2) == 0 && (IntVal%2) != 0) { return -1; }
            else if  ((val1.IntVal%2) != 0 && (IntVal%2) == 0) { return 1;}
            else return 0;
        }
        return 0;
    }
}

// Class to test the Comparable Implementation
public class JavaComparable {

    public static void main(String[] args) {

        // Create Objects for the class and initialize to null
        // Create a ArrayList of type NumberList Class
        ArrayList<NumberList> myList = new ArrayList<NumberList>();

        // Add Elements
        myList.add(new NumberList(2));
        myList.add(new NumberList(4));
        myList.add(new NumberList(1));
        myList.add(new NumberList(3));

        // Choose a Sort Type
        NumberList.SortType = "ASCENDING";

        // Call Collections.sort
        Collections.sort(myList);

        // Print values of collection
        for (NumberList i : myList)
        { System.out.print("  " + i.IntVal); }
        System.out.println("\n" + "-------");


        NumberList.SortType = "DESCENDING";
        Collections.sort(myList);
        // Print values of collection
        for (NumberList i : myList)
        { System.out.print("  " + i.IntVal); }
        System.out.println("\n" + "-------");


        NumberList.SortType = "EVEN-FIRST-ASCENDING";
        Collections.sort(myList);
        // Print values of collection
        for (NumberList i : myList)
        { System.out.print("  " + i.IntVal); }
        System.out.println("\n" + "-------");

        NumberList.SortType = "ODD-FIRST-ASCENDING";
        Collections.sort(myList);
        // Print values of collection
        for (NumberList i : myList)
        { System.out.print("  " + i.IntVal); }
        System.out.println("\n" + "-------");
    }
}
```
