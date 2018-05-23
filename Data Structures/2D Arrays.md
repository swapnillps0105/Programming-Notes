# 2D Arrays
2D Arrays are a type of data structure made up of [1D Arrays](https://github.com/danielzyy/Programming-Notes/blob/master/Data%20Structures/1D%20Arrays%20and%20Arrays%20Class.md) that stores a fixed-size collection of elements of the same type in a table with row and column based index. Rows and columns follow index position (first row is 0, second row is 1 etc.) and increase from top to bottom and left to right, respectively.\
**Declaration and Instantiation Format:** ```type[][] identifier = new type[numOfRows][numOfColumns];```\
**Initialization Format:**
* (one element at a time) ```2DArrayName[row][col] = value;```
* (one row at a time) ```2DArrayName[row] = 1DArrayName;```

**Declaration, Instantiation and Initialization Format:** ```type[][] identifier = {{row1Element1, row1Element2},{row2Element1, row2Element2}, etc.};```
## Implementation
You can easily visit and initialize all elements in a 2D array that has 4 rows and 5 columns using 2 nested for loops that loop through the row and column values of the 2D array.
```java 
int[][] A = new int[4][5];
for (int row = 0;row < 4;row++) { //Outer loop controls rows
	for (int col = 0;col < 5;col++) { //Inner loop controls columns (loops can be reversed depending on what the question asks for)
		A[row][col] = Integer.MAX_VALUE; //Sets all elements of the 2D array to Integer.MAX_VALUE
	}
}
```
