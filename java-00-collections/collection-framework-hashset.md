---
YamlDesc: CONTENT-ARTICLE
Title: Java Collections Framework HashSet
MetaDescription: Java Collections Framework HashSet code examples, tutorials
MetaKeywords: Java Collections Framework HashSet, code examples, tutorials
Author: Venkata Bhattaram / tinitiate.com
ContentName: collection-framework-hashset
---

# Java Collection Framework HashSet
* HashSet extends `AbstractSet` and Implements `Set` Interface
* Does not guarantee ordering.
* HashSet permits null elements.
* Iteration is linear in the sum of the number of entries buckets (the capacity).
* Choosing an large initial capacity consumes more space and time.
* Choosing an small initial capacity consumes time when the capacity is increased
  for an existing HashSet.
* Default initial capacity is 16.
* Does not support GET / SET methods.

## Java hashSet Example and Operations
* The below program demonstrates creating and using HashSet Object
* Create a New HashSet Object
* Add elements to HashSet using the add() Method
* Get the Size of HashSet using the size() method
* Loop through the HashSet elements using the Iterator
* Check if an element exists using Contains() method.
* Remove element using the remove() method
* Loop through the HashSet elements using the Iterator
```
package tinitiate.java.collections;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionsHashSet {

    public static void main(String args[]) {

        // Create a New HashSet Object
        HashSet<Integer> hset = new HashSet<Integer>();

        // Add elements to HashSet using the add() Method
        hset.add(9999);
        hset.add(8888);
        hset.add(7777);

        // Print HashSet elements to Console
        System.out.println("Contents of the HashSet" + hset);

        // Get the Size of HashSet using the size() method
        System.out.println("Size of the HashSet: " + hset.size());

        // contains() Method to display if an element exists or not 
        System.out.println(hset.contains(9999));

        // Loop through the HashSet elements using the Iterator
        Iterator itr = hset.iterator();

        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + "\n");
        }
    }
}
```
