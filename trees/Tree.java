/*

Use a Tree when

1. Data Objects have hierarchical relationships
2. Look up is the most common operation. 

The best way to implement a tree is java is to write one. 

*/

public class Tree {

	public class Node {

		public Object data;

		public Node left;
		public Node right;
	}

	private Node root; 

	Tree() {

		root = null;
	}

	// data functions: insert, remove, delete, isbalanced, balance, mirror

	// function to insert a record in the binary search tree 

	public boolean insert(Node n) {

		Node currentNode = null;
		Node parentNode = null;

		currentNode = root; 
		parentNode = root;

		// if tree is empty add new node as the root

		if (currentNode == null) {

			root = n;
			return true;
		}		

		// else find the right spot to add it

		while (currentNode != null) {

			parentNode = currentNode; 

			if (currentNode.data <= n.data) {

				currentNode = currentNode.right;

				if (currentNode == null) {

					parentNode.right = n;
				}

			} else { 

				currentNode = currentNode.left;

				if (currentNode == null) {

					parentNode.left = n;
				}
			}	
		}
	}

}