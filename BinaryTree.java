package dataStructures;

public class BinaryTree {
	//declara o node
	public static Node root;
	
	//declare constructor
	
	public BinaryTree(){
		this.root = null;
	}
	
	public void insert(int data){
		Node newNode = new Node(data);
		
		//check if tree is empty
		
		if(root == null){
			root = newNode;
			return;
		}
		
		Node current = root;
		Node parent = null;
		
		while(true){
			parent = current;
			
			if(data < current.data)
				current = current.left;
			
			if(current == null){
				parent.left = newNode;
				return;
			}else{
				current = current.right;
				if(current == null){
					parent.right = newNode;
					return;
				}
			}
		}
	}

	//smaller is displayed
	public void displayInOrder(Node root){
		if(root!=null){ 
			displayInOrder(root.left); 
			System.out.print(" " + root.data); 
			displayInOrder(root.right); 
			} 
	}
	
	//root is the first to be displayed
	public void displayPreOrder(Node root){
		if(root!=null){ 
			System.out.print(" " + root.data); 
			displayPreOrder(root.left); 
			displayPreOrder(root.right); 
			} 
	}
	
	//root is the last to be displayed
	public void displayPostOrder(Node root){
		if(root!=null){ 
			displayPostOrder(root.left); 
			displayPostOrder(root.right);
			System.out.print(" " + root.data); 
			} 
	}

}
