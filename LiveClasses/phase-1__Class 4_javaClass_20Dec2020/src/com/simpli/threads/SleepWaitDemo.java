package com.simpli.threads;

public class SleepWaitDemo {
	private static Object LOCK = new Object();

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		System.out.println("Thread '"+Thread.currentThread().getName()+"'"+"is woken after 2 sec");
		synchronized (LOCK) {
			LOCK.wait(3000);
			System.out.println("Thread '"+Thread.currentThread().getName()+"'"+"is woken after 3 sec");

		}
	}

}
