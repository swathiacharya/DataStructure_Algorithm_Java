package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class GraphTraversalDFS {
	
	Scanner sc = new  Scanner(System.in);
	ArrayList<LinkedList<Integer>> adj = new ArrayList<LinkedList<Integer>>();
	ArrayList<Boolean> visited = new ArrayList<Boolean>();
	
	
	void addEdge(Integer source) {
		System.out.println("Enter the Connected Edge from the Source " + source);
		int n = sc.nextInt();
		for(int i =0 ; i<n; i++) {
			System.out.println("Enter the Destiny Edge Connected by " + source);
			int destiny = sc.nextInt();
			this.adj.get(source).add(destiny);
		}
	}
	
	public void DFAOperation(Integer vertex) {
		this.visited.set(vertex, true);
		System.out.print(vertex + " ");
		for(int i=0; i< this.adj.get(vertex).size(); i++) {
			
			Integer neighbor = this.adj.get(vertex).get(i);
			
			if(!this.visited.get(neighbor)) {
				this.DFAOperation(neighbor);
			}
		}
	}
	
	
	
	public void display() {
		for(int i =0; i<this.adj.size();i++) {
			System.out.print(i +"->");
			for(int j=0; j<this.adj.get(i).size();j++) {
				System.out.print(this.adj.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}

	
	
	public static void main(String[] args) {	
		
		GraphTraversalDFS graph = new GraphTraversalDFS();
		System.out.println("--- Enter the Number of Vertices ---");
		int vertices = graph.sc.nextInt();
		
		for(int i =0 ; i<vertices; i++) {
			graph.adj.add(new LinkedList<Integer>());
			graph.visited.add(false);
			graph.addEdge(i);
		}
		
		
		graph.display();
		System.out.println("DFA");
		while(true) {
			System.out.println("--- Enter the Starting Node For DFS ---");
			int node = graph.sc.nextInt();
			
			for(int i =0 ; i<vertices; i++) {
				graph.visited.set(i, false);				
			}
			
			graph.DFAOperation(node);

			System.out.println("\nTO Continue Press 1");
			int con = graph.sc.nextInt();
			if(con!=1) {
				break;
			}
		}

	}

}
