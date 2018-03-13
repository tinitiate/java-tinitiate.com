---
YamlDesc: CONTENT-ARTICLE
Title: Java Collections Framework LinkedList
MetaDescription: Java Collections Framework LinkedList code examples, tutorials
MetaKeywords: Java Collections Framework LinkedList, code examples, tutorials
Author: Venkata Bhattaram / tinitiate.com
ContentName: collection-framework-linkedlist
---

# Java Collection Framework LinkedList
* Java LinkedList class uses doubly linked list to store the elements.
* Doubly linked list is a data structure that links sequentially records called 
  nodes. Each node contains THREE ASPECTS, TWO links referencing previous node 
  and next node, And the Third aspect **DATA**, The Data could span across 
  multiple Nodes.
* LinkedList Class inherits AbstractList class
* LinkedList Class implements List and Deque interfaces.
* LinkedList class may contain duplicate elements.
* Java LinkedList class maintains the elements in the order in which they are added.
* Any element removal will result in index and element rearrangement to keep it
  continious from the index of change.
* LinkedList Index starts from ZERO / 0
* Java LinkedList class is non synchronized.


## Java LinkedList Example and Operations
* The below example demonstrates LinkedList some of its methods
* Create linked list, using string generic
* Add elements to linked list using the **add()** method
* Modify element at index using **add()** with position
* Modify element at index using **set()** with position
* Remove element using the **remove()**
* Retrive elements by index, using the **get()** method
* Get Size of linked list, using **size()** method
* Check if element exists in linked list using **contains()** method
* Loop through all elements of linked list
* Loop through all elements of linked list using iterator
```
package tinitiate.java.collections;

import java.util.LinkedList;
import java.util.Iterator;

public class CollectionsLinkedList {

    public static void main(String[] args)  {

        // CREATE LINKED LIST, USE STRING GENERIC
        LinkedList<String> LL = new LinkedList<String>();

        // ADD ELEMENTS TO LINKED LIST USING THE add() METHOD
        LL.add("JAVA");
        LL.add("C++");

        // ADD ELEMENTS TO END OF LINKED LIST USING THE addLast() METHOD
        LL.addLast("ERLANG");
        
        // ADD ELEMENTS TO START OF LINKED LIST USING THE addFirst() METHOD
        LL.addFirst("SCALA");
        
        // ADD ELEMENTS AT AN INDEX TO LINKED LIST USING THE add() METHOD
        LL.add(0, "C");

        // RETRIVE ALL ELEMENTS, PRINT DIRECTLY TO CONSOLE
        System.out.println("Contents of Linked List LL: " + LL);

        // RETRIVE ELEMENTS BY INDEX, USING THE get() METHOD
        System.out.println(LL.get(2));

        // MODIFY ELEMENT AT INDEX USING set() WITH POSITION
        LL.set(2, "LISP");

        // REMOVE ELEMENT BY ELEMENT VALUE or INDEX POSITION USING remove() METHOD
        LL.remove("ERLANG");
        LL.remove(2);
        
        // REMOVE FIRST ELEMENT OR LAST ELEMEBT USING removeFirst() and removeLast()
        LL.removeFirst();
        LL.removeLast();

        // Checks for a value using contains, Returns true if the list contains the specified element.
        if (LL.contains("SCALA"))
        {  System.out.println("SCALA exists in the LinkedList");  }
        
        // LOOP THROUGH ALL ELEMENTS OF LINKED LIST
        for (String e : LL) {
            System.out.println(e);
        }
        
        // LOOP THROUGH ALL ELEMENTS OF LINKED LIST USING ITERATOR
        Iterator<String> Itr = LL.iterator();
        // Iterator, If has Next, Loop
        while (Itr.hasNext()) {
        
            System.out.println(Itr.next());
        }
    }
}
```
