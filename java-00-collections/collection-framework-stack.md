---
YamlDesc: CONTENT-ARTICLE
Title: Java Collections Framework Stack
MetaDescription: Java Collections Framework Stack push pop code examples, tutorials
MetaKeywords: Java Collections Framework Stack, push, pop , code examples, tutorials
Author: Venkata Bhattaram / tinitiate.com
ContentName: collection-framework-stack
---


# Java Collection Framework Stack
* Stack implements **List** Interface.
* Java Stack data structure provides a Last In First Out (LIFO) mechanism
* Elements are added or PUSH into the STACK at **top of the stack**,
  and elements removal or POP is also from the top.
* This executes the Last In First Out (LIFO).


## Java Stack Example and Operations
* The below code demonstrates;
* Create a new stack.
* Add elements to a stack using push() method
* Remove elements from stack (first in last out) using pop() method
* Search for element index in the stack using search() method
* Display stack top element using peek() method
* Check if the stack is empty or not using empty() method
* Disply stack elements using iterator, this doesnt not pop the elements,
* it only reads them elements still stay in the stack.
```
package tinitiate.java.collections;

import java.util.Stack;
import java.util.Iterator;

public class CollectionsStack {

    public static void main(String args[]) {

        // CREATE STACK
    	Stack stk = new Stack();
    	
    	// ADD ELEMENTS TO A STACK USING push() METHOD
        stk.push("C++");
        stk.push("JAVA");
        stk.push("SCALA");
        
        
        // REMOVE ELEMENTS FROM STACK (FIRST IN LAST OUT) USING pop() METHOD
        System.out.println(stk.pop());

        // SEARCH FOR ELEMENT INDEX IN THE STACK USING search() METHOD
        System.out.println("Element 'JAVA' is at position: " + stk.search("JAVA"));
        
        // DISPLAY STACK TOP ELEMENT USING peek() METHOD
        System.out.println("Top element in the stack: " + stk.peek());
        
        // CHECK IF THE STACK IS EMPTY OR NOT USING empty() METHOD
        // RETURNS A BOOLEAN TRUE / FLASE
        System.out.println(stk.empty());

        // DISPLY STACK ELEMENTS USING ITERATOR
        // NOTE: This doesnt not pop the elements, it only reads them
        // ELEMENTS STILL STAY IN THE STACK
        Iterator itr = stk.iterator();
		while(itr.hasNext()) {
		    Object element = itr.next();
		    System.out.print(element + "\n");
		}
  }
}
```
