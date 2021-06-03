package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


class EdgeNode{
	Integer destiny;
	Integer weight;
	
	EdgeNode(Integer destiny, Integer weight){
		this.destiny = destiny;
		this.weight = weight;
	}
}

	

public class GraphImplAdjacencyListWeight {
	
	static void addAdj(ArrayList<LinkedList<EdgeNode>> adj, Integer source) {
		Scanner sc = new Scanner(System.in);
		System.out.println("No of Node connected to Source "+ source);
		
		int v = sc.nextInt();
		for(int i =0; i<v;i++) {
			System.out.println("Enter destiny and weigh from source " +source);
			int destiny = sc.nextInt();
			int weight = sc.nextInt();
			adj.get(source).add(new EdgeNode(destiny, weight));
		}
	}
	
	static void display(ArrayList<LinkedList<EdgeNode>> adj) {
		for (int index = 0; index<adj.size();index++) {
			System.out.print(index );
			for (EdgeNode linkedList2 : adj.get(index)) {
				System.out.print("-->" + "["+ linkedList2.destiny + "-" + linkedList2.weight + "]");
			}
			System.out.println();
		}		
	}
	
		
	public static void main(String args[]) {
		
		ArrayList<LinkedList<EdgeNode>> adjList = new ArrayList<LinkedList<EdgeNode>>();
		System.out.println("Enter Number of Vertices :: ");
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		
		for(int i =0;i<v;i++) {
			adjList.add(new LinkedList<EdgeNode>());
			addAdj(adjList, i);
		}
		
		System.out.println(":: Output ::");
		display(adjList);		
		
	}
}
