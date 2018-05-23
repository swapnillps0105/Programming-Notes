# Adjacency List
An Adjacency List is a 1D array, that has the same number of of elements as nodes in a graph. Each element in the array is an ArrayList object, which is used instead of a 2D array used to minimize space, as ArrayList is dynamic, so will use less space compared to a 2D array. However, using an AdjacencyList is slower than 2D array, so you should use a 2D array if speed is an issue. The index of the 1D array represents the beginning vertex of the edge, and the ArrayList stores Edge objects which contain the ending vertex of the edge and the weight of the edge.\
## Implementation
Adjacency Lists are used to store the edges of the graph(by storing their starting and ending vertex) and their weights so they can easily be accessed and manipulated.
```java 
import java.util.ArrayList;
public class Adjacency_List {
	//the edge objects will store the ending vertex of the edge and its weight, since the beginning vertex is stored as the index of the array.
	public static class Edge {
		int ev; 
		int weight;
		public Edge(int ev, int weight) {
			this.ev = ev;
			this.weight = weight;
		}
	}
	public static void main(String[] args) {
			int N = 100;
			ArrayList<Edge>[] adjList = new ArrayList[N];//create an AdjacencyList array [] that can hold edges connecting N nodes.
			for (int i = 0;i<N;i++) {
				adjList[i] = new ArrayList<Edge>(); //initialize the ArrayLists
			}
			//the adjList index refers to the beginning vertex of the edge
			/*When adding an edge into the AdjacencyList, you must add them at 
			both the vertex value of the beginning node and end node, since 
			they both can be the beginning node or the end node.
			*/
			//Add an edge between vertex 99 and vertex 1, with a weight of 2
			adjList[1].add(new Edge(99, 2));
			adjList[99].add(new Edge(1, 2));
			//You can access the ending vertex of the edge and its weight by using:
			int endVertex = adjList[1].ev;//the endVertex from vertex 1 is vertex 99
			int edgeWeight = adjList[1].weight;//the weight of that edge is 2

	}
}
```
