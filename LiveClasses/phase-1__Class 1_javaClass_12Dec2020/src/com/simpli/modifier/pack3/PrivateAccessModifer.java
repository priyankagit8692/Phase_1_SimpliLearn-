package com.simpli.modifier.pack3;

public class PrivateAccessModifer {
	private void welcome() {
		System.out.println("Private Welcome");
	}
	
	public static void main(String[] args) {
		PrivateAccessModifer pri = new PrivateAccessModifer();
		pri.welcome();
	}

}
