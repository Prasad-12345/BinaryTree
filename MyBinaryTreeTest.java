package BinarySearchTree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MyBinaryTreeTest {
	/*
	 * Ability to create the BST by adding 56 and then adding 30 & 70
	 */
	@Test
	public void given3NumbersWhenAddedToBinaryTreeShouldReturnSizeThree() {
		//object
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		//calling add method
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		//calling get size method
		int size = myBinaryTree.getSize();
		//test condition
		Assert.assertEquals(3, size);
	}
	
	/*
	 * Ability to create binary tree
	 */
	@Test
	public void given13NumbersWhenAddedToBinaryTreeShouldReturnSizeThirteen() {
		//object
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		//calling add method
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(60);
		myBinaryTree.add(40);
		myBinaryTree.add(95);
		myBinaryTree.add(65);
		myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		int size = myBinaryTree.getSize();
		//Test condition
		Assert.assertEquals(13, size);	
	}
	
	/*
	 * Ability to search 63 in binary tree
	 */
	@Test
	public void search63InBinaryTree() {
		//object
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		//calling add method
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(60);
		myBinaryTree.add(40);
		myBinaryTree.add(95);
		myBinaryTree.add(65);
		myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		
		boolean result = myBinaryTree.searchTree(63);
		//test condition
		Assert.assertTrue(result);
	}
}