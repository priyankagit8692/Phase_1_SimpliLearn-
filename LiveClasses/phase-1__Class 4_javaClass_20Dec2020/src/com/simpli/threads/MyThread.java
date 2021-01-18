package com.simpli.threads;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("Current Thread:"+Thread.currentThread());
		System.out.println("Inside run method");
	}
	
	public static void main(String[] args) {
		System.out.println("Active count:"+Thread.activeCount());
		System.out.println("Current Thread:"+Thread.currentThread());
		MyThread myThread = new MyThread();
		myThread.setName("myThread");
		myThread.setPriority(10);
		myThread.start();
		System.out.println("Active count:"+Thread.activeCount());
		System.out.println("Active count:"+Thread.activeCount());
	}
}
