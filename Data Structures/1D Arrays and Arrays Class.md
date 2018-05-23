# 1D Arrays and Arrays Class
Arrays are a type of data structure that stores a fixed-size sequential collection of elements of the same type. Cells in arrays follow index position (first cell is at index 0, second cell at index 1, etc. Up to: array.length - 1)\
**Declaration and Instantiation Format:** ```type[] identifier = new type[size];```\
**Initialization Format:** ```arrayName[cellindex] = value;```\
**Declaration, Instantiation and Initialization Format:** ```type[] identifier = {element1, element2, etc.};```
You can get the length of an array using: ```arrayName.length```\
Note:
* when boolean arrays are instantiated, all elements are initialized to ```false```.
* when char arrays are instantiated, all elements are initialized to null character '\u0000' (whose decimal equivalent is 0).
* when numeric datatypes arrays are instantiated, all elements are initialized to ```0```(long,int,short, and byte) or ```0.0```(float and double).
* when reference datatypes (String, LinkedList, etc.) arrays are instantiated, all elements are initialized to ```null```.
## Implementation
Creating an array named A that can hold 7 integer elements:
```java
int[] A = new int[7];
```
Assigning a value to the first element of array A:
```java
A [0] = 362;
```
# Arrays Class
The Arrays class contains various methods for manipulating arrays (such as sorting and searching). Must import java.util.Arrays in order to use the Arrays class.
## Implementation
Use method Arrays.sort(arrayIdentifier); to sort array values from smallest to largest or in alphabetical order. 
```java
Array.sort(A); 
```
Use method Arrays.equals(array1,array2); to check if two arrays of the same type are equal. It will return ```true``` if the arrays are equal, and ```false``` if they are not.
 ```java
Array.equals(char[] A,char[] B); 
```
For the full list of methods and more details visit the Oracle site [here](https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html).