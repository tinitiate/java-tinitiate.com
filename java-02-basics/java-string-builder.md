---
YamlDesc: CONTENT-ARTICLE
Title: Java StringBuilder
MetaDescription: Java StringBuilder
MetaKeywords: Java StringBuilder example code, tutorials
Author: Venkata Bhattaram / tinitiate.com
ContentName: string-builder
---

# Java StringBuilder Class
* **StringBuilder** Class is similar to String Class, It is used to create and 
* handle strings, The main difference between String Class and StringBuilder is 
  String Class holds fixed-length and immutable character sequence or text
  StringBuilder holds variable-length and changable character sequence or text.
* **StringBuilder** is non-synchronized or not thread safe.
```
// StringBuilder
StringBuilder sb = new StringBuilder("TINITIATE.COM");
System.out.println(sb);  // Returns: TINITIATE.COM
```


## StringBuilder append(Text) Method
* **Append()** Append(add to end) text to given string
```
StringBuilder sb1 = new StringBuilder("TINITIATE.COM");
sb1.append(" tutorials website.");
System.out.println(sb1);  // Returns: TINITIATE.COM tutorials website.
```


## StringBuilder insert(IndexPosition, Text) Method
* **insert()** Insert text at given position in the given string,
 index starts from "0"
```
StringBuilder sb2 = new StringBuilder("TINITIATE.COM");
sb2.insert(0, "WWW.");
System.out.println(sb2);  // Returns: WWW.TINITIATE.COM
```


## StringBuilder replace(StartIndex, EndIndex ) Method
* replace(**replace()** Replace test inside a StringBuilder String, 
  Between the specified start index and end index 
  [Doesnt Include the End Index Position]
```
StringBuilder sb3 = new StringBuilder("TINITIATE.COM");
sb3.replace(9,11," <> ");
System.out.println(sb3);  // Returns: TINITIATE <> OM
```


## StringBuilder delete() Method
* **delete()** Delete text in a StringBuilder String, Between the  
 specified start index and end index [Doesnt Include the End Index Position]
```
StringBuilder sb4=new StringBuilder("TINITIATE.COM");
sb4.delete(9,14);
System.out.println(sb4); // returns: TINITIATE
```


## StringBuilder deleteCharAt() Method
* **deleteCharAt()** deletes character at the specified index
```
sb4.deleteCharAt(7);
System.out.println(sb4); // returns: TINITIAE
```


## StringBuilder reverse() Method
* **reverse()** reverses the characters in the StringBuilder text
```
StringBuilder sb5=new StringBuilder("TINITIATE.COM");
sb5.reverse();
System.out.println(sb5); // returns: MOC.ETAITINIT
```
