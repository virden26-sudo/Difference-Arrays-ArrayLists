# Difference-Arrays-ArrayLists

A small Java console project demonstrating the differences between arrays and `ArrayList`.

## Compile and run

From this directory, run:

```text
javac -d out src/main/java/DifferenceArraysArrayLists.java
java -cp out DifferenceArraysArrayLists
```

## Discussion: Arrays and ArrayLists in Java

An array in Java stores a set number of values of one declared component type. Its length is chosen when the array is created and cannot change afterward. Elements are read or replaced by their index, and the array exposes its length through the `length` field. Arrays can store primitive values such as `int` directly, which makes them a straightforward choice when the number of elements is known and will stay fixed. If more room is needed, the program must create another array and copy the original values into it (Oracle, n.d.).

`ArrayList` is a resizable implementation of Java's `List` interface. It stores objects, and generics let the programmer specify the element type, such as `ArrayList<Integer>`. The list can grow or shrink as elements are added or removed. It provides methods including `add`, `get`, `set`, and `remove`, and uses `size()` to report the current number of elements (Oracle, 2025).

Conceptually, both structures let a program keep an ordered group of same-type data and access items by position. The key difference is how their size and operations are managed: an array has a fixed length and uses built-in syntax, while an `ArrayList` manages a changeable collection through methods. For example, adding an item to an array requires creating a larger array and copying values; adding an item to an `ArrayList` uses `add()`. Arrays can contain primitives, but an `ArrayList` uses reference types, so primitive values use wrapper classes such as `Integer`. I would choose an array for a known, stable number of values and an `ArrayList` when the collection needs to change during the program.

## References

Oracle. (n.d.). *Arrays*. The Java Tutorials. https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html

Oracle. (2025). *ArrayList (Java SE 25 & JDK 25)*. https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/ArrayList.html


