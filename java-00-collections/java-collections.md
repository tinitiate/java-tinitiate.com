---
YamlDesc: CONTENT-ARTICLE
Title: Java Collections Framework comparable, comparator, HashSet, LinkedHashSet, TreeSet, ArrayList, LinkedList, Vector, Stack, PriorityQueue, ArrayDeque, Hashtable, LinkedHashMap, HashMap, TreeMap
MetaDescription: Java Collections Framework comparable, comparator, HashSet, LinkedHashSet, TreeSet, ArrayList, LinkedList, Vector, Stack, PriorityQueue, ArrayDeque, Hashtable, LinkedHashMap, HashMap, TreeMap code examples, tutorials
MetaKeywords: Java Collections Framework comparable, comparator, HashSet, LinkedHashSet, TreeSet, ArrayList, LinkedList, Vector, Stack, PriorityQueue, ArrayDeque, Hashtable, LinkedHashMap, HashMap, TreeMap, code examples, tutorials
Author: Venkata Bhattaram / tinitiate.com
ContentName: collections-framework
---

# Java Collections Framework
* Java Collections Framework is a collection of **INTERFACES** **IMPLEMENTATION CLASSES** and **ALGORITHMS**
  that are used to Create Objects of Complex DataStructures.
* These data structures provide deatures such as data insertion, modification,
  deletion, searching, sorting.
* The collection framework members offer high-performance and provide high 
  degree of interoperability.
* The `java.util` package contains all the interfaces and their classes
  implementations of the Collection framework.
* In the **COLLECTION FRAMEWORK** There are TWO main `interfaces` **COLLECTION**
  and **MAP**

* **INTERFACE: COLLECTION**
 * **INTERFACE: LIST**
 *     - `CLASS: ArrayList`
 *     - `CLASS: LinkedList`
 *     - `CLASS: Vector`
 *     - `CLASS: Stack`
 
 * **INTERFACE: SET**
 *     - `CLASS: HashSet`
 *     - `CLASS: LinkedHashSet`
 *     - `CLASS: TreeSet`
 
 * **INTERFACE: QUEUE**
 *     - `CLASS: PriorityQueue`
 *     - `CLASS: ArrayDeque`
 
 * **INTERFACE: MAP**
 *     - `CLASS: Hashtable`
 *     - `CLASS: LinkedHashMap`
 *     - `CLASS: HashMap`
 *     - `CLASS: TreeMap`
 *     - `CLASS: EnumMap`

* **Advantage of the Collections Framework:**
* Providing an efficient method of implementation and ease of usage.
* Unified architecture, Categorized by various collection types.
* Convenient and consistent approach for coding collections by providing 
* Standard set of interfaces and classes, Methods to handle collection data
  for search, sort, iterate ..
* Offers numerous specific implementations of the interfaces, Allowing the
  developer to use optimal approach for application development.
>

## [Java Collection Framework: ArrayList](collection-framework-arraylist.html)
* **List** is a collection of ordered elements, It may have duplicates.
* **ArrayList** is an implementations of **list Interface**
>

## [Java Collection Framework: LinkedList](collection-framework-linkedlist.html)
* Java LinkedList class uses doubly linked list to store the elements.
* Doubly linked list is a data structure that links sequentially records called 
  nodes. Each node contains THREE ASPECTS, TWO links referencing previous node 
  and next node, And the Third aspect **DATA**, The Data could span across 
  multiple Nodes.
>

## [Java Collection Framework: Vector](collection-framework-vector.html)
* Vector is similar to Array List, but with key difference of Vector being 
  part of legacy and Vector is synchronized.
>

## [Java Collection Framework: Stack](collection-framework-stack.html)
* Java Stack data structure provides a Last In First Out (LIFO) mechanism
* Elements are added or PUSH into the STACK at **top of the stack**,
  and elements removal or POP is also from the top.
>

## [Java Collection Framework: HashSet](collection-framework-hashset.html)
* HashSet extends `AbstractSet` and Implements `Set` Interface
* Does not guarantee ordering.
* HashSet permits null elements.
* Iteration is linear in the sum of the number of entries buckets (the capacity).
>

## [Java Collection Framework: LinkedHashSet](collection-framework-linkedhashset.html)
* LinkedHashSet extends HashSet and adds no members of its own.
* LinkedHashSet Elements are maintained by a linked list in the set, remembering the order 
  in which they were inserted
>

## [Java Collection Framework: TreeSet](collection-framework-treeset.html)
* TreeSet extends AbstractSet and implements the NavigableSet interface.
* It creates a collection that uses a tree for storage.
>

## [Java Collection Framework: HashSet](collection-framework-enumset.html)
* Java EnumSet class is the implementation of Set Interface and inherits 
  AbstractSet class.
* All of the members of an ENUM set must be of the same ENUM type.
>

## [Java Collection Framework: PriorityQueue](collection-framework-priorityqueue.html)
* PriorityQueue Implements **Queue Interface** elements are added to end of the 
  queue and removed from start of the Queue.
  orders the element in FIFO(First In First Out) manner.
* Queue works on the principle **FIFO First In First Out**, Where the first 
  added element is removed first and last added element is removed at last.
>

## [Java Collection Framework: ArrayDeque](collection-framework-arraydeque.html)
* Deque is a special Queue where elements can be added or removed from both 
  sides of teh Queue.
* ArrayDeque size can be increased as needed.
* Deque ArrayDeque cannot have **null** elements
>

## [Java Collection Framework: LinkedHashMap](collection-framework-linkedhashmap.html)
* Java LinkedHashMap class is implementation Map interface and inherits HashMap
* Data is stored as key-value pair, Data Load order is maintained.
* Only unique Keys are permitted.
>

## [Java Collection Framework: HashMap](collection-framework-hashmap.html)
* Java HashMap class implements the map interface, inherits AbstractMap class.
* Java HashMap class is a data structure that stores data as a key value pair.
* Java HashMap data elements are always unique.
>

## [Java Collection Framework: TreeMap](collection-framework-treemap.html)
* Maps are key-value pairs of data, creating maps stored in a tree structure.
* TreeMap class extends AbstractMap and implements the NavigableMap interface.
* Efficient means of storing and provides quick retrieval.
* TreeMap stores its elements in ascending key order.
>

## [Java Collection Framework: TreeMap](collection-framework-enummap.html)
* Java EnumMap class inherits Enum and AbstractMap classes.
* EnumMap class is a member of the Java Collections Framework & is not 
  synchronized.
* EnumMap is ordered collection and data load order of keys is maintained
* All EnumMap keys must be derived from a single enum type.
* EnumMap null key are not permitted, but null values are permitted.
>

## [Java Collection Framework: Hashtable](collection-framework-hashtable.html)
* Hashtable stores key - value pair data, where the Key identifies the Data Element
* It can only contains unique keys, and key and value cannot be null.
* Tt is synchronized and is thread safe.
>

## [Java Collection Framework: Comparator](collection-comparator-interface.html)
* Comparator provides multiple element based Sorting 
* Comparator  modify the original class i.e. actual class is not modified.
* Using Comparator doesn't modifiy the actual class, i.e. no changes to the 
  Natural Order elements for sorting.
>

## [Java Collection Framework: Comparable](collection-framework-comparable.html)
* Comparable Interface compareTo Collections.sort
* Java Comparable interface [ from java.lang package ] sorts the objects of a
  user-defined class. The method `compareTo` of `the Comparable Interface`
  must be implemented.
>

