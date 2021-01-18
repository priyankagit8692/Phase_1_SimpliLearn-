package com.simpli.threads;

public class SynchronizationDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//step 1 - instantiate sender object
		Sender sender = new Sender();
		SenderThread senderThread1 = new SenderThread("hi", sender);
		SenderThread senderThread2 = new SenderThread("hello", sender);
		senderThread1.start();
		senderThread2.start();
		senderThread1.join();
		senderThread2.join();
		
	}

}
