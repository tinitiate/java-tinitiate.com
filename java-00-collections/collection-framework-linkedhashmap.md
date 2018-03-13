---
YamlDesc: CONTENT-ARTICLE
Title: Java Collections Framework LinkedHashMap
MetaDescription: Java Collections Framework LinkedHashMap code examples, tutorials
MetaKeywords: Java Collections Framework LinkedHashMap, code examples, tutorials
Author: Venkata Bhattaram / tinitiate.com
ContentName: collection-framework-linkedhashmap
---

# Java Collection Framework LinkedHashMap
* Java LinkedHashMap class is implementation Map interface and inherits HashMap
* Data is stored as key-value pair, Data Load order is maintained.
* Only unique Keys are permitted.
* There may be ONE null key, But multiple null values.


## Java LinkedHashMap Example and Operations
* Maps are key-value pairs of data, creating maps stored in a tree structure.
* LinkedHashMap class extends AbstractMap and implements the NavigableMap interface.
* Efficient means of storing and provides quick retrieval.
* LinkedHash map stores its elements in order they were inserted.
* Supports below methods and more (See MapCollectionsHashMap example):
* **put(K key, V value)**
* Add value with the specified key in this map.
* **get(Object key)**
* Returns the value to which the specified key is mapped, or null if this 
  map contains no mapping for the key.
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
* Sample Code Put(), getValue, Iterator
```
package tinitiate.java.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Iterator;

public class CollectionsLinkedHashMap {
    
    public static void main(String[] args) {

        // Declare, using : Map or TreeMap
        Map<Integer, String> lhmap = new LinkedHashMap<Integer, String>();

        // Method put(), to Add elements by Key
        lhmap.put(2,"C++");
        lhmap.put(1,"JAVA");
        lhmap.put(3,"SCALA");

        // Method get(), Retrieve element by Key
        System.out.println("Value of Key '2' is: " + lhmap.get(2));
        System.out.println("Value of Key '1' is: " + lhmap.get(1));
        System.out.println("Value of Key '3' is: " + lhmap.get(3));

        // Method remove(), Removes element by Key
        lhmap.remove(1);
        
        // Method containsKey(), Check if the given Key exists
        System.out.println(lhmap.containsKey(1));

        // Method containsValue(), Check if a given value exists or not
        System.out.println(lhmap.containsValue("JAVA"));
        
        // Loop Through Map using Iterator
        Iterator itr1 = lhmap.entrySet().iterator();

        while (itr1.hasNext()) {
            Map.Entry mEntry = (Map.Entry) itr1.next();
            System.out.println("Key " + mEntry.getKey() + " Value: " + mEntry.getValue());
        }
    }
}
```
