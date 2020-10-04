# Linked List
LinkedList is a class and a data structure, similar to a 1D array, that can store only one type of datatype, but different in the way that it can have a variable-size, allowing you to easily add and remove elements from the list. However, if you are given a fixed number of elements in a question, it is better to use an array, because they are faster than LinkedLists. Elements in a LinkedList follow index position (first row is 0, second row is 1 etc.) and increase from left to right.\
Before you use it, you must first import the LinkedList class from java.util at the top of your code using : ```import java.util.LinkedList;```\
**Declaration and Instantiation Format:** ```LinkedList<type> name = new LinkedList<type>();```\
Some useful LinkedList methods:
1. boolean add(Object element) : It appends the element to the end of the list.
2. void add(int index, Object element): It inserts the element at the position ‘index’ in the list.
3. void addFirst(Object element) : It inserts the element at the beginning of the list.
4. void addLast(Object element) : It appends the element at the end of the list.
5. boolean contains(Object element) : It returns true if the element is present in the list.
6. Object get(int index) : It returns the element at the position ‘index’ in the list. It throws ‘IndexOutOfBoundsException’ if the index is out of range of the list.
7. int indexOf(Object element) : If element is found, it returns the index of the first occurrence of the element. Else, it returns -1.
8. Object remove(int index) : It removes the element at the position ‘index’ in this list. It throws ‘NoSuchElementException’ if the list is empty.
9. int size() : It returns the number of elements in the list.
10. void clear() : It removes all of the elements from the list.\
For the full list of methods and more details visit the [Oracle site](https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html).
## Implementation
The LinkedList methods can be called by using the ```.``` operator followed by the method after the reference variable. For example, this is how you would declare and initialize a LinkedList called 'nameList' and use the .add() method to add an element to that list.
```java
LinkedList<String> nameList = new LinkedList<String>();
nameList.add("Dan");
```
