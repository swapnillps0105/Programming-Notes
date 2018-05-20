# 1D Arrays and Arrays Class
Arrays are a type of data structure that stores a fixed-size sequential collection of elements of the same type. Cells in array follow index position (first cell is at index 0, second cell at index 1, etc. up to: array.length - 1)\
```Format: type [] name = new type[size];```\
To put something in a cell in the array use:\
```arrayName[cellindex] = value;```\
You can get the length of an array using:\
```arrayName.length```
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
Use method Arrays.sort(arrayname); to sort array values from smallest to largest or in alphabetical order. 
```java
Array.sort(A); 
```
Use method Arrays.equals(array1,array2); to check if two arrays of the same type are equal.
 ```java
Array.equals(char[] A,char[] B); 
```
For the full list of methods visit the Oracle site [here](https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html).