package BinarySearchTree;
/*
 * Author:Prasad
 * Ability to create the BST 
 */
public class MyBinaryTree<K extends Comparable<K>> {
	private MyBinaryNode<K> root;
	
	//This method internally calls addRecursively method
	public void add(K key) {
		this.root = this.addRecursively(root,key);
	}
	
	/*
	 * This method will add key to node based on compareResult value
	 */
	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if (current == null) {
			return  new MyBinaryNode<>(key);
		}
		int compareResult = key.compareTo(current.key);
		if(compareResult == 0) return current;
		if(compareResult < 0) {
			current.left = addRecursively(current.left, key);
		}
		else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}
	
	/*
	 * This method internally calls get size recursive method
	 */
	public int getSize() {
		return this.getSizeRecursive(root);
	}

	/*
	 * This method returns the size of tree
	 */
	private int getSizeRecursive(MyBinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursive(current.left) 
									+ this.getSizeRecursive(current.right);
	}	
	
	/*
	 * This method will search entered value in tree
	 */
	public boolean searchTreeRecursively(MyBinaryNode<K> current, K key) {
		if(current == null) {
			return false;
		}
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0) {
			return true;
		}
		else {
			return compareResult < 0 ? searchTreeRecursively(current.left, key) : searchTreeRecursively(current.right, key);
		}
	}
	
	public boolean  searchTree(K key) {
		return this.searchTreeRecursively(root, key);
	}
}
