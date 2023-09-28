package sorting;

public class TreeSort {
	
	class Node{
		int key;
		Node left, right;
		
		public Node(int item) {
			key = item;
			left = right= null;
			
		}
	}
	
	
	Node root;
	
	
	TreeSort(){
		root = null;
	}
	void insert(int key) {
		root = insertRec(root, key);
	}
	
	Node insertRec(Node root, int key) {
		
		if(root == null) {
			root = new Node(key);
			return root;
		}
		
		if(key < root.key) {
			root.left = insertRec(root.left, key);
		}
		else if(key > root.key) {
			root.right = insertRec(root.right, key);
		}
		
		return root;
	}
	
	public static void inorderRec(Node root) {
		if(root != null) {
			inorderRec(root.left);
			System.out.print(root.key + " ");
			inorderRec(root.right);
		}
	}
	
	public static void treeins(int arr[]) {
		for(int i = 0; i < arr.length; i++){
			//insert(arr[i]);
		}
	}
	
	
}
