package org.algorithmdb.datastructures.list;

/**
 * Copyright [2017] [Arunan R]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * @author Arunan R
 * @date   January 17 2013
 */

public class LinkedList<T>
implements List<T>{

	private Node parentNode = null;

	public LinkedList() {
		parentNode = new Node();
		parentNode.setNextNode(null);
	}

	@Override
	public void add(T data) {
		if (parentNode != null && parentNode.getData() == null) {
			parentNode.setData(data);
		} else {
			Node lastNode = _getLastNode(parentNode);
			Node nextNode = new Node();
			nextNode.setData(data);
			nextNode.setNextNode(null);
			lastNode.setNextNode(nextNode);
		}
	}

	@Override
	public void removeFirst() {
		if (parentNode.getNextNode() != null) {
			parentNode.setData(null);
			parentNode = parentNode.getNextNode();
		} else {
			parentNode.setData(null);
		}
	}

	@Override
	public void removeLast() {
		Node currentNode = parentNode;
		Node previousNode = null;

		if (parentNode != null && parentNode.getNextNode() == null) {
			parentNode.setData(null);
			return;
		}
		for (;;) {
			if (currentNode.getNextNode() != null) {
				previousNode = currentNode;
				currentNode = currentNode.getNextNode();
			} else {
				previousNode.setNextNode(null);
				break;
			}
		}
	}

	@Override
	public void remove(int index) {
		if (index == 0) {
			if (parentNode.getNextNode() != null) {
				parentNode.setData(null);
				parentNode = parentNode.getNextNode();
			}
		} else if (index <= this.size()-1) {
			int count = 0;
			Node currNode = parentNode;

			do {
				if (currNode != null || currNode.getData() != null) {
					count++;
				}
				if (count == index) {
					Node nodeToDelete = currNode.getNextNode();
					currNode.setNextNode(nodeToDelete.getNextNode());
					nodeToDelete = null;
				}
				currNode = currNode.getNextNode();
			} while (currNode != null);
		}
	}

	// Returns the size of the list
	public int size() {

		int count = 0;
		Node currentNode = parentNode;

		do {
			count++;
			currentNode = currentNode.getNextNode();
		} while (currentNode != null); 

		return count;
	}

	public String toString() {
		Node currentNode = parentNode;
		StringBuffer buf = null;
		if (currentNode != null && currentNode.getData() != null) {
			buf = new StringBuffer();
			do {
				buf.append(currentNode.getData());
				if (currentNode.getNextNode() != null) {
					buf.append(" -> ");
				}
			} while ((currentNode = currentNode.getNextNode()) != null);
		}

		return (buf != null) ? buf.toString() : "List is empty";
	}

	public void reverse() {
		Node node1,node2 = null;
		Node node3 = parentNode;
		
		while (node3 != null) {
			node1 = node2;
			node2 = node3;
			node3 = node2.nextNode;
			node2.nextNode = node1;
		}
		
		parentNode = node2;
	}

	public void findMiddleElement() {
		Node slowPtr = parentNode;
		Node fastPtr = parentNode;
		
		while (fastPtr != null) {
			if (fastPtr.nextNode != null && fastPtr.nextNode.nextNode != null) {
				fastPtr = fastPtr.nextNode.nextNode;
			} else {
				break;
			}

			slowPtr = slowPtr.nextNode;
		}
		
		System.out.println(slowPtr.getData());
	}

	public void printReverse(Node node) {
		if (node == null) {
			return;
		} else {
			printReverse(node.nextNode);
		}
		System.out.println(node.getData());
	}

	public boolean floydCycleFinder() {
		Node currentNode = parentNode;
		Node slowPtr = parentNode;
		Node fastPtr = currentNode;
		int count = 0;

		if (currentNode != null) {
			for (;;) {

				if (fastPtr.getNextNode() == null) {
					return false;
				}
				fastPtr = fastPtr.getNextNode().getNextNode();

				if (fastPtr == null) {
					return false;
				}

				if (slowPtr == fastPtr) {
					return true;
				}
				slowPtr = slowPtr.getNextNode();

				count++;
			}
		}
		return false;
	}
	
	public Node mergeList (Node nodeA, Node nodeB) {
		Node nodeC = null;

		if (nodeA == null) return nodeB;
		if (nodeB == null) return nodeA;

		if ((Integer)nodeA.getData() <= (Integer)nodeB.getData()) {
			nodeC = nodeA;
			nodeC.setNextNode(mergeList(nodeA.getNextNode(), nodeB));
		} else {
			nodeC = nodeB;
			nodeC.setNextNode(mergeList(nodeA, nodeB.getNextNode()));
		}

		return nodeC;
	}
	
	private Node _getLastNode(Node node) {
		Node currentNode = node;

		if (currentNode != null) {
			while (currentNode.getNextNode() != null) {
				currentNode = currentNode.getNextNode();
			}
		}
		return currentNode;
	}

	public Node getParentNode() {
		return parentNode;
	}
	
	class Node {
		private Node nextNode = null;
		private T data = null;

		void setNextNode(Node node) {
			this.nextNode =node;
		}

		Node getNextNode() {
			return this.nextNode;
		}

		void setData(T data) {
			this.data = data;
		}

		T getData() {
			return this.data;
		}
	}
}
