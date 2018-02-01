---
YamlDesc: CONTENT-ARTICLE
Title: Java String Class
MetaDescription: Java Strings Class
MetaKeywords: Java String, StringBuffer and StringBuilder example code, tutorials
Author: Venkata Bhattaram / tinitiate.com
ContentName: string-class
---

# Java String Class
* Strings are a sequence of Characters
* Strings in Java is not a native type, **String Data Type** is part of **java.lang** 

## String Class, is immutable
* In the below example, the first code line creates a `String str` **tinitiate**
* In the second code line we string concat **.com** , here the JVM creates 
  a new String **tinitiate.com**, since there is no Object to refer this 
  value, the new String is not considered.
* The Third line still prints the **tinitiate** as the reference is not 
  changed, this proves String class is **immutable**.
```
String str = "tinitiate";
str.concat(".com");
System.out.println(str);  // Returns: tinitiate
```

## Java Character Array and Strings
```
char[] MyCharArray2 = {'T', 'E', 'S', 'T'};

// Loop Through Character Array
for (char i: MyCharArray2) {
    System.out.print(i);
}
```

## Convert Character Array to String
```
char[] MyCharArray = {'T', 'E', 'S', 'T'};
String MyString = new String(MyCharArray);
```

## Convert String to Character Array
```
// String to Char Array
String MyString = "TEST";
char[] MyCharArray = MyString.toCharArray();
for (char j: MyCharArray) {
    System.out.print(j);
}
```

## Java Escape Character
* Escape character "\" is used to to print keyword characters such
  as `SINGLE QUOTE`, `DOUBLEQUOTE`, `BACK SLASH` ..
* In java the escape character is "\"  
```
// Print Single Quote
System.out.println("\'");

// Print Double Quote
System.out.println("\"");
```

## Java Backspace Character
* Appending a string with `\b` or `\t` will remove one character from the end 
  of the string
```
System.out.println("TESTS" + "\b");
System.out.println("TESTS" + "\t");
```

## Java New Line Character
* Appending `\n` to a string will create a new line
* in the below example there will be a Line1 <newline> Line2
```
System.out.println("Line1" + "\n" + "Line 2");
```

## Java String Functions
* Print a Character at a given position
* String Positions start from 0
```
"TEST".charAt(1); 
// This will print "E"
```

## Get String Length
* Returns an integer
```
String s = "Test";
int x = s.length();
```

## Java String Comparison
* Comparing strings using the equals() method
* Comparing strings by ignoring case using equalsIgnoreCase() method
```
String src = "Demo1";
String tar = "Demo1";
if ( src.equals(tar) ) {
    System.out.println("Strings are equal"); 
} else { 
    System.out.println("Strings are not equal");
}


String src1 = "Demo1";
String tar1 = "DEmo1";
if ( src1.equalsIgnoreCase(tar1) ) {
    System.out.println("Strings ignoring case are equal"); 
} else {
    System.out.println("Strings ignoring case are NOT equal"); 
}
```

## Java String Comparison using CompareTo and compareToIgnoreCase()
* To perform a Alphabetical Order Comparision where ABC is less than XYZ as 
  XYZ is after ABC alphabetically.
```
Finding which string is greater (alphabetical) using the CompareTo() method
String s1 = "ABC";
String s2 = "XYZ";
if ( s1.compareTo(s2) > 0) {
    System.out.println("String s1: "+s1+" is greater than "+s2);
} else {
    System.out.println("String s2: "+s2+" is greater than s1"+s1);
}

// Ignoring the case finding which string is greater (alphabetical) using the compareToIgnoreCase() method
String sa1 = "EAT";
String sa2 = "eat";
if ( sa1.compareToIgnoreCase(sa2) > 0) {
    System.out.println("String sa1: "+sa1+" is greater than sa2"+sa2);
} else {
    System.out.println("String sa2: "+sa2+" is greater than sa1"+sa1);
}
```

## Java Position of a String Pattern in a given String indexOf()
```
// Finding the Position String Pattern java" in the String "I like java"
String MyString = "I like java";
String Pattern = "java";

System.out.println(MyString.indexOf(Pattern));
```

## Java Extract portion of string using substring()
* Extracting subset of string, part of string, using Substring Method
* `substring` accepts two input parameters BeginIndex and EndIndex,
  BeginIndex is included and EndIndex is excluded when 
  selecting the subset of data.
```
String s12 = "I like java";
System.out.println(s12.substring(7,11));
```

## Java Replacing characters in a string, replace() method
* Java Replacing characters in a string, replace() method
* `replace` Existing Characters with Replace Characters
```
String s = "JAVA C++";
String ExistingCharacters = "C++";
String ReplaceCharacters = "PYTHON";
System.out.println(s.replace(ExistingCharacters, ReplaceCharacters));
```

## Java Strings Convert to Uppercase Lowercase 
```
String s55 = "UPPER-lower";
System.out.println(s55.toUpperCase()); // Converts to Upper Case
System.out.println(s55.toLowerCase()); // Converts to Lower Case
```

## Java Strings startsWith and endsWith
* `startsWith` returns true if the suffix is equal to value specified
   else returns false otherwise.
* `endsWith` returns true if the suffix is equal to value specified
  else returns false otherwise.
```
String my_data = "Java is great";
if (my_data.startsWith("Java")) {
    System.out.println("TRUE");
} else {
    System.out.println("FALSE");
}


if (my_data.endsWith( "great" )) {
    System.out.println("TRUE");
} else {
    System.out.println("FALSE");
}
```


## Java String indexOf()
* indexOf, Returns the index within this string of the first occurrence
* **public int indexOf(int ch)**
*   Returns the index within this string of the first occurrence
*   of the specified character or -1 if the character does not occur.
* **public int indexOf(int ch, int fromIndex)**
*   Returns the index within this string of the first occurrence
*   of the specified character, starting the search at the
*   specified index or -1 if the character does not occur.
* **int indexOf(String str)**
*   Returns the index within this string of the first occurrence
*   of the specified substring. If it does not occur as a
*   substring, -1 is returned.
* **int indexOf(String str, int fromIndex)**
*   Returns the index within this string of the first occurrence
*   of the specified substring, starting at the specified index.
*   If it does not occur, -1 is returned.
```
String Str1 = "Welcome to Java";
String Str2 = "Java";

System.out.println(Str1.indexOf('J'));
System.out.println(Str1.indexOf('J', 4));
System.out.println(Str1.indexOf(Str2));
System.out.println(Str1.indexOf(Str2, 4));
```


## Java String trim()
* Trim(), returns string omitting leading and trailing whitespaces.
```
String StrTrim = "   Test  ";
Str.trim(); // "Test" the spaces before and after will be removed
```

# Java StringBuffer
*
```
```


# Java StringBuilder
*
```
```
