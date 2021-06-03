package datastructure;

// Create Node Class
class Node{
	
	Integer data;
	Node next;
	
	Node(Integer data){
		this.data = data;
		this.next = null;
	}
}


public class LinkedList {
	
	Node head = null;
	
	public void insertData(Integer data) {
		
		Node node = new Node(data);
		
		if(head == null) {
			head = node;
		}
		
		else {
			Node temp = head;
			
			while(temp.next !=null) {
				temp = temp.next;
				
			}
			temp.next = node;
			temp = temp.next;
		}
		
	}
	
	public void display() {
		Node temp = head;
		
		if(head==null) {
			System.out.println("Empty LinkedList");
		}
		else {
			while(temp != null) {
				System.out.print(temp.data + " --> ");
				temp = temp.next;
			}
			System.out.print("null");
		}
	}
	
	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		
		ll.display();
		
		ll.insertData(11);
		ll.insertData(15);
		ll.insertData(100);
		
		ll.display();
		
		

	}

}
