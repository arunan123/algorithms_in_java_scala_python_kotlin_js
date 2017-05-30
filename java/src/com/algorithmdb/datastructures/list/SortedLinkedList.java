package com.algorithmdb.datastructures.list;


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
 * ------------------------------------------------------------------------
 * This is an implementation of a doubly linked list where it stores the 
 * elements in the Natural sorted order. 
 * ------------------------------------------------------------------------
 * 
 * @author Arunan R
 * @date   January 17 2013
 */

public class SortedLinkedList<T>{

	private Node _parentNode = null;
	private int _size = 0;

	public void add(Comparable<T> element) {
		this.add(element, true);
	}

	public void add(Comparable<T> element, boolean flag) {
		Node tempNode = _parentNode;
		Node newNode = new Node(element);
		boolean insertFirst = true;

		if (_size == 0) {
			_parentNode = newNode;
			_size++;
			return;
		}

		while (newNode.getData().compareTo((T) tempNode.getData()) > 0) {
			insertFirst = false;
			if (tempNode.getNextPtr() != null) {
				tempNode = tempNode.getNextPtr();
			} else {
				tempNode.setNextPtr(newNode);
				newNode.setPrevPtr(tempNode);
				_size++;
				return;
			}
		}

		if (insertFirst == true) {
			tempNode.setPrevPtr(newNode);
			newNode.setNextPtr(tempNode);
			_parentNode = newNode;
			_size++;
			return;
		}
		tempNode.getPrevPtr().setNextPtr(newNode);
		newNode.setPrevPtr(tempNode.getPrevPtr());
		tempNode.setPrevPtr(newNode);
		newNode.setNextPtr(tempNode);
		_size++;
	}
//	@Override
//	public void remove(int index) {
//		
//	}
//
//	@Override
//	public void removeFirst() {
//		Node headNode = _parentNode;
//		if (headNode != null) {
//			_parentNode = headNode.getNextPtr();
//			headNode = null;
//		}
//	}
//
//	@Override
//	public void removeLast() {
//		
//	}
//
//	@Override
//	public int size() {
//		return _size;
//	}

	class Node {
		private Node nextPtr = null;
		private Node prevPtr = null;
		private Comparable<T> data = null;

		public Node(Comparable<T> element) {
			this.data = element;
		}
		public Node getNextPtr() {
			return nextPtr;
		}
		public void setNextPtr(Node nextPtr) {
			this.nextPtr = nextPtr;
		}
		public Node getPrevPtr() {
			return prevPtr;
		}
		public void setPrevPtr(Node prevPtr) {
			this.prevPtr = prevPtr;
		}
		public Comparable<T> getData() {
			return data;
		}
		public void setData(Comparable<T> data) {
			this.data = data;
		}
	}
	
	public String toString() {
		StringBuilder info = new StringBuilder();
		Node currentNode = _parentNode;
		
		if (currentNode != null) {
			do {
				info.append(currentNode.getData());

				if (currentNode.getNextPtr() != null) {
					info.append("<=>");
				}
				currentNode = currentNode.getNextPtr();

			} while (currentNode != null);
		}
		
		return info.toString();
	}
	
	public static void main(String[] args) {
		Integer[] unSortedNumbers = {50,87,5,2,1000,9,23,90,8,32,1,23,18,100,11,980};
		SortedLinkedList<Integer> list = new SortedLinkedList<Integer>();
		
		for (Integer temp : unSortedNumbers) {
			list.add(temp);
		}

		System.out.println(list);
		
		String[] unSortedStrings = {"jagan","Arunan","Albert","Vijay","stephen","Jack","Selva","Anbarasan",
		         "Richard","Venkat","Abi","Bharath","bala","Hedbert"};
		
		SortedLinkedList<String> list1 = new SortedLinkedList<String>();
		
		for (String temp : unSortedStrings) {
			list1.add(temp);
		}

		System.out.println(list1);
	}
}
