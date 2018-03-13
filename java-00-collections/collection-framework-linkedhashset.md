---
YamlDesc: CONTENT-ARTICLE
Title: Java Collections Framework HashSet
MetaDescription: Java Collections Framework HashSet code examples, tutorials
MetaKeywords: Java Collections Framework HashSet, code examples, tutorials
Author: Venkata Bhattaram / tinitiate.com
ContentName: collection-framework-linkedhashset
---

# Java Collection Framework HashSet
* LinkedHashSet extends HashSet and adds no members of its own.
* LinkedHashSet Elements are maintained by a linked list in the set, remembering the order 
  in which they were inserted
* Elements are unique
* LinkedHashSet Provides ordering when used.
* LinkedHashSet does not support GET / SET methods.


## Java hashSet Example and Operations
* Samples for Methods in the code demo below
* **Add** to add elements
* **ceiling(E e)**
* Returns the least element, greater than or equal to the given element,
  returns null if there is no such element.
* **floor(E e)**
* Returns the greatest element, less than or equal to the given element, or
  null if there is no such element.
* **headSet(E toElement)**
* Returns the subset of elements that are less than toElement.
* **headSet(E toElement, boolean inclusive)**
* Returns the subset of elements that are less than (or equal to, if inclusive
  is true) toElement.
* **tailSet(E fromElement)**
* Returns the subset of elements that are greater than or equal to fromElement.
* **tailSet(E fromElement, boolean inclusive)**
* Returns the subset of elements are greater than (or equal to if inclusive
  is true) fromElement.
* **subSet(E fromElement, E toElement)**
* Returns a view of the portion of this set whose elements range from
  fromElement, inclusive, to toElement, exclusive.
* **subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)**
* Returns a view of the portion of this set whose elements range from
  fromElement to toElement.
* **pollFirst()**
* Retrieves and removes the first (lowest) element, or returns
  null if this set is empty.
* **pollLast()**
* Retrieves and removes the last (highest) element, or returns null if this
  set is empty.
* **boolean remove(Object o)**
* Removes the specified element from this set if it is present.
```
package tinitiate.java.collections;

import java.util.TreeSet;
import java.util.Iterator;

public class SETCollectionsTreeSet {

    public static void main(String[] args) {

        // Declare a TreeSet
        TreeSet<Integer> tset = new TreeSet<Integer>();

        // Adding elements to the TreeSet
        tset.add(2222);
        tset.add(4444);
        tset.add(6666);
        tset.add(8888);
        tset.add(9999);

        // Printing the elements of the TreeSet
        System.out.println("Elements of the TreeSet " + tset);

        // ceiling() Returns the least element, which is greater or equal to the
        //            given element null if there is no such element.
        System.out.println(tset.ceiling(5555));

        // floor()   Returns the greatest element, less than or equal to the
        //           given element, or null if there is no such element.
        System.out.println(tset.floor(5555));

        // headSet Sample
        System.out.println(tset.headSet(6666));

        // headSet with "inclusive" Sample
        System.out.println(tset.headSet(6666,true));

        // tailSet Sample
        System.out.println(tset.tailSet(6666));

        // tailSet with "inclusive" Sample
        System.out.println(tset.tailSet(6666,true));

        // subSet Sample
        System.out.println(tset.subSet(4444,8888));

        // subSet inclusive Sample
        System.out.println(tset.subSet(4444,false,8888,false));

        // Printing elements using Iterator
        Iterator itr = tset.iterator();
        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + "\n");
        }

        // pollFirst Sample
        tset.pollFirst();

        // pollLast  Sample
        tset.pollLast();

        //  boolean remove(Object o)
        tset.remove(6666);
    }
}
```
