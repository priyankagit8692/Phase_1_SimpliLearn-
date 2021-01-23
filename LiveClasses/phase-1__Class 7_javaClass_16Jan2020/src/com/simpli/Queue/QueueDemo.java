package com.simpli.Queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Deque;
public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> nameQueue = new LinkedList<>();
		nameQueue.add("priyanka");
		nameQueue.add("priya");
		nameQueue.add("divya");
		nameQueue.add("rani");
		nameQueue.add("komal");
		nameQueue.add("Ramesh");
		nameQueue.add("Adi");
		nameQueue.add("Nitya");
		nameQueue.add("Tanvi");
		nameQueue.add("keshav");
		System.out.println("Queue:: "+nameQueue);
		System.out.println("head of the Queue:: "+nameQueue.peek());// element()  ,peek() returns head of the queue
		nameQueue.remove(); //throws exception , poll() - removes all element but returns null for empty key
		System.out.println("head of the Queue:: "+nameQueue.element());// element()  ,peek() returns head of the queue
		System.out.println("Queue after remove():: "+nameQueue);
		System.out.println("head of the Queue:: "+nameQueue.peek());// element()  ,peek() returns head of the queue
		System.out.println("Size: "+nameQueue.size());
		nameQueue = new LinkedList<String>();
		
		System.out.println(nameQueue.poll());
		nameQueue.remove();

	}

}
