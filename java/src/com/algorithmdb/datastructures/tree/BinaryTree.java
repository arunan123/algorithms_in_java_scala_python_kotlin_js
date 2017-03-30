package com.algorithmdb.datastructures.tree;

import java.util.concurrent.ArrayBlockingQueue;

public class BinaryTree<K extends Comparable<K>,V> implements Tree {

	Node root;

	private class Node<K, V> {

		K key;
		Node leftNode;
		Node rightNode;		
	
		public Node(K key) {
			this.key = key;
		}
		public K getKey() {
			return key;
		}
		public void setKey(K key) {
			this.key = key;
		}
		public Node getLeftNode() {
			return leftNode;
		}
		public void setLeftNode(Node leftNode) {
			this.leftNode = leftNode;
		}
		public Node getRightNode() {
			return rightNode;
		}
		public void setRightNode(Node rightNode) {
			this.rightNode = rightNode;
		}
	}
	
	public K findMaxKey() {
		return this.findMaxKey(root);
	}
	// finding max key with recursion
	private K findMaxKey(Node node) {

		K max = null;

		if(node != null) {

			K leftNode = null;

			if (node.getLeftNode() != null) {
				leftNode = findMaxKey(node.getLeftNode());
			}

			K rightNode = null;

			if(node.getRightNode() != null) {
				rightNode = findMaxKey(node.getRightNode());
			}
			if (leftNode != null) {
				if((leftNode).compareTo(((K)(node.getKey()))) > 0) {
					if (leftNode.compareTo((K)rightNode) > 0) {
						max = leftNode;
						return max;
					}
				} 
			}
			if (rightNode != null) {
				if (rightNode.compareTo(((K)(node.getKey()))) > 0) {
					if (rightNode.compareTo((K)leftNode) > 0) {
						max = rightNode;
						return max;
					}
				}
			}
			if(max == null) {
				max = (K)node.getKey();
				return max;
			}
		}
		return max;
	}
	
	//Find max key without recursion
	public K findMaxKeyBinaryTree() {
		return findMaxKeyBinaryTree(root);
	}
	
	private K findMaxKeyBinaryTree(Node node) {
		
		if (node == null)
			return null;
		
		K max = (K)node.key;
		
		ArrayBlockingQueue<Node> queue = new ArrayBlockingQueue<>(20);
		queue.offer(node);
		
		while (!queue.isEmpty()) {
			Node temp = queue.poll();
			
			if(max.compareTo((K)temp.key) > 0) {
				max = max;
			} else {
				max = (K) temp.key;
			}
			
			if (temp.leftNode != null) {
				queue.offer(temp.leftNode);
			}
			if (temp.rightNode != null) {
				queue.offer(temp.rightNode);
			}
		}
		
		return max;
	}
	
	@Override
	public void put(Object key, Object value) {
		
	}

	@Override
	public Object get(Object key) {
		return null;
	}

	@Override
	public boolean contains(Object key) {
		return false;
	}

	@Override
	public void delete(Object key) {
		
	}

	@Override
	public int size() {
		return 0;
	}

}
