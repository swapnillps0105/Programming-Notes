# Breadth First Search
Breadth First Search (BFS) is an algorithm for traversing or searching tree or graph data structures. It can begin at the tree root or any node on a graph, and explores the neighbor nodes first, before moving to the next level neighbors. BFS is used frequently in programming competitions to find the shortest path from one point on a graph to another.\
**Step 1:** Create a map of the graph.
**Step 2:** Create a stepValue array the same size as the map to store the step value of each node. FIrst set all elements to Integer.MAX_VALUE, meaning that no position has been visited yet, but set the beginning node's stepValue to 0.\
**Step 3:** Create a queue and add the first node's coordinates into it.\
**Step 4:** Remove a node from the queue and based on restrictions for valid moves, visit the adjacent nodes that have a larger step value than the current node's step value+1. Increase the next node's stepValue to the stepValue of the current node+1. Insert the next node into the queue.\
**Step 5:** Repeat Step 4 until the queue is empty, and the step value of the destination node will be the shortest path from the beginning node to the destination node.
## Implementation
BFS is often used with 2D Arrays that act as a map of the graph.\
Given a 5x5 map where:\
```O``` is open space (you can pass through these)\
```X``` is wall (you can't pass through these)\
What is the shortest amount of steps that it takes to move from the top left corner to the bottom right corner(you can only move in 4 directions: up, down, left, right)?\
**_Try it yourself first_**
### Input
```
OXOOO
OOOXO
OXOXO
OXOOO
OOOXO
```
## Output
```8```
## Explanation
The shortest path from the top left corner (row=0,col=0) to the bottom right corner(row=4,col=4) is 8 steps, displayed by the symbol ```*``` marked on the map below:
```
OXOOO
***XO
OX*XO
OX***
OOOX*
```
### Code
```java
import java.util.LinkedList;
import java.util.Scanner;
public class BFS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Step 1: declare and initialize the 5x5 map 2D array
		char[][] map = new char[5][5];
		for (int row = 0;row<5;row++) {
			map[row] = sc.nextLine().toCharArray();
		}
		//Step 2: 
		//create a 5x5 int 2D array called step, used to keep track of the number of steps it takes to reach each element on the map from the beginning element
		int[][] step = new int[5][5];
		//initialize the step array, and set the step value of every element to Integer.MAX_VALUE meaning that no elements has been visited yet
		for (int row = 0;row<5;row++) {
			for (int col = 0;col<5;col++) {
				step[row][col] = Integer.MAX_VALUE;
			}
		}
		//Set the step value of the beginning element in the top right corner(row=0,col=0) to 0
		step[0][0] = 0;
		//Step 3:
		//create 2 queues, one for row number and another for column number
		LinkedList<Integer> rowQ = new LinkedList<Integer>();
		LinkedList<Integer> colQ = new LinkedList<Integer>();
		//add the first element into the queues
		rowQ.add(0);
		colQ.add(0);
		//Step 4-5:
		//loop until one of the queues are empty
		while (!rowQ.isEmpty()) {
			//remove a element from the queues
			int row = rowQ.poll();
			int col = colQ.poll();
			/* The following if statements check the requirements:
			 * 	1. if the adjacent elements are within the 5x5 map boundary
			 * 	2. the adjacent elements are not 'X' (a wall)
			 * 	3. the step value of the adjacent element is larger then the
			 * current element's step value+1.
			 * If all of those conditions are met, the coordinates of the
			 * adjacent element is added to the queue, and its step value is set
			 * to the current element's step value+1
			 */
			//One col to the right of the current element must be <5 in order to remain in the map
			if (col+1<5 && map[row][col+1]!='X'  && step[row][col+1]>step[row][col]+1) {
				step[row][col+1] = step[row][col]+1;
				rowQ.add(row);
				colQ.add(col+1);
			}
			//One col to the left of the current element must be >=0 in order to remain in the map
			if (col-1>=0 && map[row][col-1]!='X'  && step[row][col-1]>step[row][col]+1) {
				step[row][col-1] = step[row][col]+1;
				rowQ.add(row);
				colQ.add(col-1);
			}
			if (row+1<5 && map[row+1][col]!='X'  && step[row+1][col]>step[row][col]+1) {
				step[row+1][col] = step[row][col]+1;
				rowQ.add(row+1);
				colQ.add(col);
			}
			if (row-1>=0 && map[row-1][col]!='X' && step[row-1][col]>step[row][col]+1) {
				step[row-1][col] = step[row][col]+1;
				rowQ.add(row-1);
				colQ.add(col);
			}
		}
		//Final Step: output the shortest path to the bottom right corner(row=4,col=4)
		int shortestPath = step[4][4];
		//if the step value of an element is still Integer.MAX_VALUE, it means that it has not been visited
		if (shortestPath==Integer.MAX_VALUE) {		
			System.out.println("The bottom right corner could not be reached");
		} else {
			System.out.println(shortestPath);
		}
	}
}
```