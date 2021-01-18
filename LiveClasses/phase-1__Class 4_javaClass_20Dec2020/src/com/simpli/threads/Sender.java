package com.simpli.threads;

public class Sender {
	public void send(String message) {
		System.out.println("Sending\t"+message);
		try {
			Thread.sleep(2000);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("\n"+message+"Sent");
	}

}
