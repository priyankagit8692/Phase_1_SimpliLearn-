package com.simpli.LinkedList;

public class CircularLinkedList {

	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	
	void sortInsert(int data) {
		//create new node
		Node newNode = new Node(data);
		Node current = head;
		
		//If its first element, make it head
		if(current == null) {
			newNode.next = newNode;
			head = newNode;
		}else if(current.data >= newNode.data) {
			while(current.next != head) {
				current = current.next;
			}
			current.next = newNode;
			newNode.next = head;
			head = newNode; 
		}
		else {
			while(current.next != head && current.next.data < newNode.data) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
		
	}
	
	public void printList() {
		if(head != null) {
			Node temp = head;
			do {
				System.out.print(temp.data+ " ");
				temp = temp.next;
			}while(temp != head);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {50,10,20,2,6};
		CircularLinkedList circular = new CircularLinkedList();
		for(int element : arr) {
			circular.sortInsert(element);
		}
		circular.printList();
		

	}

}
