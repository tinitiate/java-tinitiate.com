---
YamlDesc: CONTENT-ARTICLE
Title: Java Collections Framework Vector
MetaDescription: Java Collections Framework Vector code examples, tutorials
MetaKeywords: Java Collections Framework Vector, code examples, tutorials
Author: Venkata Bhattaram / tinitiate.com
ContentName: collection-framework-vector
---

# Java Collection Framework Vector
* Vector is similar to Array List, but with key difference of Vector being 
  part of legacy and Vector is synchronized.
* Vector supports Enumeration and Iterator to traverse its elements.

## Java Vector Example and Operations
* The below example demonstrates Vector some of its methods
* Create Vector, using string generic
* Add elements to Vector using the **add()** method
* Modify element at index using **add()** with position
* Modify element at index using **set()** with position
* Remove element using the **remove()**
* Retrive elements by index, using the **get()** method
* Get Size of Vector, using **size()** method
* Check if element exists in Vector using **contains()** method
* Loop through all elements of Vector
* Loop through all elements of Vector using iterator
```
package tinitiate.java.collections;

import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;

public class CollectionsVector {

    public static void main(String[] args) {

        // CREATE VECTOR, USE STRING GENERIC
        Vector<String> V = new Vector<String>();

        // ADD ELEMENTS TO VECTOR USING THE add() METHOD
        V.add("JAVA");
        V.add("C++");
        
        // ADD ELEMENTS AT AN INDEX TO VECTOR USING THE add() METHOD
        V.add(0, "C");

        // RETRIVE ALL ELEMENTS, PRINT DIRECTLY TO CONSOLE
        System.out.println("Contents of Vector V: " + V);

        // RETRIVE ELEMENTS BY INDEX, USING THE get() METHOD
        System.out.println(V.get(2));

        // MODIFY ELEMENT AT INDEX USING set() WITH POSITION
        V.set(2, "LISP");

        // REMOVE ELEMENT BY ELEMENT VALUE or INDEX POSITION USING remove() METHOD
        V.remove("ERLANG");
        V.remove(2);

        // Checks for a value using contains, Returns true if the vector 
        // contains the specified element.
        if (V.contains("SCALA"))
        {  System.out.println("SCALA exists in the Vector");  }

        // LOOP THROUGH ALL ELEMENTS OF VECTOR
        for (String e : V) {
            System.out.println(e);
        }

        // LOOP THROUGH ALL ELEMENTS OF VECTOR USING ITERATOR
        Iterator<String> Itr = V.iterator();

        // Iterator, If has Next, Loop
        while (Itr.hasNext()) {
        
            System.out.println(Itr.next());
        }
   
        
        // LOOP THROUGH ALL ELEMENTS OF VECTOR USING Enumeration
        Enumeration e = V.elements();

        while(e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
```
