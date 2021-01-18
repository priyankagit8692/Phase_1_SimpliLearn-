package com.simpli.LinkedList;

import java.awt.HeadlessException;

public class SinglyLinkedList {

	Node head = null;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	/**
	 * This method insert new Node in the list
	 * 
	 * @param linkesList
	 * @param data,new   value to be inserted in the list
	 * @return linkedlist
	 */

	public static SinglyLinkedList insert(SinglyLinkedList linkesList, int data) {
		Node newNode = new Node(data);
		newNode.next = null;

		// if it is first element , make this new node as head element
		if (linkesList.head == null)
			linkesList.head = newNode;
		else {
			// traverse till the last node and then insert this new node
			Node last = linkesList.head;
			while (last.next != null) {
				last = last.next;
			}
			// insert the new node at the last
			last.next = newNode;

		}
		return linkesList;
	}

	/**
	 * This method removes the elemt from the list
	 * 
	 * @param linkedList
	 * @param dataToBeRemoved
	 * @return
	 */
	public static SinglyLinkedList remove(SinglyLinkedList linkedList, int dataToBeRemoved) {

		Node currentNode = linkedList.head;
		Node previous = null;
		// 1. If data to be deleted is the head elemet
		if (currentNode != null && currentNode.data == dataToBeRemoved) {
			linkedList.head = currentNode.next;
			System.out.println("removed data :" + dataToBeRemoved);
		}
		// 2. If it is any other node other than head
		while (currentNode != null && currentNode.data != dataToBeRemoved) {
			previous = currentNode;
			currentNode = currentNode.next;
		}
		// If data is found, it should be current node
		if (currentNode != null) {
			previous = currentNode;
			previous.next = currentNode.next;
			System.out.println(dataToBeRemoved + " removed");
		} else {
			System.out.println("not found");
		}
		return linkedList;

	}

	public static void print(SinglyLinkedList linkedList) {
		Node currentNode = linkedList.head;
		System.out.println("Printing data of linked list.........");
		while(currentNode != null) {
			System.out.println(currentNode.data+" ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SinglyLinkedList list = new SinglyLinkedList();
		insert(list,10);
		insert(list,20);
		insert(list,30);
		insert(list,40);
		print(list);
		remove(list, 10);
		print(list);
		remove(list, 30);
		print(list);
		
		
	}

}
