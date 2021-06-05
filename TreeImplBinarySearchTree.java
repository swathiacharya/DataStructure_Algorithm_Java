package datastructure;



public class TreeImplBinarySearchTree {

	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	int totalNodeCount =0;
	
	public void insert(Node node, int data) {
		if(node.data>data) {
			if(node.left!=null) {
				insert(node.left, data);
			}
			else {
				System.out.println("Data " + data + " is inserted to left side of the tree node " + node.data);
				this.totalNodeCount +=1;
				node.left=new Node(data);
			}
		}
		else if(node.data<data) {
			if(node.right!=null) {
				insert(node.right, data);
			}
			else {
				System.out.println("Data " + data + " is inserted to right side of the tree node " + node.data);
				this.totalNodeCount +=1;
				node.right=new Node(data);
			}
		}
	}
	
	public void inorderTraversal(Node node) {
		if (node == null) {
		      return;
		  }
		else {
			inorderTraversal(node.left);
			System.out.print(node.data +" ");
			inorderTraversal(node.right);
		}
	}
	
	public void preorderTraversal(Node node) {
		if (node == null) {
		      return;
		  }
		else {
		System.out.print(node.data +" ");
		preorderTraversal(node.left);
		preorderTraversal(node.right);
		}
	}
	
	
	public void postorderTraversal(Node node) {
		if (node == null) {
		      return;
		  }
		else {
			postorderTraversal(node.left);
			postorderTraversal(node.right);
			System.out.print(node.data +" ");
		}
		
	}

	public void bfs(Node root) {
		int count =this.totalNodeCount;
		int height =0;
		while(count>=1) {
			count = count/2;
			height +=1;
		}
		
		
		for(int i=1; i<=height; i++) {
			bfsNode(root,i);
		}
	}
	
	public void bfsNode(Node node,int level) {
		if(node==null)
			return ;
		if(level == 1)
			System.out.print(node.data +" ");
		else if(level>1){
			this.bfsNode(node.left,level-1);
			this.bfsNode(node.right,level-1);
		}
	};
	
	public static void main(String[] args) {
		
		TreeImplBinarySearchTree tree =new TreeImplBinarySearchTree();
		Node root = new Node(60);
		
		
		tree.insert(root, 10);
		tree.insert(root, 70);
		tree.insert(root, 5);
		tree.insert(root, 30);
		tree.insert(root, 65);
		tree.insert(root, 80);
		
		
		System.out.println("\n"+"*".repeat(5) + " INORDER TRAVERSAL " + "*".repeat(5));
		tree.inorderTraversal(root);
		
		System.out.println("\n"+"*".repeat(5) + " POSTORDER TRAVERSAL " + "*".repeat(5));
		tree.postorderTraversal(root);
		
		
		System.out.println("\n"+"*".repeat(5) + " PREORDER TRAVERSAL " + "*".repeat(5));
		tree.preorderTraversal(root);
		
	
		System.out.println("\n"+"*".repeat(5) + " Level Order Binary Tree Traversal " + "*".repeat(5));
		tree.bfs(root);
		
	
	}

}
