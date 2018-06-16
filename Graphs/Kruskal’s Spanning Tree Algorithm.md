# Kruskal’s Spanning Tree Algorithm
Kruskal's algorithm is a minimum-spanning-tree algorithm which finds an edge of the least possible weight that connects any two nodes. A spanning tree is a graph that does not have loops, and reaches all nodes. It has N-1 edges. A root is the first edge that you add, the common edge to other nodes. If the next node has a different parent than the current node, connect them with an edge. If the next node has the same root as the current node, do not add the edge into the tree because it will form a loop. A set is collection of nodes that are connected.\
Steps for using Kruskal's algorithm to find the Minumum Spanning Tree(MST):
1. Sort all the edges from smallest ot largest based on their weight.
2. Pick the edge with the smallest value. Check if it forms a cycle with the spanning tree formed so far, if it does not, add it to the MST.
3. Repeat step #2 until there are (V-1) edges in the MST.
## Implementation
Edge objects are used to store the beginning vertex(bv), end vertex(ev) and cost of the edge.\
The class must implement Comparable<Edge>, so that the .compareTo method can be used to sort the edges based on weight.\
A method is created to find the parent of a node, if they do not share a parent then that edge will not form a cycle, so another method will join the parents after that edge has been added to the MST.
```java
import java.util.*;
public class Graph {
	//Data Members of a Graph: Vertices, Edges
	public int V; //how many vertices
	public int E; //how many edges
	Edge [] edge; //use E to initialize an array of edges(size = E)
	Edge[] mst; //array to store minimum spanning tree edges
	int parent[];
	//Edge has beginning vertex, ending vertex, and cost information.
	//A class to represent a graph edge
	public class Edge implements Comparable<Edge> //<-- only use that when edges are unsorted
	{
		int bv, ev, cost;
		// Comparator function used for sorting edges 
		//compare one edge to another edge, based on their cost
		@Override
		public int compareTo(Edge compareEdge)
		{
			return this.cost-compareEdge.cost;
		}
	}
	//Constructor
	public Graph(int v, int e ) {
		V = v;
		E = e;
		edge = new Edge[E];
		for (int i = 0;i<E;i++) {
			edge[i] = new Edge();
		}
		mst = new Edge[V-1];
		for (int i=0; i<V-1; i++) {
			mst[i] = new Edge();
		}
		parent = new int[V];
		for (int i=0; i<V; i++) {
			parent[i] = -1;
		}
	}
	//method used to find parent of a vertex
	public int find(int v) {
		if (parent[v]==-1) {
			return v;
		} else {
			return find(parent[v]);
		}
	}
	//method used to join the roots of 2 vertexes 
	public void union(int pb, int pe) {
		parent[pb] = pe;
	}
	//main function to use Kruskal
	public static void main(String[] args) {
		//create a Graph object
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt() ; 
		int E = sc.nextInt();
		Graph graph = new Graph(V,E);
		for (int i=0; i<E; i++) {
			graph.edge[i].bv = sc.nextInt();
			graph.edge[i].ev = sc.nextInt();
			graph.edge[i].cost = sc.nextInt();
		}
		Arrays.sort(graph.edge);
		int j = 0;
		for (int i=0; i<E; i++) {
			int bv = graph.edge[i].bv;
			int ev = graph.edge[i].ev;
			int pb = graph.find(bv); //beginning vertex parent
			int pe = graph.find(ev); //ending vertex parent
			if (pb!=pe) { //if the points do not share a parent, add it to mst
				graph.mst[j].bv = bv;
				graph.mst[j].ev = ev;
				graph.mst[j].cost = graph.edge[i].cost;
				graph.union(pb, pe); //join the vertex parents
				j++;
				if (j==V-1) {
					break;
				}
			}
		}
		for (int i=0; i<V-1; i++) {
			System.out.print(graph.mst[i].bv +" ");
			System.out.print(graph.mst[i].ev +" ");
			System.out.println(graph.mst[i].cost +" ");
		}
	}
}
```
