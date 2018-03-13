---
YamlDesc: CONTENT-ARTICLE
Title: Java Collections Framework HashMap
MetaDescription: Java Collections Framework HashMap code examples, tutorials
MetaKeywords: Java Collections Framework hashMap, code examples, tutorials
Author: Venkata Bhattaram / tinitiate.com
ContentName: collection-framework-hashmap
---

# Java Collection Framework HashMap
* Java HashMap class implements the map interface, inherits AbstractMap class.
* Java HashMap class is a data structure that stores data as a key value pair.
* Java HashMap data elements are always unique.
* Java HashMap could have ONE null key and values could be null.
* Java HashMap doesnot maintain data load order.


## Java HashMap Example and Operations
* HashMap implementation for Map, Java Collection FrameWork
* Maps are key-value pairs of data.
* A key is an object that, Which has another object value, associated to it.
* They contain unique keys and their values, Values may be duplicated.
* For every Key-Value stored in the Map, Value can retrieved by its key.
* HashMap uses a hash table to store the map.
* The default HashMap size is 16.
* HashMap does not display elements in the order they were added.
* Sample Code for methods:
* **put(K key, V value)**
* Associates the specified value with the specified key in this map.
* **get(Object key)**
* Returns the value to which the specified key is mapped, or null if this 
  map contains no mapping for the key.
* **boolean containsKey(Object key)**
* Returns true if this map contains a mapping for the specified key.
* **boolean containsValue(Object value)**
* Returns true if this map maps one or more keys to the specified value.
* **remove(Object key)**
* Removes the mapping for the specified key from this map if present.
* Looping through HashMap entries
* Declaring a Set and using entrySet() to return elements as a Set and 
  looping using For-All.
* Not Declaring a Set and using entrySet() to return elements as a Set and 
  looping using For-All
* Declaring a Set and using entrySet() to return elements as a Set and 
  looping using Iterator
* Not Declaring a Set and using entrySet() to return elements as a Set and 
  looping using Iterator
```
package tinitiate.java.collections;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;


public class CollectionsHashMap {

    public static void main(String[] args) {

        // Create a hash map.
        HashMap<String, String> HM_NationCapitals = new HashMap();

        // Adding elements to the map using put()
        HM_NationCapitals.put("USA",   "WASHINGTON DC");
        HM_NationCapitals.put("INDIA", "NEW DELHI");
        HM_NationCapitals.put("CHINA", "PEKING");
        HM_NationCapitals.put("DUMMY", "NA");

        // Display Value of a Key using get() 
        System.out.println("Capital of USA is " + HM_NationCapitals.get("USA"));

        // Updating the value of a Key using put() 
        HM_NationCapitals.put("CHINA", "BEJING");


        // Method containsKey() Checks if the given key exists
        if (HM_NationCapitals.containsKey("RUSSIA")) {
            System.out.println("Key 'RUSSIA' exists in the HashMap");
        } else { 
            System.out.println("Key 'RUSSIA' doesn't exist in the HashMap");
        }


        // Method containsValue() Checks if the given value exists
        if (HM_NationCapitals.containsValue("MOSCOW")) {
            System.out.println("Value 'MOSCOW' exists in the HashMap");
        } else {
            System.out.println("Value 'MOSCOW' doesn't exist in the HashMap");
        }


        // Method remove() Removes the mapping for the specified key
        HM_NationCapitals.remove("DUMMY");


        // Looping through HashMap entries
        // Declaring a Set and using entrySet() to return
        // elements as a Set and looping using For-All
        // Get Map into set of the entries.
        // Declare a Set, Convert Map to Set using entrySet() method
        Set<Map.Entry<String, String>> set1 = HM_NationCapitals.entrySet();

        // Display the set contents using "for"
        for(Map.Entry<String, String> me : set1) {
            System.out.println("Nation " + me.getKey() + " Capital: " + me.getValue());
        }


        // Looping through HashMap entries, using Iterator()
        // Declaring a Set and using entrySet() to return
        // elements as a Set and looping using For-All
        // Declare a Set,  Convert Map to Set using entrySet() method
        Set<Map.Entry<String, String>> set2 = HM_NationCapitals.entrySet();

        // Get Map into set of the entries. into Iterator
        Iterator itr2 = set2.iterator();

        while (itr2.hasNext()) {
            Map.Entry mEntry = (Map.Entry) itr2.next();
            System.out.println("Nation " + mEntry.getKey() + " Capital: " + mEntry.getValue());
        }


        // Not Declaring a Set and using entrySet() to return
        // elements as a Set and looping using For-All
        // Get Map into set of the entries. into Iterator
        // Directly use the entrySet() without an intermediate object 
        // declaration for Set and use the iterator method.
        Iterator itr1 = HM_NationCapitals.entrySet().iterator();

        while (itr1.hasNext()) {
            Map.Entry mEntry = (Map.Entry) itr1.next();
            System.out.println("Nation " + mEntry.getKey() + " Capital: " + mEntry.getValue());
        }
    }
}
```
