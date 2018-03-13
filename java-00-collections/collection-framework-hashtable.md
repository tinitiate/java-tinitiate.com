---
YamlDesc: CONTENT-ARTICLE
Title: Java Collections Framework hashtable
MetaDescription: Java Collections Framework hashtable code examples, tutorials
MetaKeywords: Java Collections Framework hashtable, code examples, tutorials
Author: Venkata Bhattaram / tinitiate.com
ContentName: collection-framework-hashtable
---

# Java Collection Framework hashtable
* Hashtable stores key - value pair data, where the Key identifies the Data Element
* It can only contains unique keys, and key and value cannot be null.
* Tt is synchronized and is thread safe.


## Java HashTable Example and Operations
* Method put() Add Key and Value to Hashtable.
* Method remove() removes key and element by key from Hashtable.
* Method ContainsValue, Returns Boolean if the specified value exists.
* Method ContainsKey, Returns Boolean if the specified Key exists.
* Method getKey() Read Key.
* Method getValue() Read Value.
```
package tinitiate.java.collections;

import java.util.Hashtable;
import java.util.Map;

public class CollectionsHashtable {

    public static void main(String[] args) {

        Hashtable<Integer,String> HT = new Hashtable<Integer,String>();

        // put() Add Key and Value to Hashtable
        HT.put(1,"JAVA");
        HT.put(2,"PYTHON");
        HT.put(3,"PHP");
        HT.put(4,"RUBY");

        // remove() removes key and element by key from Hashtable
        HT.remove(1);

        // ContainsValue, Returns Boolean if the specified value exists
        if (HT.containsValue("RUBY")) { System.out.println("RUBY Element Exists"); }
        
        // ContainsKey, Returns Boolean if the specified Key exists
        if (HT.containsKey(4)) { System.out.println("4 Key Exists"); }
        
        // getKey() Read Key
        // getValue() Read Value
        for(Map.Entry m: HT.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
```
