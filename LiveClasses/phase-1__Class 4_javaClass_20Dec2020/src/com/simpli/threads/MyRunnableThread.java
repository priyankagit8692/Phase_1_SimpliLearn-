package com.simpli.threads;

public class MyRunnableThread implements Runnable{

	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("inside run method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnableThread myRunnableThread = new MyRunnableThread();
		Thread thread = new Thread(myRunnableThread);
		thread.start();

	}
}
