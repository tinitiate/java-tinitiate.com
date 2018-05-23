---
YamlDesc: CONTENT-ARTICLE
Title: Java Comparator interface
MetaDescription: Java Collections Comparator interface code examples, tutorials
MetaKeywords: Java Collections, Comparator interface,compareTo, Collections.sort, code examples, tutorials
Author: Venkata Bhattaram / tinitiate.com
ContentName: collection-comparator-interface
---

# Comparator provides multiple element based Sorting 
* Comparator  modify the original class i.e. actual class is not modified.
* Using Comparator doesn't modifiy the actual class, i.e. no changes to the 
  Natural Order elements for sorting.
* Comparator's compare() method sort the elements, and used with 
  Collections.sort(List,Comparator) method and is part of the java.util package.
* We can sort the list elements of Comparable type by Collections.sort(List) method.
* java.util.Comparator: int compare(Object Obj1, Object Obj2) **compare** method 
  compares objects Obj1 and Obj2. And returns an integer with the following values:
  * Positive Integer (+1), When Obj1 is greater than Obj2
  * Zero             ( 0), When Obj1 equals to Obj2
  * Negative Integer (-1), When Obj1 is less than Obj2


## Understanding Comparator
* A comparator/Compare method object compares two different objects. 
  * The class does not compare its own instances, but a different classes instances.
  * Must implement the java.util.Comparator interface.
   To understand the program start reading from the Main method of the program.
* Useful to write Custom sort orders, See example below:
  * For example we have a list with following elements:
    (3,1,5,4,2)
  * Ascending sort: Collection.sort((3,1,5,4,2)) will return (1,2,3,4,5)
  * Descending sort: Collection.sort((3,1,5,4,2),Collections.reverseOrder())
    will return (5,4,3,2,1)
  * But if we want to write custom sorts like, Even numbers first
    or Odd numbers first, in such cases we can "IMPLEMENT" the Comparator
     Interface's "compare" Method.
* Can be used to add options to the sort order in Collections.sort and 
  Arrays.sort with your custom sort orders
  * java.util.Collections.sort(List, Comparator),
    Where Comparator.compare is written by the user 
  * java.util.Arrays.sort(Object[], Comparator), 
    Where Comparator.compare is written by the user
* Comparator: For ascending, Returns a negative integer, zero, or a positive integer 
  as the first argument is less than, equal to, or greater than the second.
* Comparator: For Descending, Returns a positive integer, zero or negative integer 
  as the first argument is less than, equal to, or greater than the second.
* Use Comparators to control the order of data structures.
```
package tinitiate.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

// Custom override, regular Ascending
class AscendingComparator implements Comparator<Integer> {

    // OverRide compare class
    public int compare(Integer val1, Integer val2) {
        // If val1>val2 return -1, If val1 = val2 return 0 If val1<val2 return 1 
    	return (val1>val2 ? 1 : (val1==val2 ? 0 : -1));
    }
}

//Custom override, regular Descending
class DescendingComparator implements Comparator<Integer> {
    // OverRide compare class
    public int compare(Integer val1, Integer val2) {
        // If val1>val2 return 1, If val1 = val2 return 0 If val1<val2 return -1 
    	return (val1>val2 ? -1 : (val1==val2 ? 0 : 1));
    }
}

// Custom override Order data with Even numbers first and then odd numbers last
class EvenNumFirstComparator implements Comparator<Integer> {
    // OverRide compare class
	// Order data with Even numbers first and then odd numbers last
	// Amongst the even and odd do an ascending order
    public int compare(Integer val1, Integer val2) {
        // Check if both are even and both are odd
    	if (((val1%2) == 0 && (val2%2) == 0) || ((val1%2) != 0 && (val2%2) != 0)) {
    	    return (val1>val2 ? 1 : (val1==val2 ? 0 : -1)); }
        else if  ((val1%2) == 0 && (val2%2) != 0) { return -1;}
        else if  ((val1%2) != 0 && (val2%2) == 0) { return 1;}
        else return 0;
	}
}

//Custom override Order data with odd numbers first and then even numbers
class OddNumFirstComparator implements Comparator<Integer> {
    // OverRide compare class
	// Order data with odd numbers first and then even numbers
	// Amongst the even and odd do an ascending order
	public int compare(Integer val1, Integer val2) {
		if (((val1%2) == 0 && (val2%2) == 0) || ((val1%2) != 0 && (val2%2) != 0)) {
		    return (val1>val2 ? 1 : (val1==val2 ? 0 : -1)); }
        else if  ((val1%2) == 0 && (val2%2) != 0) { return 1;}
        else if  ((val1%2) != 0 && (val2%2) == 0) { return -1;}
        else return 0;
    }
}


// Main Class 
public class JavaComparator {
	public static void main(String[] args) {
	    
		// Sorting with collections in Java.
        List<Integer> list = new ArrayList<Integer>();

        // Add elements in random order 
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(4);
        
        // Display elements in default order
        System.out.print("Default Natural Order");
        for (Integer i : list) {
            System.out.print("  " + i);
        } System.out.println("\n");

        
        // Sorting elements using Collections.sort, Sorting in Ascending order
        Collections.sort(list);
        // Display elements
        System.out.print("Collections.sort Ascending Order");
        for (Integer i : list) {
            System.out.print("  " + i);
        } System.out.println("\n");
        

        // Sorting elements using Collections.sort, Sorting in Descending order
        Collections.sort(list,Collections.reverseOrder());
        // Display elements
        System.out.print("Collections.sort Descending Order");
        for (Integer i : list) {
            System.out.print("  " + i);
        } System.out.println("\n");


        // Sorting elements using Collections.sort, With user specified order
        Collections.sort(list,new AscendingComparator());
        // Display elements
        System.out.print("Collections.sort Ascending user defined Order");
        for (Integer i : list) {
            System.out.print("  " + i);
        } System.out.println("\n");


        // Sorting elements using Collections.sort, With user specified order
        Collections.sort(list,new DescendingComparator());
        // Display elements
        System.out.print("Collections.sort Descending user defined Order");
        for (Integer i : list) {
            System.out.print("  " + i);
        } System.out.println("\n");


        // Sorting elements using Collections.sort, With user specified order
        Collections.sort(list,new EvenNumFirstComparator());
        // Display elements
        System.out.print("Collections.sort Even Numbers First Comparator Order");
        for (Integer i : list) {
            System.out.print("  " + i);
        } System.out.println("\n");


        // Sorting elements using Collections.sort, With user specified order
        Collections.sort(list,new OddNumFirstComparator());
        // Display elements
        System.out.print("Collections.sort Odd Numbers First Comparator Order");
        for (Integer i : list) {
            System.out.print("  " + i);
        } System.out.println("\n");
	}
}
```
