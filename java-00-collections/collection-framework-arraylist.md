---
YamlDesc: CONTENT-ARTICLE
Title: Java Collections Framework ArrayList
MetaDescription: Java Collections Framework ArrayList code examples, tutorials
MetaKeywords: Java Collections Framework ArrayList, code examples, tutorials
Author: Venkata Bhattaram / tinitiate.com
ContentName: collection-framework-arraylist
---

# Java Collection Framework ArrayList
* **List** is a collection of ordered elements, It may have duplicates.
* **ArrayList** is an implementations of **list Interface**
* Java ArrayList is the resizable and supports null elements.
* Java ArrayList class may contain duplicate elements.
* Java ArrayList class maintains the elements in the order in which they are added.
* Java ArrayList supports random access of elements by index.
* Any element removal will result in index and element rearrangement to keep it
  continious from the index of change.
* Array Index starts from ZERO / 0
* Java ArrayList class is non synchronized.


## Java ArrayList Example and Operations
* The below example demonstrates ArrayList some of its methods
* Create array list, using string generic
* Add elements to array list using the **add()** method
* Modify element at index using **add()** with position
* Modify element at index using **set()** with position
* Remove element using the **remove()**
* Retrive elements by index, using the **get()** method
* Get Size of array list, using **size()** method
* Check if element exists in array list using **contains()** method
* Loop through all elements of array list
* Loop through all elements of array list using iterator
```
package tinitiate.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsArrayList {

   public static void main(String args[]) {

      // CREATE ARRAY LIST, USE STRING GENERIC
      ArrayList<String> AL = new ArrayList<String>();

      // ADD ELEMENTS TO ARRAY LIST USING THE add() METHOD
      AL.add("A");
      AL.add("B");
      AL.add("C");
      AL.add("C");
      System.out.println(AL);

      // MODIFY ELEMENT AT INDEX USING add() WITH POSITION
      AL.add(1,"X");

      // MODIFY ELEMENT AT INDEX USING set() WITH POSITION
      AL.set(2, "Y");

      System.out.println(AL);

      // REMOVE ELEMENT USING THE remove()
      AL.remove("D");
      AL.remove(2);
      System.out.println(AL);


      // RETRIVE ALL ELEMENTS, PRINT DIRECTLY TO CONSOLE
      System.out.println(AL);

      // RETRIVE ELEMENTS BY INDEX, USING THE get() METHOD
      System.out.println(AL.get(1));

      // SIZE OF ARRAY LIST, USING size() METHOD
      System.out.println(AL.size());


      // LOOP THROUGH ALL ELEMENTS OF ARRAY LIST
      for (String e : AL) {
          System.out.println(e);
      }

      // LOOP THROUGH ALL ELEMENTS OF ARRAY LIST USING ITERATOR
      Iterator<String> Itr = AL.iterator();
      while (Itr.hasNext()) {
          System.out.println(Itr.next());
      }
   }
}
```
