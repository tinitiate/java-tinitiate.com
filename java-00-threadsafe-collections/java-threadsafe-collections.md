---
YamlDesc: CONTENT-ARTICLE
Title: Java Collections Framework threadsafe 
MetaDescription: Java threadsafe collections Stack, Properties, Vector, Hashtable, BlockingQueue, ConcurrentMap, ConcurrentNavigableMap
MetaKeywords: Java threadsafe collections Stack, Properties, Vector, Hashtable, BlockingQueue, ConcurrentMap, ConcurrentNavigableMap
Author: Venkata Bhattaram / tinitiate.com
ContentName: threadsafe-collections
---

# Java Thread Safe Collections
* Collections hold multiple data elements and values, In a multithreaded 
  application, a single collection being shared or used across threads might 
  result in inconsistant results. 
* Synchronised Collections are Thread Safe., Below are a few Thread Safe 
  Collections.

## [Java Thread Safe Stack](threadsafe-stack.html)
* Stack implements **List** Interface.
* Java Stack data structure provides a Last In First Out (LIFO) mechanism
* Elements are added or PUSH into the STACK at **top of the stack**,
  and elements removal or POP is also from the top.
* This executes the Last In First Out (LIFO).
* Stack is synchronised and hence its Thread Safe

### Java Thread Safe Hashtable
* Hashtable is a key/value pair data structure. The key is hashed, and the 
  hash code is used as the index to identify the **value**
* Hashtable can be considered as a synchronised HashMap.

### Java Thread Safe Properties
* Properties a subclass of Hashtable, is another implementation of a Key/value 
  pair datastructure.
* Properties class supports a **Default Property** or a Default "Value" in the 
  Key/VALUE pair of data, that will be returned for values not associated with
  any key.
* Java Properties Multiple is thread safe it is synchronised.

### Java Thread Safe Vector
* Vector is similar to Array List, but with key difference of Vector being 
  part of legacy and Vector is synchronized.
* Vector supports Enumeration and Iterator to traverse its elements.

### Java Thread Safe BlockingQueue
* The `Java BlockingQueue` is a Thread Safe `Queue` That is synchronised.

### Java Thread Safe ConcurrentMap
* ConcurrentMap is a thread-safe implementations of Map.
