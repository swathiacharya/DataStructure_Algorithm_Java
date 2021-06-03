package datastructure;

import java.util.ArrayList;
import java.util.Scanner;

public class GraphImplAdjacencyList {

	
	public static void addEdgeUnDirectedGraph(ArrayList<ArrayList<Integer> > adj,int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	
	public static void displayValue(ArrayList<ArrayList<Integer>> adj) {
		
		for(int i=0; i<adj.size(); i++) {
			System.out.print(i + "-> ");
			for(int j=0;j<adj.get(i).size(); j++) {
				System.out.print(adj.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
		
		int vertices = sc.nextInt();
		
		for(int i =0; i<vertices; i++) {
			adjList.add(new ArrayList<Integer>());
		}
		
		addEdgeUnDirectedGraph(adjList, 0, 1);
		addEdgeUnDirectedGraph(adjList, 0, 2);
		addEdgeUnDirectedGraph(adjList, 1, 2);
		
		
		displayValue(adjList);
		
	}
}
