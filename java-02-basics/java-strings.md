---
YamlDesc: CONTENT-ARTICLE
Title: Java String StringBuffer StringBuilder
MetaDescription: Java Strings
MetaKeywords: Java String, StringBuffer and StringBuilder example code, tutorials
Author: Venkata Bhattaram / tinitiate.com
ContentName: strings
---

# Java Strings

## [Java String Class](string-class.html)
* Strings are a sequence of Characters
* Strings in Java is not a native type, **String Data Type** is part of **java.lang** 
* [Java String Class](string-class.html)
>


## [Java StringBuffer Class](string-buffer.html)
* **StringBuffer** Class is similar to String Class, It is used to create and 
* handle strings, The main difference between String Class and StringBuffer is 
  String Class holds fixed-length and immutable character sequence or text
  StringBuffer holds variable-length and changable character sequence or text.
* **StringBuffer** is synchronized or thread safe.
* [Java StringBuffer Class](string-buffer.html)
>


## [Java StringBuilder Class](string-builder.html)
* **StringBuilder** Class is similar to String Class, It is used to create and 
* handle strings, The main difference between String Class and StringBuilder is 
  String Class holds fixed-length and immutable character sequence or text
  StringBuilder holds variable-length and changable character sequence or text.
* **StringBuilder** is non-synchronized or not thread safe.
* [Java StringBuilder Class](string-builder.html)
>


## Java String Class vs Java StringBuffer Class vs Java StringBuilder Class
* **String Class**
* String is immutable, Any change to a Sting variable value creates a new Object.
>
* **StringBuffer Class**
* StringBuffer is mutable so they can change their values, are reflected in 
  the changed Object itself.
* StringBuffer is thread safe.
* To handle Strings in MultiThreaded applications use StringBuffer.
>
* **StringBuilder Class**
* StringBuilder is mutable so they can change their values, are reflected in 
  the changed Object itself.
* StringBuilder is **NOT** thread safe.
* StringBuilder is more efficient than StringBuffer, for Single thread 
  applications StringBuilder is a better choice.
