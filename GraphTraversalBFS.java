package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphTraversalBFS {
	private ArrayList<LinkedList<Integer>> adjList = new ArrayList<LinkedList<Integer>>();
	private Queue<Integer> queue = new LinkedList<Integer>();
	private ArrayList<Boolean> visited = new ArrayList<Boolean>();
	
	
	public void addEdge(int u, int v) {
		this.adjList.get(u).add(v);
	}
	
	public void bfsOperation() {
		if(!this.queue.isEmpty()) {
			
			int printValue = this.queue.remove();
			
			if(!this.visited.get(printValue)) {
				
				this.visited.set(printValue, true);
				System.out.print(printValue + " ");	
				
				for (int i = 0; i < this.adjList.get(printValue).size(); i++) {
					int destiny =this.adjList.get(printValue).get(i);
					
					if(!this.visited.get(destiny)) {
						this.queue.add(destiny);
					}
				}			
				this.bfsOperation();
			}
		}
	}
	
	public void bfs(int source) {
		for (int i = 0; i < 4; i++) {
			this.visited.set(i,false);
			this.queue.clear();
		}
			this.queue.add(source);
			this.bfsOperation();
	}
	
	
	public void display() {
		for(int i = 0; i<this.adjList.size();i++) {
			System.out.print(i + "->");
			for(int j =0; j<this.adjList.get(i).size(); j++) {
				System.out.print(this.adjList.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GraphTraversalBFS graph = new GraphTraversalBFS();
		
		for (int i = 0; i < 4; i++) {
			graph.adjList.add(new LinkedList<Integer>());
			graph.visited.add(false);
		}
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 0);
		graph.addEdge(3, 0);
		graph.addEdge(3, 2);
		
		
		graph.display();
		

		System.out.println();
		graph.bfs(0);
		System.out.println();
		graph.bfs(1);
		System.out.println();
		graph.bfs(2);
		System.out.println();
		graph.bfs(3);

	}

}
