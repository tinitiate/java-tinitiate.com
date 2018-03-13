---
YamlDesc: CONTENT-ARTICLE
Title: Java Collections Framework ArrayDeque
MetaDescription: Java Collections Framework ArrayDeque code examples, tutorials
MetaKeywords: Java Collections Framework ArrayDeque, code examples, tutorials
Author: Venkata Bhattaram / tinitiate.com
ContentName: collection-framework-arraydeque
---

# Java Collection Framework ArrayDeque
* Deque is a special Queue where elements can be added or removed from both 
  sides of teh Queue.
* ArrayDeque size can be increased as needed.
* Deque ArrayDeque cannot have **null** elements
* ArrayDeque is not thread safe.

## Java ArrayDeque Example and Operations
* **add()**	and **offer()** method inserts element into the queue.
* **remove()** and **poll()** method removes and retrives first element of
   the queue.
* **element()** and **peek()** It is used to retrieves, but does not remove, 
  the head of this queue.
*  It is used to retrieves, but does not remove, the head of this queue, or 
   returns null if this queue is empty.
* Loop through PriorityQueue using For Loop and While Loop
```
package tinitiate.java.collections;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Iterator;

public class CollectionsArrayDeque {

    public static void main(String[] args) {

        // Declare a ArrayDeque
        Deque<Integer> adque = new ArrayDeque<Integer>();

        // Add elements to ArrayDeque, Using ADD
        adque.add(99);

        // Add elements to ArrayDeque, Using offer
        adque.offer(55);
        adque.offer(77);
        adque.offer(66);

        // Display elements of the ArrayDeque
        System.out.println("Elements of the ArrayDeque " + adque);

        // Retrieve and Remove head element using poll
        System.out.println("Remove and Retrive Head Element: " + adque.poll());

        // peek() Method 
        System.out.println("Only Retrive Head Element: " + adque.peek());

        // Loop Through ArrayDeque using For Loop
        Object[] arr = adque.toArray();
        System.out.println ( "Value in array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println ( arr[i].toString());
        }

        // Loop Through ArrayDeque using While Loop
        Iterator<Integer> itr = adque.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }    
    }
}
```
