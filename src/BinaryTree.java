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
     if(focusNode.data <= key) {

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
     }else {
    	System.out.println("Data has not been found! ");
     }
     return null;
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
            
            
            
            System.out.println("Please enter the number you want tosearch in the tree: ");
            Scanner searchNum = new Scanner(System.in);
            Scanner Word = new Scanner(System.in);
            String inputWord = Word.nextLine();
            int inputNum = 0;
            int outputNum = 0;
            boolean run = true;
            
        	inputNum = searchNum.nextInt();
        	
        	while(run == true) {
        		
        		if(inputNum == 0) {
        	        System.out.println(theTree.findNode(inputNum));
                    System.out.println("\nNode with the key ");
            		System.out.println("\n \nPlease search another number or type finish to end the search: ");
            		outputNum++;
        		}else {
        			System.out.println("Please put a number again: ");
        			inputNum = 0;
        		}
        		if(inputWord.equals("Finish") || inputWord.equals("Finish")) {
        			System.out.println("\n \n \n Search has been finish, the times of the searchs " + outputNum);
        			outputNum = 0;
        			inputNum = 0;
        			run = false;
        			searchNum.close();
        			Word.close();
        		}
        	}


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