# Dijkstra’s Shortest Path Algorithm
Dijkstra’s Shortest Path Algorithm is used to find the shortest path from one node to another, usually used in a weighted graph. The difference from BFS is that BFS has no priority, while Dijkstra's algorithm depends on the weight of the edges. You use Dijkstra when you need to find a shortest path, but you have edge weights between point A and point B.
\
Steps for using Dijkstra's algorithm to find the shortest path between two nodes:
1. Create a stepValue array and set all values to MAX_VALUE except first node
2. Create a boolean array that indicates if a node has been processed or not
3. Loop N(number of nodes) times, and nest another loop inside that loops N times to store the current minimum stepValue, and process the index of the node with smallest stepValue(weight). (This can also be done using a PriorityQueue)
4. Process the node: Loop again N times and see if neighbours have not been processed, and that their stepValue is greater than the stepValue of the current node being processed + weight of the edge connecting it to its neighbour. If both conditions are met, changed the processing node's stepValue to the stepValue[index]+weight of the edge connecting index and its neighbour. Then set the original index to true in the processed array.
5. Repeat step 4-5 until all nodes have been processed.
Therefore, the stepValue of the final destination will be the sum of the least weighted edges, which is the shortest path/distance to that node.
 ## Implementation
Edge objects are used to store the beginning vertex(bv), end vertex(ev) and cost of the edge.\
The class must implement Comparable<Edge>, so that the .compareTo method can be used to sort the edges based on weight.\
A method is created to find the parent of a node, if they do not share a parent, another method will join the parents.
```java
import java.util.*;

public class Djikstra {
	
	public static class Edge {
		int ev;
		int cost;
		public Edge (int ev, int cost) {
			this.ev = ev;
			this.cost = cost;
		}
	}
	public static class Node implements Comparable<Node> {
		int v;
		int step;
		public Node(int v, int step) {
			this.v = v;
			this.step = step;
		}
		//compareTo function used for PriorityQueue
		@Override
		public int compareTo(Node compareNode) {
			return this.step-compareNode.step;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
		int beginningNode = sc.nextInt();
		int endNode = sc.nextInt();
		//create an AdjacencyList to store the edges of graph
		ArrayList<Edge>[] map  = new ArrayList[V];
		for(int i = 0; i<V; i++) 
			map[i] = new ArrayList<Edge>();
		//Bidirectional edges
		for (int i = 0;i<E;i++) {
			int bv = sc.nextInt();
			int ev = sc.nextInt();
			int cost = sc.nextInt();
			map[bv].add(new Edge(ev,cost));
			map[ev].add(new Edge(bv,cost));
		}
		//Create a stepArray, and fill with Integer.MAX_VALUE
		int[] step = new int[V];
		Arrays.fill(step, Integer.MAX_VALUE);
		//Set beginning node's stepValue to 0
		step[beginningNode] = 0;
		//PriorityQueue to store the processing order
		PriorityQueue<Node> queue = new PriorityQueue<Node>(); 
		//Add the first node into queue
		queue.add(new Node(beginningNode, step[beginningNode]));
		while(!queue.isEmpty()) {
			Node current = queue.poll();
			//find the neighbor
			ArrayList<Edge> neighbor = map[current.v];
			for (int i = 0;i<neighbor.size();i++) {
				Edge e = neighbor.get(i);
				//check if neighbor step is larger than your step + edge cost
				if (step[e.ev]>step[current.v]+e.cost) {
					step[e.ev] = step[current.v]+e.cost;
					//add neighbor to queue
					queue.add(new Node(e.ev, step[e.ev]));
				}
			}
		}
		System.out.println(step[endNode]);
	}

}
```