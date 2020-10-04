# Stack
Stack is a data structure and class in Java that is similar to LinkedList, that may only store one type of datatype, but it follows a specific order which is described as Last In First Out(LIFO) which means that the item inserted into the stack last will be the first one to be removed from the stack.
Before you use it, you must first import the LinkedList class from java.util at the top of your code using : ```java import java.util.Stack;```
**Declaration and Instantiation Format:** ```Stack<type> name = new Stack<type>();```\
Some useful Stack methods:
1. Object push(Object element): Pushes an item onto the top of the stack.
2. Object pop(): Removes and returns the object at the top of the stack.
3. boolean contains(Object element) : It returns true if the element is present in the stack.
4. Object get(int index) : It returns the element at the position ‘index’ in the stack. It throws ‘IndexOutOfBoundsException’ if the index is out of range of the list.
5. int indexOf(Object element) : If element is found, it returns the index of the first occurrence of the element. Else, it returns -1.
6. Object remove(int index) : It removes the element at the position ‘index’ in this list. It throws ‘NoSuchElementException’ if the list is empty.
7. int size() : It returns the number of elements in the stack.
8. void clear() : It removes all of the elements from the stack.\
For the full list of methods and more details visit the [Oracle site](https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html).
## Implementation
The Stack methods can be called by using the ```.``` operator followed by the method after the reference variable
```java 
Stack<String> nameStack = new Stack<String>();
nameStack.push("Andy");
nameStack.push("Bob");
nameStack.push("Carol");

nameStack.pop();	// removing the top element "Carol", new top element becomes "Bob"
nameStack.pop();	// removing the following top element "Bob"
```
