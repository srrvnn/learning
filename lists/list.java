/*

Use Linked List when 

1) the number of items are intially unknown. 
2) insertaions and deletions from the middle of a list are common.

The best way to implement a linked list in Java is this way: 
LinkedList list_objects = new java.util.LinkedList();

*/

public class List {

	// node object declared inside List. 

	private class Node {

		private Object data; 

		private Node next; 
		private Node prev;

		public Node(){

			this.data = null;			
			this.next = null;
			this.prev = null;
		}

		public Node(Object data, Node next, Node prev){

			this.data = data;
			this.next = next; 
			this.prev = prev;
		}

		public Object next(){

			return this.next;
		}

		public Object prev(){

			return this.prev;
		}

		public Object get(){

			return data; 
		}		

		public void set(Object data){

			this.data = data; 
		}
	}

	// data members - start node. 

	private Node head; 
	private Node tail;

	private int size; 

	List() {

		head = null;
		tail = null;
		size = 0;

	}

	// data functions - add, remove, contains, data, set, isEmpty, size. 

	public boolean add(){


	}



	// removing from a linked list in O(N)

	public boolean remove(Object data){

		// check for empty list

		if(isEmpty())
			return false;

		// start at the head

		Node parent = this.head; 
		Node current = this.head;

		// iterate through the loop

		while(current.data != data){			

			// reached the end?

			if(current.next() == null){

				return false;
			}		

			// or move forward

			parent = current;
			current = current.next();
		}

		// reposition head and tail if they are deleted

		if(current == this.head)
			this.head = current.next();

		if(current == this.tail)
			this.tail = current.next();

		// delete the node

		parent.next() = current.next();		
		delete current;

		return true;		
	}



	public boolean contains(Object data){

		Node iterator = this.head; 

		while(iterator != tail){

			if(iterator.data() == data)
				return true; 

			iterator = iterator.next();							
		}

		return false;
	}	

	public boolean isEmpty(){

		return(size==0);
	}

	public int size(){

		return this.size;
	}

	// detect loop in a linked lists 

	public boolean isLooping(){

		if(isEmpty())
			return false;

		Node tortoise = this.head;
		Node hare = this.head; 

		while(hare != null){

			tortoise = tortoise.next();
			hare = hare.next();

			if(hare == null) break;
			else hare = hare.next();

			if(tortoise == hare){

				return true;
			}
		}

		return false;
	}

	// reverse the linked list

	public boolean reverse(){

	}

	public boolean addCyclic(Node n){

		if(isEmpty()){


		}
	}

}