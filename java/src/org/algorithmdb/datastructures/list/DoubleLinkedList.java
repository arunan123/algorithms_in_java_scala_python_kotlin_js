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
 * @date   March 17 2013
 */

public class DoubleLinkedList<T>
implements List<T>{
	
	private Node parentNode = null;
	
	public DoubleLinkedList() {
		parentNode = new Node();
		parentNode.setNext(null);
		parentNode.setPrev(null);
	}

	@Override
	public void add(T data) {
		
		if (parentNode.getData() == null && parentNode.next == null) {
			parentNode.setData(data);
		} else {

			Node currentNode = parentNode;
			Node newNode = new Node();
			newNode.setData(data);
			
			if (currentNode != null) {
				while (currentNode.getNext() != null){
					currentNode = currentNode.getNext();
				}
				currentNode.setNext(newNode);
				newNode.setPrev(currentNode);
				newNode.setNext(null);
			}
		}
	}
	
	public Node getParentNode() {
		return parentNode;
	}
	
	public String toString() {
		StringBuilder info = new StringBuilder();
		Node currentNode = parentNode;
		
		if (currentNode != null) {
			do {
				info.append(currentNode.getData());

				if (currentNode.getNext() != null) {
					info.append("<=>");
				}
				currentNode = currentNode.getNext();

			} while (currentNode != null);
		}
		
		return info.toString();
	}

	@SuppressWarnings("unused")
	private class Node {
		Node next = null;
		Node prev = null;
		T data = null;

		private Node getNext() {
			return next;
		}
		private void setNext(Node next) {
			this.next = next;
		}
		
		private Node getPrev() {
			return prev;
		}
		private void setPrev(Node prev) {
			this.prev = prev;
		}
		private Object getData() {
			return data;
		}
		private void setData(T data) {
			this.data = data;
		}

	}

	@Override
	public void remove(int index) {
		
	}

	@Override
	public void removeFirst() {
		
	}

	@Override
	public void removeLast() {
		
	}

	@Override
	public int size() {
		return 0;
	}
}
