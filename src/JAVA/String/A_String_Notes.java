package JAVA.String;

public class A_String_Notes {
    /*
    String >>
   - A String in Java is an object that represents a sequence of characters
   - is a predefined calss in java.
   - String is a final and immutable class

1.Is String a primitive data type in Java? Why or why not?
>>No, String is not a primitive data type. It is an object. Java treats String as a class that has many methods
 for manipulating strings. String objects are created and manipulated like any other objects.

2.What is the difference between String, StringBuilder, and StringBuffer?
>>String: Immutable, thread-safe, and slower when there are frequent modifications.
StringBuilder: Mutable, not thread-safe, faster for use in single-threaded environments.
StringBuffer: Mutable, thread-safe due to synchronization, but slightly slower than StringBuilder.

3.What is the String Pool in Java?
>>The String Pool is a special area in the heap memory where Java stores string literals. When a string is
created using a literal, Java checks the pool to see if an identical string already exists; if so, it returns
the reference, otherwise, it creates a new one.


4. Explain the difference between StringBuilder and StringBuffer. Which one would you use in a multi-threaded
 environment and why?
>>StringBuilder is faster but not thread-safe, while StringBuffer is thread-safe due to its synchronized
 methods. In a multi-threaded environment, you should use StringBuffer to ensure data consistency.


    */

}
