---
YamlDesc: CONTENT-ARTICLE
Title: Java Collections Framework PriorityQueue
MetaDescription: Java Collections Framework priorityqueue code examples, tutorials
MetaKeywords: Java Collections Framework priorityqueue, code examples, tutorials
Author: Venkata Bhattaram / tinitiate.com
ContentName: collection-framework-priorityqueue
---

# Java Collection Framework PriorityQueue
* PriorityQueue Implements **Queue Interface** elements are added to end of the 
  queue and removed from start of the Queue.
  orders the element in FIFO(First In First Out) manner.
* Queue works on the principle **FIFO First In First Out**, Where the first 
  added element is removed first and last added element is removed at last.

## Java PriorityQueue Example and Operations
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

import java.util.PriorityQueue;
import java.util.Iterator;

public class CollectionsPriorityQueue
{
	public static void main(String[] args)
	{
        // Declare a PriorityQueue
		PriorityQueue<Integer> pque = new PriorityQueue<Integer>();

		// Add elements to PriorityQueue, Using ADD
		pque.add(99);

		// Add elements to PriorityQueue, Using offer
		pque.offer(55);
		pque.offer(77);
		pque.offer(66);

		// Display elements of the Queue
		System.out.println("Elements of the PriorityQueue " + pque);

		// Retrieve and Remove head element using poll
		System.out.println("Remove and Retrive Head Element: " + pque.poll());

		// peek() Method 
		System.out.println("Only Retrive Head Element: " + pque.peek());

        // Loop Through PriorityQueue using For Loop
        Object[] arr = pque.toArray();
        System.out.println ( "Value in array: ");
        for (int i = 0; i < arr.length; i++)
          System.out.println ( arr[i].toString()) ;
        
        // Loop Through PriorityQueue using While Loop
        Iterator<Integer> itr = pque.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
	}
}
```
