---
YamlDesc: CONTENT-ARTICLE
Title: Java Collections Framework TreeMap
MetaDescription: Java Collections Framework TreeMap code examples, tutorials
MetaKeywords: Java Collections Framework TreeMap, code examples, tutorials
Author: Venkata Bhattaram / tinitiate.com
ContentName: collection-framework-treemap
---

# Java Collection Framework TreeMap
* Maps are key-value pairs of data, creating maps stored in a tree structure.
* TreeMap class extends AbstractMap and implements the NavigableMap interface.
* Efficient means of storing and provides quick retrieval.
* TreeMap stores its elements in ascending key order.

## Java TreeMap Example and Operations
* **put(K key, V value)**
* Adds specified value with the specified key in this map.
* **get(Object key)**
* Returns the value to which the specified key is mapped, or null if this map 
  contains no mapping for the key.
* **containsKey(Object key)**
* Returns true if this map contains a mapping for the specified key.
* **containsValue(Object value)**
* Returns true if this map maps one or more keys to the specified value.
* **remove(Object key)**
* Removes the mapping for the specified key from this map if present.
* **Looping through HashMap entries**
* Declaring a Set and using entrySet() to return elements 
  as a Set and looping using For-All
* Not Declaring a Set and using entrySet() to return elements 
  as a Set and looping using For-All
* Declaring a Set and using entrySet() to return elements 
  as a Set and looping using Iterator
* Not Declaring a Set and using entrySet() to return elements 
  as a Set and looping using Iterator
```
package tinitiate.java.collections;

import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

public class CollectionsTreeMap {

    public static void main(String[] args) {

        // Declare, using : Map or TreeMap
        Map<Integer, String> tmap = new TreeMap<Integer, String>();

        // Method put(), Add elements using in random order
        tmap.put(2,"C++");
        tmap.put(1,"JAVA");
        tmap.put(3,"SCALA");

        // Method get(), retrieve value by key
        System.out.println("Value of Key '2' is: " + tmap.get(2));
        System.out.println("Value of Key '1' is: " + tmap.get(1));
        System.out.println("Value of Key '3' is: " + tmap.get(3));

        // Method remove(), remove element by key
        tmap.remove(1);
                
        // Method containsKey(), Check if the given Key exists
        System.out.println(tmap.containsKey(1));

        // Method containsValue(), Check if a given value exists or not
        System.out.println(tmap.containsValue("JAVA"));
        
        // Calling Iterator
        Iterator itr1 = tmap.entrySet().iterator();

        while (itr1.hasNext()) {
            Map.Entry mEntry = (Map.Entry) itr1.next();
            System.out.println("Key " + mEntry.getKey() + " Value: " + mEntry.getValue());
        }
    }
}
```
