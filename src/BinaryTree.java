import java.util.List;
import java.util.Scanner;

import treeSumme.Node;

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
	
	/*
	public Object findName(String call) {
		Object result = null;
		int low = 0;
		int high = a.length - 1;
		
		while((low <= high) && (result == null)) {
			int mid =(low + high) / 2;
			int cmp = a[mid].getLastName().compareTo(call);
			
			if(cmp == 0) {
				result = a[mid];
			}else if (cmp < 0) {
				low = mid +1;
			}else {
				high = mid - 1;
			}
		}
		return result;
	}
	*/
	
	/*
	public Node finedName(String call) {
		Node on = root;
		boolean leftWings = true;
		boolean rightWings = true;
		while(on.name != call) {
			System.out.println("SHitt");
			if(on.name != call ) {
				on = on.left;
				if(on.left == null) {
					on = on.right;
				}
				if(on == null) {
					return null;
				}
			}
		}
		return on;
	}
	*/
	
	
	

	List<Node> search(String name, Node selected) {

		if (selected != null) {
			if(selected.name.equals(name)) {
				
			}
			List<Node> left = search(name,selected.left);
			List<Node> right = search(name,selected.right);
			return todo;
		} else {
			return todo;
		}
	}


    public Node findNode(int key) {

    // Start at the top of the tree
     Node focusNode = root;

    // While we haven't found the Node
    // keep looking
     if(focusNode.data < key || focusNode.data > key) {

      while (focusNode.data != key) {

        // If we should search to the left
        if (key < focusNode.data ) {
            // Shift the focus Node to the left child
            focusNode = focusNode.left;
            if (focusNode == null)
                return null;
        } else {
            // Shift the focus Node to the right child
            focusNode = focusNode.right;
        // The node wasn't found
        if (focusNode == null)
            return null;
        }
      }
     }
     return focusNode;
    }
    
    public static void main(String[] args) {

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
            Scanner searchNum = new Scanner(System.in);
            Scanner Word = new Scanner(System.in);
            String inputWord;
            int inputNum = 0;
            int outputNum = 0;
            
        	
        	while(true) {
                System.out.println("Please enter the number you want to search in the tree: ");
            	inputNum = searchNum.nextInt();
        		if(inputNum != 0) {
                    System.out.println("\nNode with the key ");
        	        System.out.println(theTree.findNode(inputNum));
        	        outputNum++;
        		}else {
        			System.out.println("Please put a number again: y/n ");
        			inputNum = 0;
        		}
        		/*
        		inputWord = Word.nextLine();
        		if(inputWord.equals("y") || inputWord.equals("Y")) {
        			System.out.println("\n \n \n Search has been finish, the times of the searchs " + outputNum);
        			outputNum = 0;
        			inputNum = 0;
        			run = false;
        			searchNum.close();
        			Word.close();
        		}
        		
        	}
            */    

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