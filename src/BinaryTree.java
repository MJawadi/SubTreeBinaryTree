import java.util.Scanner;

public class BinaryTree {
	
	Node root;

	public void addNode(int key, String name) {
     
		Node newNode = new Node(key, name);
		
		if (root == null) {
			root = newNode;

		} else {

			Node focusNode = root;
			
			Node parent;
			
			while (true) {
            
				parent = focusNode;
				
				if (key < focusNode.data) {
					
					
					focusNode = focusNode.left;

					if (focusNode == null) {
                    
						parent.left = newNode;
						return; // All Done

					}
				} else { // If we get here put the node on the right

					focusNode = focusNode.right;
					
					if (focusNode == null) {

                        
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}



    public Node findNode(int key) {

    // Start at the top of the tree

     Node focusNode = root;

    // While we haven't found the Node

    // keep looking

     while (focusNode.data != key) {

        // If we should search to the left

        if (key < focusNode.data ) {

            // Shift the focus Node to the left child

            focusNode = focusNode.left;

        } else {

            // Shift the focus Node to the right child

            focusNode = focusNode.right;

        // The node wasn't found

        if (focusNode == null)

            return null;
        }
     }

     return focusNode;
    }
    
    public static void main(String[] args) {
    	
    	/*
    	boolean endSearch = false;
    	int numberOfSearch;
    	System.out.println("Insert the number to search: ");
        Scanner input = new Scanner(System.in);
        String searchWord = input.nextLine();
        Scanner search = new Scanner(System.in);
        int searchNum;
    	*/
            BinaryTree theTree = new BinaryTree();
            theTree.addNode(50, "Boss");
            theTree.addNode(25, "Vice President");
            theTree.addNode(15, "Office Manager");
            theTree.addNode(30, "Secretary");
            theTree.addNode(75, "Sales Manager");
            theTree.addNode(85, "Salesman 1");
            // Different ways to traverse binary trees
            // theTree.inOrderTraverseTree(theTree.root);
            // theTree.preorderTraverseTree(theTree.root);
            // theTree.postOrderTraverseTree(theTree.root);

            // Find the node with key 75
            
            /*
            while(endSearch == false) {
            	
            	if ()
            }
            */

            System.out.println("\nNode with the key ");

            System.out.println(theTree.findNode(50));

    }

    
}
        


class Node {
	int data;
	String name;
	
	Node left;
    Node right;
    
    Node(int key, String call) {
    	
    	this.data = key;
    	this.name = call;
    }
	public String toString() {
		return name + " has key " + data;
	}
	
}