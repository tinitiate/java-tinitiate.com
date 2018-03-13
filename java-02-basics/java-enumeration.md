---
YamlDesc: CONTENT-ARTICLE
Title: Java Enumeration
MetaDescription: Java Enumeration
MetaKeywords: Java Enumeration example code, tutorials
Author: Venkata Bhattaram / tinitiate.com
ContentName: java-enumeration
---

# Java Enumeration
* Enumeration, List of ACCEPTABLE/VALID pre-defined constant values,
* Enum values can be assigned to a variable.
* Enumeration is implemented using
* **Java Enumeration Interface, This construct supports two methods**
*    1) boolean hasMoreElements()
*       Returns true when there are more elements to extract, else returns false
*    2) Object nextElement()
*       Returns the next object in the enumeration.
* **Enum Keyword**
*    1) Define a class type, enumerations, without instantiating using new.
*       declare enumeration variable like a primitive type.
*    2) This provides with values() and valuesOf() methods.
```
package tinitiate.java.basics;

import java.util.Enumeration;

public class JavaEnumeration {

    // Enumeration using "ENUM" keyword, Like a primitive type
    enum OceansOfWorld {Arctic, Pacfic, Atlantic, Indian, Southern};

    public static void main(String[] args) {

        // Methods of the enum class object: values() method
        OceansOfWorld allOceans[] = OceansOfWorld.values();

        for(OceansOfWorld Oceans : allOceans) {
            System.out.println(Oceans);
        }

        // Methods of the enum class object: valueOf() method
        // Passing a valid enum value to get it back, or test
        // if a given entry is a valid enumeration.
        OceanNames2 = OceansOfWorld.valueOf("Indian");
        System.out.println("Name of an Ocean is: " + OceanNames2);
    }
}
```
