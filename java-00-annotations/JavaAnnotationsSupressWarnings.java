// >---
// >YamlDesc: CONTENT-ARTICLE
// >Title: Java SuppressWarnings Annotation
// >MetaDescription: java annotations @SuppressWarnings
// >MetaKeywords: java annotations SuppressWarnings example code, tutorials
// >Author: Venkata Bhattaram / tinitiate.com
// >ContentName: suppresswarnings-annotation
// >---

// >## JAVA SUPPRESSWARNINGS Annotation
// >* @Suppresswarnings, Annotation will tell the compiler to NOT raise warnings
// >  when methods or other class members are called

// >```
package tinitiate.java.annotations;

public class JavaAnnotationsSupressWarnings {

    // Created a Deprecated Method, Using a "@Deprecated" Annotation 
    @Deprecated
    public void DontUseMethod() {
        
    }
    
    // Use the "SuppressWarnings" Annotation to make sure the "@Deprecated" 
    // Doesnt raise a warning
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // Call the Deprecated Method "DontUseMethod()"
        JavaAnnotationsSupressWarnings Obj = new JavaAnnotationsSupressWarnings();
        Obj. DontUseMethod();
    }
}
// >```
