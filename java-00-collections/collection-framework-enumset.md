---
YamlDesc: CONTENT-ARTICLE
Title: Java Collections Framework EnumSet
MetaDescription: Java Collections Framework EnumSet code examples, tutorials
MetaKeywords: Java Collections Framework EnumSet, code examples, tutorials
Author: Venkata Bhattaram / tinitiate.com
ContentName: collection-framework-enumset
---

# Java Collection Framework HashSet
* Java EnumSet class is the implementation of Set Interface and inherits 
  AbstractSet class.
* All of the members of an ENUM set must be of the same ENUM type.
* Ordering of the elements is in the order of enumeration element declaration. 
* Better performance and memory benefits than using a HashSet. 
* Support iteration over ranges of ENUM types.

## Java hashSet Example and Operations
```
package tinitiate.java.collections;

import java.util.EnumSet;
import java.util.Set;

public class CollectionsEnumSet {

    // Create an Enumeration
    public enum OOPLanguages { CPP , JAVA };

    public static void main(String[] args) {

        // Create a new EnumSet with the Enumeration "OOPLanguages"
        Set<OOPLanguages> eset = EnumSet.of(OOPLanguages.CPP, OOPLanguages.JAVA);

        // Loop Through the Enumeration element by element
        for(OOPLanguages es : eset) {
            System.out.print("\t" + es);
        }
    }
}
```
