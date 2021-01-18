package com.simpli.threads;

public class SenderThread extends Thread {

	private String message;
	private Sender sender;
	
	//constructor
	public SenderThread(String message, Sender sender) {
		this.message = message;
		this.sender = sender;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//sender.send(message); there is no synchronization both threads are tryiing to access send method
		synchronized (sender) {
			sender.send(message);
		}
	}
	

}
