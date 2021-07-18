package org.algorithmdb.datastructures.map;

import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class BinarySearchTreeMap<K extends Comparable , V> implements OrderedMap<K, V>{

	Node root;
	
	private class Node<K, V> {

		K key;
		V value;
		Node leftNode;
		Node rightNode;		
	
		public Node(K key, V value) {
			this.key = key;
			this.value = value;
		}
		public K getKey() {
			return key;
		}
		public void setKey(K key) {
			this.key = key;
		}
		public V getValue() {
			return value;
		}
		public void setValue(V value) {
			this.value = value;
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
	
	@Override
	public void put(K key, V value) {
		root = put (key, value, root, null);
	}
	
	public Node put(K key, V value,Node tempRoot, Integer i) {
		if (tempRoot == null) {
			return new Node(key, value);
		}
		int cmp = key.compareTo((K) tempRoot.getKey());
		if (cmp < 0) {
			tempRoot.leftNode = put(key, value, tempRoot.getLeftNode(), null);
		} else if (cmp > 0) {
			tempRoot.rightNode = put(key,value, tempRoot.getRightNode(), null);
		} 
		return tempRoot;
	}

	@Override
	public V get(K key) {
		return get(key, root);
	}

	public V get(K key, Node node) {
		if (node == null) {
			return null;
		}
		int cmp = key.compareTo((K) node.getKey());
		if (cmp <0) {
			return (V) get(key, node.getLeftNode());
		} else if (cmp > 0) {
			return (V) get(key, node.getRightNode());
		}
		return (V) node.getValue();
	}

	@Override
	public boolean contains(K key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void delete(K key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void inorderTraversal(Node node) {
		if (node != null) {
			//Process the Node here. I am just printing the value
			System.out.println(node.key);
			inorderTraversal(node.leftNode);
			inorderTraversal(node.rightNode);
		}
	}
	
	public void inorderTraversalNonRecursive(Node node) {
		if (node != null) {
			Stack<Node> stack = new Stack<>();
			while(true) {
				while (node != null) {
					//Process the Node here. I am just printing the value
					System.out.println(node.key);
					stack.push(node);
					node = node.leftNode;
				}
				if(stack.isEmpty()) {
					break;
				}
				Node temp = stack.pop();
				node = temp.rightNode;
			}
			return;
		}
	}
	
	public void levelOrderTraversal(Node node) {
		if (node == null) {
			return;
		}
		ArrayBlockingQueue<Node> queue = new ArrayBlockingQueue<>(10);
		
		queue.offer(node);
		
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			System.out.println(temp.getKey());
			if (temp.leftNode != null) {
				queue.offer(temp.leftNode);
			}
			if(temp.rightNode != null) {
				queue.offer(temp.rightNode);
			}
		}
	}
	/**
	 * This method is to find the maximum key and return it.
	 * Right most node is the maximum key.
	 * @return Maximum key
	 */	
	public K findMaxKey() {
		return this.findMaxKey(root);
	}

	private K findMaxKey(Node node) {
		if (node.getRightNode() == null) {
			return (K)node.getKey();
		}
		return (K) findMaxKey(node.getRightNode());
	}
	
	public K searchInBinaryTree(K key) {
		return this.searchInBinaryTree(root, key);
	}
	
	public K searchInBinaryTree(Node node, K key) {
		
		if (node == null) {
			return null;
		}
		if (key.compareTo((K)node.key) == 0) {
			return key;
		}
		if (node.getLeftNode() != null) {
			return (K) searchInBinaryTree(node.getLeftNode(), key);
		}
		if (node.getRightNode() != null) {
			return (K) searchInBinaryTree(node.getRightNode(), key);
		}
		return null;
	}
	
	public static void main(String...args) {
		BinarySearchTreeMap<Integer, String> tree = new BinarySearchTreeMap<>();
		tree.put(5, "Arunan");
		tree.put(7, "Ramanathan");
		tree.put(3, "Pavalakkodi");
		tree.put(1, "abinaya");
		tree.put(4, "Idhaya");
		tree.put(11, "kamatchi");
		tree.put(6, "ezhil");
	
		System.out.println("inserted");

		System.out.println(tree.findMaxKey());
		
		System.out.println(tree.searchInBinaryTree(4));
		//System.out.println("get 1: "+ tree.get(1));
		//System.out.println("get 7: "+ tree.get(7));
		//System.out.println("get 11: "+ tree.get(11));
	}
}
