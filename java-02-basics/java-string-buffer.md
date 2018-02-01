---
YamlDesc: CONTENT-ARTICLE
Title: Java StringBuffer
MetaDescription: Java StringBuffer
MetaKeywords: Java StringBuffer example code, tutorials
Author: Venkata Bhattaram / tinitiate.com
ContentName: string-buffer
---

# Java StringBuffer Class
* **StringBuffer** Class is similar to String Class, It is used to create and 
* handle strings, The main difference between String Class and StringBuffer is 
  String Class holds fixed-length and immutable character sequence or text
  StringBuffer holds variable-length and changable character sequence or text.
* **StringBuffer** is synchronized or thread safe.
```
// StringBuffer
StringBuffer sb = new StringBuffer("TINITIATE.COM");
System.out.println(sb);  // Returns: TINITIATE.COM
```


## StringBuffer append(Text) Method
* **Append()** Append(add to end) text to given string
```
StringBuffer sb1 = new StringBuffer("TINITIATE.COM");
sb1.append(" tutorials website.");
System.out.println(sb1);  // Returns: TINITIATE.COM tutorials website.
```


## StringBuffer insert(IndexPosition, Text) Method
* **insert()** Insert text at given position in the given string,
 index starts from "0"
```
StringBuffer sb2 = new StringBuffer("TINITIATE.COM");
sb2.insert(0, "WWW.");
System.out.println(sb2);  // Returns: WWW.TINITIATE.COM
```


## StringBuffer replace(StartIndex, EndIndex ) Method
* replace(**replace()** Replace test inside a StringBuffer String, 
  Between the specified start index and end index 
  [Doesnt Include the End Index Position]
```
StringBuffer sb3 = new StringBuffer("TINITIATE.COM");
sb3.replace(9,11," <> ");
System.out.println(sb3);  // Returns: TINITIATE <> OM
```


## StringBuffer delete() Method
* **delete()** Delete text in a StringBuffer String, Between the  
 specified start index and end index [Doesnt Include the End Index Position]
```
StringBuffer sb4=new StringBuffer("TINITIATE.COM");
sb4.delete(9,14);
System.out.println(sb4); // returns: TINITIATE
```


## StringBuffer deleteCharAt() Method
* **deleteCharAt()** deletes character at the specified index
```
sb4.deleteCharAt(7);
System.out.println(sb4); // returns: TINITIAE
```


## StringBuffer reverse() Method
* **reverse()** reverses the characters in the StringBuffer text
```
StringBuffer sb5=new StringBuffer("TINITIATE.COM");
sb5.reverse();
System.out.println(sb5); // returns: MOC.ETAITINIT
```
