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
}
