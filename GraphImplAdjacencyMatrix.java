package datastructure;

import java.util.Scanner;

public class GraphImplAdjacencyMatrix {

	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Vertices");
		int n =  sc.nextInt();
		int[][] a = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.println("Enter the value at the edge Between ::: "+ i +"->" + j);
				a[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println(" Display the Adjancency Matrix ");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(a[i][j] != 0) {
					System.out.println(i +"->" + j + " : " + a[i][j]);
				}
				
			}
		}
		
		System.out.println( " Display the Adjancency Matrix "  );
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				
					System.out.print(a[i][j] + " ");
				
				
			}
			System.out.println();
		}
		
		
		
	}
}
