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



    public Node findNode(int key, String word) {

    // Start at the top of the tree

     Node focusNode = root;

    // While we haven't found the Node

    // keep looking

     while ((focusNode.data != key) || (focusNode.name == word)) {

        // If we should search to the left

        if (key < focusNode.data || focusNode.name == word ) {

            // Shift the focus Node to the left child

            focusNode = focusNode.left;

        } else {

            // Shift the focus Node to the right child

            focusNode = focusNode.right;

        // The node wasn't found

        if (focusNode == null || focusNode.name != word)

            return null;
        }
     }

     return focusNode;
    }
    
    public static void main(String[] args) {
    	
    	boolean endSearch = false;
    	int numberOfSearch;
        Scanner input = new Scanner(System.in);
        String searchWord = input.nextLine();
        int searchNum;
    	
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
            
            while(endSearch == false) {
            	
            	theTree.findNode(key, word);
            	if(searchWord == findNode.name ) {
            		
            	}
            	
            	
            }

            System.out.println("\nNode with the key ");

            //System.out.println(theTree.findNode(75));

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
		return name + "has key " + data;
	}
	
}