package com.simpli.LinkedList;

import javax.xml.crypto.Data;

public class DoublyLinkedList {

	Node head;
	static class Node{
		int data;
		Node next, prev;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		newNode.prev = null;
		if(head != null)
			head.prev = newNode;
		head = newNode;
	}
	
	public void append(int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		
		Node last = head;
		if(head == null) {
			newNode.prev = null;
			head = newNode;
			return;
		}
		while(last.next != null) {
			last = last.next;
			last.next = newNode;
			newNode.prev = last;
		}
	}
	
	public void insertAfter(Node prev , int data) {
		if(prev == null) {
			System.out.println("The given node cannot be null");
			return;
		}
		Node newNode = new Node(data);
		newNode.next = prev.next;
		prev.next = newNode;
		newNode.prev = prev;
		
		if(newNode != null)
			newNode.prev = newNode;
	}
	
	public void printlist(Node node) {
		
		Node last = null;
		System.out.println("traversal in forward direction");
		while(node !=  null) {
			System.out.println(node.data+" ");
			last = node;
			node = node.next;
		}
		System.out.println();
		System.out.println("traversal in reverse direction");
		while(last!=null) {
			System.out.println(last.data+" ");
			last = last.prev;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	DoublyLinkedList d = new DoublyLinkedList();
	d.append(10);
	d.append(20);
	d.append(30);
	d.push(60);;
	d.printlist(d.head);
	d.insertAfter(d.head.next,100);
	d.printlist(d.head);

	}

}
