package dataStructures;

public class BinaryTreeApp {
	public static void main (String args[]){
		BinaryTree tree = new BinaryTree();
		tree.insert(2);
		tree.insert(3);
		tree.insert(1);
		tree.insert(5);
		tree.insert(4);
		tree.insert(7);
		tree.insert(6);
		tree.displayInOrder(tree.root);
		System.out.println("");
		tree.displayPreOrder(tree.root);
		System.out.println("");
		tree.displayPostOrder(tree.root);
	}

}
