package com.simpli.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		
		Queue<Integer> integerQueue = new PriorityQueue<Integer>();
		integerQueue.add(2);
		integerQueue.add(1);
		integerQueue.add(4);
		integerQueue.add(6);
		integerQueue.add(9);
		System.out.println(integerQueue);
		
		//peek returns the first elemet
		System.out.println("using peek method");
		System.out.println(integerQueue.peek());
		
		// poll return first elemet and remove the same element
		System.out.println("using poll method");
		System.out.println(integerQueue.poll());
		System.out.println(integerQueue.size());
		
		
	}

}
