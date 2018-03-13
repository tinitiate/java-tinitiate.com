---
YamlDesc: CONTENT-ARTICLE
Title: Java Collections Framework EnumMap
MetaDescription: Java Collections Framework EnumMap code examples, tutorials
MetaKeywords: Java Collections Framework EnumMap, code examples, tutorials
Author: Venkata Bhattaram / tinitiate.com
ContentName: collection-framework-enummap
---

# Java Collection Framework EnumMap
* Java EnumMap class inherits Enum and AbstractMap classes.
* EnumMap class is a member of the Java Collections Framework & is not 
  synchronized.
* EnumMap is ordered collection and data load order of keys is maintained
* All EnumMap keys must be derived from a single enum type.
* EnumMap null key are not permitted, but null values are permitted.


## Java EnumMap Example and Operations
* Method put() to add key-value Map Data
* Method size() get the EnumMap size
* Method get() retrieving value from EnumMap by key
* Method containsKey(), Check if the given Key exists
* Method containsValue(), Check if a given value exists or not
```
package tinitiate.java.collections;

// Java EnumMap Example
import java.util.EnumMap;

public class CollectionsEnumMap {

    // Enum
    public enum NATIONS {
        USA, CHINA, INDIA;
    }

    public static void main(String args[]) {

        // EnumMap Using the NATIONS enum
        EnumMap<NATIONS, String> NationsMap = new EnumMap<NATIONS, String>(NATIONS.class);

        // Method put() to add key-value Map Data
        NationsMap.put(NATIONS.USA, "Washington DC");
        NationsMap.put(NATIONS.CHINA, "Bejing");
        NationsMap.put(NATIONS.INDIA, "New Delhi");

        // Method size() get the EnumMap size
        System.out.println("Size of EnumMap in java: " + NationsMap.size());

        // Method get() retrieving value from EnumMap by key
        System.out.println("Key: " + NATIONS.USA + " Value: " + NationsMap.get(NATIONS.USA));

        // Method containsKey(), Check if the given Key exists
        System.out.println(NationsMap.containsKey(NATIONS.CHINA));

        // Method containsValue(), Check if a given value exists or not
        System.out.println(NationsMap.containsValue("Bejing"));
    }
}
```
